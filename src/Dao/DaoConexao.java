/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author elton
 */
public class DaoConexao {

    private Statement stmt;
    private Connection conn; 
    
// TIRAR DÚVIDAS SOBRE COMO FUNCIONA A CLASSE PREPARED STATMENT E PORQUE ELE NÃO ESTAVA ABRINDO O BANCO QUANDO EU CHAMAVA O MÉTODO STATMENT conectarSqlServer
    public Connection connect() throws Exception{
       this.conectarSqlServer();
       return conn;
    }
  
     private java.sql.Statement conectarSqlServer() throws ClassNotFoundException, SQLException {
        String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        String url = "jdbc:sqlserver://ELTON\\SQLEXPRESS:1433;DatabaseName=uni_modas";
        String usuario = "sa";
        String senha = "8596247";
        Class.forName(driver);
        conn = DriverManager.getConnection(url, usuario, senha);
        stmt = conn.createStatement();
        return stmt;
        
    }
    public Statement conectar() throws ClassNotFoundException, SQLException {
        return this.conectarSqlServer(); 
    } 
    public void desconectar() throws SQLException {
        conn.close();
    }

    Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
