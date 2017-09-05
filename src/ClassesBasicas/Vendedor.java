/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesBasicas;

import java.util.Date;

/**
 *
 * @author elton
 */
public class Vendedor {
    
    private int codVendedor;
    private String cpfVendedor;
    private String nomeVendedor;
    private String dataNascVendedor;  
    private float salario;
    
    public Vendedor(){
        
    }

    /**
     * @return the nfCompra
     */
    public int getCodVendedor() {
        return codVendedor;
    }

    /**
     * @param nfCompra the nfCompra to set
     */
    public void setCodVendedor(int nfCompra) {
        this.codVendedor = nfCompra;
    }

    /**
     * @return the cpfVendedor
     */
    public String getCpfVendedor() {
        return cpfVendedor;
    }

    /**
     * @param cpfVendedor the cpfVendedor to set
     */
    public void setCpfVendedor(String cpfVendedor) {
        this.cpfVendedor = cpfVendedor;
    }

    /**
     * @return the nomeVendedor
     */
    public String getNomeVendedor() {
        return nomeVendedor;
    }

    /**
     * @param nomeVendedor the nomeVendedor to set
     */
    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

    /**
     * @return the dataNascVendedor
     */
    public String getDataNascVendedor() {
        return dataNascVendedor;
    }

    /**
     * @param dataNascVendedor the dataNascVendedor to set
     */
    public void setDataNascVendedor(String dataNascVendedor) {
        this.dataNascVendedor = dataNascVendedor;
    }

    
    public float getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
    
    
    
}
