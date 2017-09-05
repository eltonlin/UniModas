/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import ClassesBasicas.Cliente;
import Dao.DaoCliente;
import Interfaces.InterCliente;

/**
 *
 * @author elton
 */
public class NegocioCliente implements InterCliente {

    @Override
    public void cadastrarCliente(Cliente c) throws Exception {
        if(c.getCpf().length() != 11){
            throw new Exception ("Informe um cpf válido");            
        }
        
        if(c.getNomeCliente() == null || c.getNomeCliente().trim().equals("") == true) {
            throw new Exception ("Preencha o noem do Cliente");
        }
        
        DaoCliente daoc = new DaoCliente();
        daoc.cadastrarCliente(c);
    }
    
}
