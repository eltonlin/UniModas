/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import ClassesBasicas.Cartao;
import java.util.ArrayList;

/**
 *
 * @author elton
 */
public interface InterCartao {
    
    void cadastrarCartao(Cartao c) throws Exception; 
    ArrayList<Cartao> arrayCartao() throws Exception ;  
    
    
}
