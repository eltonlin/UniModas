/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import ClassesBasicas.Compra;
import java.util.ArrayList;

/**
 *
 * @author elton
 */
public interface InterCompra {
    
    void cadastraCompra(Compra c) throws Exception;
    ArrayList<Compra> arrayCompra() throws Exception; 
    int nfCompra() throws Exception;
    
}
