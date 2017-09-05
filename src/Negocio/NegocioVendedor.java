/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import ClassesBasicas.Vendedor;
import Dao.DaoVendedor;
import Interfaces.InterVendedor;
import java.util.ArrayList;

/**
 *
 * @author elton
 */
public class NegocioVendedor implements InterVendedor{

    @Override
    public void cadastraVendedor(Vendedor vendedor) throws Exception {
        if (vendedor == null){
            throw new Exception ("Vendedor não estanciado ");
        }
        if(vendedor.getCpfVendedor().length() < 11 || vendedor.getCpfVendedor().length() > 11){
            throw new Exception ("CPF com menos de 11 números ou maior que 11 números");
        }
        if(vendedor.getDataNascVendedor().trim().equals("") || vendedor.getDataNascVendedor() == null){
            throw new Exception ("Informe uma data");
        }
        if (vendedor.getNomeVendedor().trim().equals("") || vendedor.getNomeVendedor() == null){
            throw new Exception ("Informe o nome do vendedor");
        }
        if (vendedor.getSalario() <= 0  ){
            throw new Exception ("Informe o salário do funcionário");
        }
        
        DaoVendedor daov = new DaoVendedor();
        daov.cadastraVendedor(vendedor);
        
    }

    @Override
    public ArrayList<Vendedor> listarVendedor() throws Exception {
        
        DaoVendedor daov = new DaoVendedor();
        if (daov.listarVendedor() == null){
            throw new Exception ("Instanciar a lista de vendedores");
        }
        return daov.listarVendedor();
    }

    @Override
    public void deletarVendedor(Vendedor vendedor) throws Exception {
        if(vendedor == null){
            throw new Exception ("Instaciar vendedor");            
        }
        if(vendedor.getCodVendedor() < 1000 ){
            throw new Exception ("Informe código válido");
        }
        DaoVendedor daov = new DaoVendedor();
        daov.deletarVendedor(vendedor);
    }

    @Override
    public void alterarVendedor(Vendedor vendedor) throws Exception {
        if (vendedor == null){
            throw new Exception ("Vendedor não estanciado ");
        }
        if(vendedor.getCpfVendedor().length() < 11){
            throw new Exception ("CPF com menos de 11 números");
        }
        if(vendedor.getDataNascVendedor().trim().equals("") || vendedor.getDataNascVendedor() == null){
            throw new Exception ("Informe uma data");
        }
        if (vendedor.getNomeVendedor().trim().equals("") || vendedor.getNomeVendedor() == null){
            throw new Exception ("Informe o nome do vendedor");
        }
        if (vendedor.getSalario() < 0  ){
            throw new Exception ("Informe o salário do funcionário");
        }
        
        DaoVendedor daov = new DaoVendedor();
        daov.alterarVendedor(vendedor);
    }
    
  public ArrayList<Vendedor> pesquisarVendedor(Vendedor v) throws Exception{
      if (v == null){
          throw new Exception ("Instancie algum vendedor ");
          
      }
      if (v.getNomeVendedor() == null || v.getNomeVendedor().trim().equals("")){
          throw new Exception ("Preencha o nome do vendedor ");
      }
      DaoVendedor daov = new DaoVendedor();
      return daov.pesquisarVendedor(v);
  }
    
    
}
