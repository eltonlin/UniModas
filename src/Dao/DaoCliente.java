/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import ClassesBasicas.Cliente;
import ClassesBasicas.Produto;
import Interfaces.InterCliente;
import java.sql.PreparedStatement;

/**
 *
 * @author elton
 */
public class DaoCliente extends DaoConexao implements InterCliente {

    @Override
    public void cadastrarCliente(Cliente c) throws Exception {
         String sql = "INSERT INTO Cliente(cpf_cliente, nome_cliente )"
                + " VALUES(?,?)" ;        
            
            PreparedStatement stmt = connect().prepareStatement(sql);
            stmt.setString(1, c.getCpf() );
            stmt.setString(2, c.getNomeCliente());            
            stmt.execute();
            stmt.close();
            desconectar();
    }

    
    
}
