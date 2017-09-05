/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import ClassesBasicas.Cartao;
import Dao.DaoCartao;
import Interfaces.InterCartao;
import java.util.ArrayList;

/**
 *
 * @author elton
 */
public class NegocioCartao implements InterCartao{

    @Override
    public void cadastrarCartao(Cartao c) throws Exception {
        if(c == null){
            throw new Exception("Instancie um cartão");
        }
        if(c.getCodPagamento() <= 0 ){
            throw new Exception("Código menor que 0 ");            
        }
        if(c.getNomeTitular() == null || c.getNomeTitular().trim().equals("")){
            throw new Exception("Informe nome do titular");
        }
        if(c.getNrCartao().trim().length() != 16){
            throw new Exception ("Informe número do cartão com 16 caracteres");
        }
        if(c.getDataValidade().length() != 10){
            throw new Exception ("Informe data válida");
        }
        if(c.getCodSeguranca().length() != 3 ){
            throw new Exception ("Informe código com apenas 3 números");
        }
        if(c.getQuantidadeParcelas() <= 0 ){
            throw new Exception ("Informe quantidade maior que 0 ");
        }
        
        DaoCartao daoc = new DaoCartao();
        daoc.cadastrarCartao(c);
    }

    @Override
    public ArrayList<Cartao> arrayCartao() throws Exception {
       DaoCartao daoc = new DaoCartao();
       if(daoc.arrayCartao() == null){
           throw new Exception ("Instancie a lista do cartão");
       }
       return daoc.arrayCartao();
    }
    
}
