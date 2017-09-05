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
public class Cartao extends Pagamento {
    private String nrCartao;
    private String nomeTitular;
    private String dataValidade ;
    private String codSeguranca ;
    private int quantidadeParcelas;
    
    public Cartao(){
        
    }

    /**
     * @return the nrCartao
     */
    public String getNrCartao() {
        return nrCartao;
    }

    /**
     * @param nrCartao the nrCartao to set
     */
    public void setNrCartao(String nrCartao) {
        this.nrCartao = nrCartao;
    }

    /**
     * @return the nomeTitular
     */
    public String getNomeTitular() {
        return nomeTitular;
    }

    /**
     * @param nomeTitular the nomeTitular to set
     */
    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    /**
     * @return the dataValidade
     */
    public String getDataValidade() {
        return dataValidade;
    }

    /**
     * @param dataValidade the dataValidade to set
     */
    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    /**
     * @return the codSeguranca
     */
    public String getCodSeguranca() {
        return codSeguranca;
    }

    /**
     * @param codSeguranca the codSeguranca to set
     */
    public void setCodSeguranca(String codSeguranca) {
        this.codSeguranca = codSeguranca;
    }

    /**
     * @return the quantidadeParcelas
     */
    public int getQuantidadeParcelas() {
        return quantidadeParcelas;
    }

    /**
     * @param quantidadeParcelas the quantidadeParcelas to set
     */
    public void setQuantidadeParcelas(int quantidadeParcelas) {
        this.quantidadeParcelas = quantidadeParcelas;
    }
    
    
}
