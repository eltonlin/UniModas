/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import ClassesBasicas.Pagamento;
import ClassesBasicas.Produto;
import ClassesBasicas.TipoPagamento;
import Telas.Fachada;
import java.util.ArrayList;



/**
 *
 * @author elton
 */
public class TesteConexao {
    
    public static void main(String[] args) throws Exception {
        
        try {
            DaoConexao Con = new DaoConexao();
            Con.conectar();
            System.out.println("Conectado com sucesso ");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
      String a = "";
      Float b = Float.parseFloat(a);
      
      
      if(b == null) {
          System.out.println("Número vazio");
      } 
      else {
          System.out.println(b);
      }
        
        
       
        
    }
    
}
