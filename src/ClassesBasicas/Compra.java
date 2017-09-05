/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesBasicas;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author elton
 */
public class Compra {

    private int nfCompra;
    private Cliente cliente;
    private Vendedor vendedor;    
    private TipoPagamento tipoPagamento;    
    private Pagamento pagamento;    

    public Compra() {
        this.cliente = new Cliente();
    }

    /**
     * @return the nfCompra
     */
    public int getNfCompra() {
        return nfCompra;
    }

    /**
     * @param nfCompra the nfCompra to set
     */
    public void setNfCompra(int nfCompra) {
        this.nfCompra = nfCompra;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the vendedor
     */
    public Vendedor getVendedor() {
        return vendedor;
    }

    /**
     * @param vendedor the vendedor to set
     */
    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    /**
     * @return the pagamento
     */
    public Pagamento getPagamento() {
        return pagamento;
    }

    /**
     * @param pagamento the pagamento to set
     */
    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    /**
     * @return the tipoPagamento
     */
    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    /**
     * @param tipoPagamento the tipoPagamento to set
     */
    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }    

    

}
