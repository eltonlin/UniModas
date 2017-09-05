/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import ClassesBasicas.Pagamento;
import Interfaces.InterPagamento;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author elton
 */
public class DaoPagamento extends DaoConexao implements InterPagamento{

    @Override
    public void cadastraPagamento(Pagamento p) throws Exception {
        String sql = "INSERT INTO pagamento(data_pagamento, valor_pagamento)"
                + " VALUES (?, ? )";
        
        PreparedStatement stmt = connect().prepareStatement(sql);
        stmt.setString(1, p.getDataPagamento());
        stmt.setFloat(2, p.getValorPagamento());
        stmt.execute();
        stmt.close();
        desconectar();
        
    }

    @Override
    public ArrayList<Pagamento> listarPagamento() throws Exception {
        ArrayList<Pagamento> arrayPagamento = new ArrayList<Pagamento>();
        Pagamento p = new Pagamento();
        String sql = "SELECT * FROM pagamento";
        PreparedStatement stmt = connect().prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        
        while(rs.next()){
           p.setCodPagamento(rs.getInt("cod_pagamento"));
           p.setDataPagamento(rs.getString("data_pagamento"));
           p.setValorPagamento(rs.getFloat("valor_pagamento"));
           arrayPagamento.add(p);
        }
        rs.close();
        stmt.close();
        desconectar();
        return arrayPagamento;
        
        
    }
    
    public int codigoPagamento() throws Exception {
        String sql = "SELECT cod_pagamento from Pagamento";
        
        Pagamento p = new Pagamento();
        PreparedStatement stmt = connect().prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            p.setCodPagamento(rs.getInt("cod_pagamento"));
        }
        rs.close();
        stmt.close();
        desconectar();
        return p.getCodPagamento();
       
    }

   
    
}
