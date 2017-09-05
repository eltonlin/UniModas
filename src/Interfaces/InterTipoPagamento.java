/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import ClassesBasicas.TipoPagamento;
import java.util.ArrayList;

/**
 *
 * @author elton
 */
public interface InterTipoPagamento {
    ArrayList<TipoPagamento> listarTipoPagamento() throws Exception;
    
}
