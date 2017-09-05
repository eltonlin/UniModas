/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import ClassesBasicas.Pagamento;
import java.util.ArrayList;

/**
 *
 * @author elton
 */
public interface InterPagamento {
    void cadastraPagamento(Pagamento p) throws Exception;
    ArrayList<Pagamento> listarPagamento() throws Exception;
    public int codigoPagamento() throws Exception;
    
}
