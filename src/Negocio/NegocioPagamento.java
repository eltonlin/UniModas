/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import ClassesBasicas.Pagamento;
import Dao.DaoPagamento;
import Interfaces.InterPagamento;
import java.util.ArrayList;

/**
 *
 * @author elton
 */
public class NegocioPagamento implements InterPagamento{

    @Override
    public void cadastraPagamento(Pagamento p) throws Exception {
        if(p == null){
            throw new Exception ("Instaciar pagamento");
        }
        if(p.getValorPagamento() <= 0 ){
            throw new Exception ("Informe um valor maior que 0");
        }
        if(p.getDataPagamento().length() != 10 || p.getDataPagamento() == null){
            throw new Exception ("Informe data válida");
        }
        
        DaoPagamento daop = new DaoPagamento();
        daop.cadastraPagamento(p);
    }

    @Override
    public ArrayList<Pagamento> listarPagamento() throws Exception {
        DaoPagamento daop = new DaoPagamento();
        if(daop.listarPagamento() == null ){
            throw new Exception ("Instancie um pagamento");
        }
        
        return daop.listarPagamento();
    }

    @Override
    public int codigoPagamento() throws Exception {      
        
        DaoPagamento daop = new DaoPagamento();
        return daop.codigoPagamento();
    }
    
}
