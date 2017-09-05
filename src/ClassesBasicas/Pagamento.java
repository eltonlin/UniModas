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
public class Pagamento {
    private int codPagamento;
    private String dataPagamento;
    private float valorPagamento;
    
    public Pagamento(){
        
    }

    /**
     * @return the codCOmpra
     */
    public int getCodPagamento() {
        return codPagamento;
    }

    /**
     * @param codCOmpra the codCOmpra to set
     */
    public void setCodPagamento(int codPagamento) {
        this.codPagamento = codPagamento;
    }

    /**
     * @return the dataPagamento
     */
    public String getDataPagamento() {
        return dataPagamento;
    }

    /**
     * @param dataPagamento the dataPagamento to set
     */
    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    /**
     * @return the valorPagamento
     */
    public float getValorPagamento() {
        return valorPagamento;
    }

    /**
     * @param valorPagamento the valorPagamento to set
     */
    public void setValorPagamento(float valorPagamento) {
        this.valorPagamento = valorPagamento;
    }
    
    
    
    
}
