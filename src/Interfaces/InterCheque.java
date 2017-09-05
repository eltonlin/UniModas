/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import ClassesBasicas.Cheque;
import java.util.ArrayList;

/**
 *
 * @author elton
 */
public interface InterCheque {
    
    void cadastrarCheque(Cheque c) throws Exception; 
    ArrayList<Cheque> arrayCheque() throws Exception ;  
    
    
}
