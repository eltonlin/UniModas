/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import ClassesBasicas.Cartao;
import Interfaces.InterCartao;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author elton
 */
public class DaoCartao extends DaoConexao implements InterCartao {

    @Override
    public void cadastrarCartao(Cartao c) throws Exception {
        String sql = "INSERT INTO cartao(cod_pagamento, nr_cartao, nome_titular, data_validade, cod_seguranca, quantidade_parcelas) "
                + " VALUES(?,?,?,?,?,?)" ;
        
        PreparedStatement stmt = connect().prepareStatement(sql);
        stmt.setInt(1, c.getCodPagamento());
        stmt.setString(2, c.getNrCartao());
        stmt.setString(3, c.getNomeTitular());
        stmt.setString(4, c.getDataValidade());
        stmt.setString(5, c.getCodSeguranca());
        stmt.setInt(6, c.getQuantidadeParcelas());
        stmt.execute();
        stmt.close();
        desconectar();
    }

    @Override
    public ArrayList<Cartao> arrayCartao() throws Exception {
        ArrayList<Cartao> retorno = new ArrayList<Cartao>();
        Cartao c = new Cartao();
        String sql = "SELECT c.cod_pagamento, c.nr_cartao, c.nome_titular, c.data_validade, c.cod_seguranca,  "
                + " p.data_pagamento, p.valor_pagamento FROM cartao as c"
                + " INNER JOIN pagamento as p ON p.cod_pagamento = c.cod_pagamento  " ;
        
        PreparedStatement stmt = connect().prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()){
            c.setCodPagamento(rs.getInt("c.cod_pagamento"));
            c.setNrCartao(rs.getString("c.nr_cartao"));
            c.setNomeTitular(rs.getString("c.nome_titular"));
            c.setDataValidade(rs.getString("c.data_validade"));
            c.setCodSeguranca(rs.getString("c.cod_seguranca"));
            c.setDataPagamento(rs.getString("p.data_pagamento"));
            c.setValorPagamento(rs.getFloat("p.valor_pagamento"));
            retorno.add(c); 
        }
        rs.close();
        stmt.close();
        desconectar();
       return retorno; 
    }
    
}
