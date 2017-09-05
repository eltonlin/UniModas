/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import ClassesBasicas.Cheque;
import Interfaces.InterCheque;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author elton
 */
public class DaoCheque extends DaoConexao implements InterCheque {

    @Override
    public void cadastrarCheque(Cheque c) throws Exception {
        String sql = "INSERT INTO cheque(cod_pagamento, nome_titular, nr_banco , nr_conta, nr_agencia) "
                + " VALUES(?,?,?,?,?)" ;
        
        PreparedStatement stmt = connect().prepareStatement(sql);
        stmt.setInt(1, c.getCodPagamento());       
        stmt.setString(2, c.getNomeTitular());
        stmt.setString(3, c.getNrBanco());
        stmt.setString(4, c.getNrConta());
        stmt.setString(5, c.getNrAgencia());   
        stmt.execute();
        stmt.close();
        desconectar();
    }

    @Override
    public ArrayList<Cheque> arrayCheque() throws Exception {
        ArrayList<Cheque> retorno = new ArrayList<Cheque>();
        Cheque c = new Cheque();
            String sql = "SELECT c.cod_pagamento, c.nome_titular, c.nr_banco, c.nr_conta, c.nr_agencia,  "
                + " p.data_pagamento, p.valor_pagamento FROM cheque as c"
                + " INNER JOIN pagamento as p ON p.cod_pagamento = c.cod_pagamento  " ;
        
        PreparedStatement stmt = connect().prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()){
            c.setCodPagamento(rs.getInt("c.cod_pagamento"));            
            c.setNomeTitular(rs.getString("c.nome_titular"));
            c.setNrBanco(rs.getString("c.nr_banco"));
            c.setNrConta(rs.getString("c.nr_conta"));
            c.setNrAgencia(rs.getString("c.nr_agencia"));
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
