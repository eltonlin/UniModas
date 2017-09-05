/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import ClassesBasicas.Compra;
import Dao.DaoCompra;
import Interfaces.InterCompra;
import java.util.ArrayList;

/**
 *
 * @author elton
 */
public class NegocioCompra implements InterCompra{

    @Override
    public void cadastraCompra(Compra c) throws Exception {
        if(c == null){
            throw new Exception ("Instancie uma compra");            
        }
        DaoCompra daoc = new DaoCompra();
        daoc.cadastraCompra(c);
    }

    @Override
    public ArrayList<Compra> arrayCompra() throws Exception {
        DaoCompra daoc = new DaoCompra();
        if (daoc.arrayCompra() == null) {
            throw new Exception ("Lista de compra vazia");
        }
        return daoc.arrayCompra();
    }

    @Override
    public int nfCompra() throws Exception {
        
        DaoCompra daoc = new DaoCompra();
        if (daoc.nfCompra() < 0) {
            throw new Exception("Nota da compra menor que 0");
        }
        
        return daoc.nfCompra();
    }
    
}
