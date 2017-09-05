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
public class ItemProduto {
    private Compra compra;
    private Produto codProduto;
    private int quantidade;
    private float preco;
    
    public ItemProduto(){
        
    }

    /**
     * @return the nfCompra
     */
    public Compra getNfCompra() {
        return compra;
    }

    /**
     * @param nfCompra the nfCompra to set
     */
    public void setNfCompra(Compra nfCompra) {
        this.compra = nfCompra;
    }

    /**
     * @return the codProduto
     */
    public Produto getCodProduto() {
        return codProduto;
    }

    /**
     * @param codProduto the codProduto to set
     */
    public void setCodProduto(Produto codProduto) {
        this.codProduto = codProduto;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the preco
     */
    public float getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    
    
}
