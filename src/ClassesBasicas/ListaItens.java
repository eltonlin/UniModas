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
public class ListaItens {
    private Compra compra;
    private Produto produto;
    private int quantidade;
    private float preco;
    
    public ListaItens(){
        
    }

    /**
     * @return the nfCompra
     */
    public Compra getCompra() {
        return compra;
    }

    /**
     * @param nfCompra the nfCompra to set
     */
    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    /**
     * @return the codProduto
     */
    public Produto getProduto() {
        return produto;
    }

    /**
     * @param codProduto the codProduto to set
     */
    public void setProduto(Produto produto) {
        this.produto = produto;
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
