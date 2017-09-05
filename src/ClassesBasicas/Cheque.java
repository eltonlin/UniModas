/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesBasicas;

/**
 *
 * @author elton
 */
public class Cheque extends Pagamento {
    private String nomeTitular;
    private String nrBanco;
    private String nrConta;
    private String nrAgencia;
    
    public Cheque(){
        
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
     * @return the nrBanco
     */
    public String getNrBanco() {
        return nrBanco;
    }

    /**
     * @param nrBanco the nrBanco to set
     */
    public void setNrBanco(String nrBanco) {
        this.nrBanco = nrBanco;
    }

    /**
     * @return the nrConta
     */
    public String getNrConta() {
        return nrConta;
    }

    /**
     * @param nrConta the nrConta to set
     */
    public void setNrConta(String nrConta) {
        this.nrConta = nrConta;
    }

    /**
     * @return the nrAgencia
     */
    public String getNrAgencia() {
        return nrAgencia;
    }

    /**
     * @param nrAgencia the nrAgencia to set
     */
    public void setNrAgencia(String nrAgencia) {
        this.nrAgencia = nrAgencia;
    }
    
    
}
