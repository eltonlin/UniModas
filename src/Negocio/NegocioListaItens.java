/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import ClassesBasicas.ListaItens;
import Dao.DaoListaItens;
import Interfaces.InterListaItens;
import java.util.ArrayList;

/**
 *
 * @author elton
 */
public class NegocioListaItens implements InterListaItens {

    @Override
    public void cadastraListaItens(ArrayList<ListaItens> lista) throws Exception {
        if (lista == null) {
            throw new Exception ("Lista de itens vazia");
        }
        for (ListaItens listaItens : lista) {
           if(listaItens.getQuantidade() <= 0){
              throw new Exception("Digite quantidade maior que 0") ;
           } 
        }
        
        for (ListaItens listaItens : lista) {
            if(listaItens.getPreco() <= 0){
                throw new Exception("Preço menor que 0");
            }
        }
        
        DaoListaItens daol = new DaoListaItens();
        daol.cadastraListaItens(lista);
    }
    
}
