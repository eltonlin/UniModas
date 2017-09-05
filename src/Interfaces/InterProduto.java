/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import ClassesBasicas.Produto;
import java.util.ArrayList;

/**
 *
 * @author elton
 */
public interface InterProduto {
    void cadastraProduto(Produto p) throws Exception;
    ArrayList<Produto> listarProduto() throws Exception;
    void deletarProduto(Produto p) throws Exception;
    void alterarProduto(Produto p) throws Exception;
    ArrayList<Produto> pesquisarProduto(Produto p) throws Exception;
    
}
