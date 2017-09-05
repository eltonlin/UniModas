/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import ClassesBasicas.Vendedor;
import Interfaces.InterVendedor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author elton
 */
public class DaoVendedor extends DaoConexao implements InterVendedor
{

    @Override
    public void cadastraVendedor(Vendedor vendedor) throws Exception {
        String sql = "INSERT INTO vendedor(cpf_vendedor, nome_vendedor, data_nasc_vendedor, salario)"
                + " VALUES (?,?,?,?)";
        
        PreparedStatement stmt = connect().prepareStatement(sql);
        stmt.setString(1, vendedor.getCpfVendedor());
        stmt.setString(2, vendedor.getNomeVendedor());
        stmt.setString(3, vendedor.getDataNascVendedor());      
        stmt.setFloat(4, vendedor.getSalario());
        stmt.execute();
        stmt.close();
        desconectar();
         
    }

    @Override
    public ArrayList<Vendedor> listarVendedor() throws Exception {
        String sql = "SELECT * FROM vendedor";
        ArrayList<Vendedor> arrayVendedor = new ArrayList<Vendedor>();
        PreparedStatement stmt = connect().prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        
        while(rs.next()){
            Vendedor vendedor = new Vendedor();
            vendedor.setCodVendedor(rs.getInt("cod_vendedor"));
            vendedor.setCpfVendedor(rs.getString("cpf_vendedor"));
            vendedor.setNomeVendedor(rs.getString("nome_vendedor"));
            vendedor.setDataNascVendedor(rs.getString("data_nasc_vendedor"));            
            vendedor.setSalario(rs.getFloat("salario"));            
            arrayVendedor.add(vendedor);
        }
        rs.close();
        stmt.close();
        desconectar();
        return arrayVendedor;
        
    }
    
    public ArrayList<Vendedor> pesquisarVendedor(Vendedor v) throws Exception {
        String sql = "SELECT * FROM Vendedor WHERE nome_vendedor LIKE '%" + v.getNomeVendedor() + "%'  " ;
        ArrayList<Vendedor> arrayVendedor = new ArrayList<Vendedor>();
        PreparedStatement stmt = connect().prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();       
        while(rs.next()){
            Vendedor vendedor = new Vendedor();           
            vendedor.setCodVendedor(rs.getInt("cod_vendedor"));
            vendedor.setCpfVendedor(rs.getString("cpf_vendedor"));
            vendedor.setNomeVendedor(rs.getString("nome_vendedor"));
            vendedor.setDataNascVendedor(rs.getString("data_nasc_vendedor"));            
            vendedor.setSalario(rs.getFloat("salario"));            
            arrayVendedor.add(vendedor);
        }
        rs.close();
        stmt.close();
        desconectar();
        return arrayVendedor;
        
    }

    @Override
    public void deletarVendedor(Vendedor vendedor) throws Exception {
        String sql = "DELETE FROM vendedor Where cod_vendedor = ?" ;
        PreparedStatement stmt = connect().prepareStatement(sql);
        stmt.setInt(1, vendedor.getCodVendedor());
        stmt.executeUpdate();
        stmt.close();
        desconectar();
            
    }

    @Override
    public void alterarVendedor(Vendedor vendedor) throws Exception {
       String sql ="UPDATE vendedor SET cpf_vendedor = ? , nome_vendedor = ?, data_nasc_vendedor = ?, "
               + " salario = ? WHERE cod_vendedor = ? " ;
       
       PreparedStatement stmt = connect().prepareStatement(sql);
       stmt.setString(1, vendedor.getCpfVendedor());
        stmt.setString(2, vendedor.getNomeVendedor());
        stmt.setString(3, vendedor.getDataNascVendedor());        
        stmt.setFloat(4, vendedor.getSalario());
        stmt.setInt(5, vendedor.getCodVendedor());
         stmt.execute();
         stmt.close();
         desconectar();
       
       
    }
    
}
