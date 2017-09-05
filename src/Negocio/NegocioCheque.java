/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import ClassesBasicas.Cheque;
import Dao.DaoCheque;
import Interfaces.InterCheque;
import java.util.ArrayList;

/**
 *
 * @author elton
 */
public class NegocioCheque implements InterCheque {

    @Override
    public void cadastrarCheque(Cheque c) throws Exception {
        if(c == null){
            throw new Exception ("Instanciar cheque");
        }
        if(c.getCodPagamento() < 0){
            throw new Exception (" código menor que 0");
        }
        if(c.getNomeTitular() == null || c.getNomeTitular().trim().equals("")){
            throw new Exception ("Informe o nome do títular");            
        }
        if(c.getNrAgencia() == null || c.getNrAgencia().length() > 15 ){
            throw new Exception ("Informe número da agência menor que 15 caracteres");
        }
        if(c.getNrBanco()== null || c.getNrBanco().length() > 10 ){
            throw new Exception ("Informe número dO banco menor que 10 caracteres");
        }
        if(c.getNrConta() == null || c.getNrConta().length() > 20 ){
            throw new Exception ("Informe número da conta menor que 20 caracteres");
        }
        
        DaoCheque daoc = new DaoCheque();
        daoc.cadastrarCheque(c);
    }

    @Override
    public ArrayList<Cheque> arrayCheque() throws Exception {
        DaoCheque daoc = new DaoCheque();
        if(daoc.arrayCheque() == null){
            throw new Exception("Instancie a lista de cheque");
        }
        return daoc.arrayCheque();
    }
    
}
