/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import ClassesBasicas.Produto;
import Interfaces.InterProduto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author elton
 */

// PERGUNTAR SOBRE QUAL A MELHOR FORMA DE CADASTRAR NO BANCO DE DADOS, SE É COM O PREPARED STATEMENT OU COM O STATEMENT 

public class DaoProduto extends DaoConexao implements InterProduto {
    
    
  
    public void cadastraProduto(Produto p) throws Exception{
     
     String sql = "INSERT INTO Produto(tipo_produto, cor_produto, descricao_produto, tamanho_produto, valor_uni_produto)"
                + " VALUES(?,?,?,?,?)" ;
     
      
            
            PreparedStatement stmt = connect().prepareStatement(sql);
            stmt.setString(1, p.getTipoProduto());
            stmt.setString(2, p.getCorProduto());
            stmt.setString(3, p.getDescricaoProduto());
            stmt.setString(4, p.getTamanhoProduto());
            stmt.setFloat(5, p.getValorUnitarioProduto());
            stmt.execute();
            stmt.close();
            desconectar();
         
        
    }
    public ArrayList<Produto> listarProduto() throws Exception {
       
        ArrayList<Produto> produto = new ArrayList<Produto>();
        String Sql = "SELECT * FROM Produto"; 
        PreparedStatement stmt = connect().prepareStatement(Sql);
        ResultSet rs = stmt.executeQuery();
        
        while(rs.next()){
            Produto p = new Produto();
            p.setCodProduto(rs.getInt("cod_produto"));
            p.setTipoProduto(rs.getString("tipo_produto"));
            p.setCorProduto(rs.getString("cor_produto"));
            p.setDescricaoProduto(rs.getString("descricao_produto"));
            p.setTamanhoProduto(rs.getString("tamanho_produto"));
            p.setValorUnitarioProduto(rs.getFloat("valor_uni_produto"));
            produto.add(p);
        }
        rs.close();
        stmt.close();
        desconectar();
        return produto ;
        
       
    } 
    
    public void deletarProduto(Produto p) throws Exception {
       String sql = "DELETE FROM Produto WHERE cod_produto = ? " ;
       

            PreparedStatement stmt = connect().prepareStatement(sql);
            stmt.setInt(1, p.getCodProduto());
            stmt.executeUpdate();
            stmt.close();
            desconectar();
            
       
       
    }
    
    
    public void alterarProduto(Produto p) throws Exception {
        String sql = " UPDATE produto SET tipo_produto = ? , cor_produto = ?, "
                + " descricao_produto = ?, tamanho_produto = ?, valor_uni_produto = ? "
                + " WHERE cod_produto = ? ";

        PreparedStatement stmt = connect().prepareStatement(sql);
        stmt.setString(1, p.getTipoProduto());
        stmt.setString(2, p.getCorProduto());
        stmt.setString(3, p.getDescricaoProduto());
        stmt.setString(4, p.getTamanhoProduto());
        stmt.setFloat(5, p.getValorUnitarioProduto());
        stmt.setInt(6, p.getCodProduto());
        stmt.executeUpdate();
        stmt.close();
        desconectar();
        

    }
    
    public ArrayList<Produto> pesquisarProduto(Produto p) throws Exception {
        String sql = "SELECT * FROM Produto WHERE tipo_produto LIKE '%" + p.getTipoProduto() + "%'  " ;
        ArrayList<Produto> arrayProduto = new ArrayList<Produto>();
        PreparedStatement stmt = connect().prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();       
        while(rs.next()){
            Produto produto = new Produto();           
            produto.setCodProduto(rs.getInt("cod_produto"));
            produto.setTipoProduto(rs.getString("tipo_produto"));
            produto.setCorProduto(rs.getString("cor_produto"));
            produto.setDescricaoProduto(rs.getString("descricao_produto"));
produto.setTamanhoProduto(rs.getString("tamanho_produto"));            
            produto.setValorUnitarioProduto(rs.getFloat("valor_uni_produto"));            
            arrayProduto.add(produto);
        }
        rs.close();
        stmt.close();
        desconectar();
        return arrayProduto;
        
    }


    
    
    
}
