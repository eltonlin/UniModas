/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import ClassesBasicas.Produto;
import Dao.DaoProduto;
import Interfaces.InterProduto;
import java.util.ArrayList;

/**
 *
 * @author elton
 */
public class NegocioProduto implements InterProduto{
   
    @Override
    public void cadastraProduto(Produto p) throws Exception {
        
        
        if(p == null ){
            throw new Exception("Instanciar o Produto");
        } 
        
        if(p.getTipoProduto() == null || p.getTipoProduto().trim().equals("") == true ){
            throw new Exception("Precha o campo Tipo do produto");
        }
        
        if(p.getCorProduto()== null || p.getCorProduto().trim().equals("") == true ){
            throw new Exception("Precha o campo Tipo do produto");
        }
        
        if(p.getDescricaoProduto() == null || p.getDescricaoProduto().trim().equals("") == true ){
            throw new Exception("Precha o campo Tipo do produto");
        }
       
        if(p.getTamanhoProduto().trim().equals("P") == false && p.getTamanhoProduto().trim().equals("M") == false && p.getTamanhoProduto().trim().equals("PP") == false && 
                p.getTamanhoProduto().trim().equals("G") == false && p.getTamanhoProduto().trim().equals("GG") == false){
           
            throw new Exception("Informe tamanho válido ");            
       
    }
        
         if(p.getValorUnitarioProduto() <= 0 ){
            throw new Exception("O valor tem que ser maior que 0 ");
        }
        DaoProduto daop = new DaoProduto();
        
        daop.cadastraProduto(p);
        
        
        }          
    

    @Override
    public ArrayList<Produto> listarProduto() throws Exception {
        
       DaoProduto daop = new DaoProduto();
       
       if(daop.listarProduto() == null){
           throw new Exception ("Instacie a lista de Produto");
       }
       
       return daop.listarProduto();
        
    }

    @Override
    public void deletarProduto(Produto p) throws Exception {
        if(p == null ){
            throw new Exception("Instanciar o Produto");
        } 
        
        if(p.getCodProduto() < 0 ){
            throw new Exception ("O setor não é válido");
        }
        
        DaoProduto daop = new DaoProduto();
        daop.deletarProduto(p);
    }

    @Override
    public void alterarProduto(Produto p) throws Exception {
          
        if(p == null ){
            throw new Exception("Instanciar o Produto");
        } 
        
        if(p.getTipoProduto() == null || p.getTipoProduto().trim().equals("") == true ){
            throw new Exception("Precha o campo Tipo do produto");
        }
        
        if(p.getCorProduto()== null || p.getCorProduto().trim().equals("") == true ){
            throw new Exception("Precha o campo Tipo do produto");
        }
        
        if(p.getDescricaoProduto() == null || p.getDescricaoProduto().trim().equals("") == true ){
            throw new Exception("Precha o campo Tipo do produto");
        }
       
        if(p.getTamanhoProduto().trim().equals("P") == false && p.getTamanhoProduto().trim().equals("M") == false && p.getTamanhoProduto().trim().equals("PP") == false && 
                p.getTamanhoProduto().trim().equals("G") == false && p.getTamanhoProduto().trim().equals("GG") == false){
           
            throw new Exception("Informe tamanho válido ");            
       
    }
        
         if(p.getValorUnitarioProduto() < 0 ){
            throw new Exception("O valor tem que ser maior que 0 ");
        }
        DaoProduto daop = new DaoProduto();
        daop.alterarProduto(p);
    }
    
    public ArrayList<Produto> pesquisarProduto(Produto p) throws Exception{
      if (p == null){
          throw new Exception ("Instancie algum produto ");
          
      }
      if (p.getTipoProduto() == null || p.getTipoProduto().trim().equals("")){
          throw new Exception ("Preencha o nome do produto ");
      }
      DaoProduto daop = new DaoProduto();
      return daop.pesquisarProduto(p);
      
    }
}
