/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import ClassesBasicas.Compra;
import Interfaces.InterCompra;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author elton
 */
public class DaoCompra extends DaoConexao implements InterCompra {

    @Override
    public void cadastraCompra(Compra c) throws Exception {
        String sql = "INSERT INTO compra (cpf_cliente, cod_vendedor, cod_pagamento, cod_tipo_pagamento)"
                + " VALUES(?,?,?,?)" ;
        
        PreparedStatement stmt = connect().prepareStatement(sql);
        stmt.setString(1, c.getCliente().getCpf());
        stmt.setInt(2, c.getVendedor().getCodVendedor());
        stmt.setInt(3, c.getPagamento().getCodPagamento());
        stmt.setInt(4, c.getTipoPagamento().getCodTipoPagamento());        
        stmt.execute();
        stmt.close();
        desconectar();
        
        
        
    }

    @Override
    public ArrayList<Compra> arrayCompra() throws Exception {
        ArrayList<Compra> retorno = new ArrayList<Compra>();
        Compra c = new Compra();
        String sql = "SELECT * FROM compra";
        
        PreparedStatement stmt = connect().prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        
        while(rs.next()){
            c.setNfCompra(rs.getInt("nf_compra"));
            c.getCliente().setCpf(rs.getString("cpf_cliente"));
            c.getVendedor().setCodVendedor(rs.getInt("cod_vendedor"));
            c.getPagamento().setCodPagamento(rs.getInt("cod_pagamento"));
            c.getTipoPagamento().setCodTipoPagamento(rs.getInt("cod_tipo_pagamento"));                    
            retorno.add(c);            
        }
        rs.close();
        stmt.close();
        desconectar();
        
     
        
        
        return retorno ;
    }
    
    public int nfCompra() throws Exception {
        Compra c = new Compra();
        String sql = "SELECT MAX(nf_compra) as nf FROM COMPRA" ;
        PreparedStatement stmt = connect().prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            c.setNfCompra(rs.getInt("nf"));
        }
        
        return c.getNfCompra(); 
    }
    
}
