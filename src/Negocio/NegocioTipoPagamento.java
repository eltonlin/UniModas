/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import ClassesBasicas.TipoPagamento;
import Dao.DaoTipoPagamento;
import Interfaces.InterTipoPagamento;
import java.util.ArrayList;

/**
 *
 * @author elton
 */
public class NegocioTipoPagamento implements InterTipoPagamento {

    @Override
    public ArrayList<TipoPagamento> listarTipoPagamento() throws Exception {
       DaoTipoPagamento daotp = new DaoTipoPagamento();
        return  daotp.listarTipoPagamento();
    }
    
}
