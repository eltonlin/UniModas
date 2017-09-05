/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

import ClassesBasicas.Cartao;
import ClassesBasicas.Cheque;
import ClassesBasicas.Cliente;
import ClassesBasicas.Compra;
import ClassesBasicas.ListaItens;
import ClassesBasicas.Pagamento;
import ClassesBasicas.Produto;
import ClassesBasicas.TipoPagamento;
import ClassesBasicas.Vendedor;
import Interfaces.InterCartao;
import Interfaces.InterCheque;
import Interfaces.InterCliente;
import Interfaces.InterCompra;
import Interfaces.InterListaItens;
import Interfaces.InterPagamento;
import Interfaces.InterProduto;
import Interfaces.InterTipoPagamento;
import Interfaces.InterVendedor;
import Negocio.NegocioCartao;
import Negocio.NegocioCheque;
import Negocio.NegocioCliente;
import Negocio.NegocioCompra;
import Negocio.NegocioListaItens;
import Negocio.NegocioProduto;
import Negocio.NegocioTipoPagamento;
import java.util.ArrayList;
import negocio.NegocioVendedor;
import Negocio.NegocioPagamento;


/**
 *
 * @author elton
 */
public class Fachada implements InterProduto, InterCliente, InterTipoPagamento, InterVendedor, InterPagamento, InterCartao, InterCheque, InterCompra, InterListaItens {

    @Override
    public void cadastraProduto(Produto p) throws Exception {
        new NegocioProduto().cadastraProduto(p);
    }

    @Override
    public ArrayList<Produto> listarProduto() throws Exception {
        return new NegocioProduto().listarProduto();
                
    }

    @Override
    public void deletarProduto(Produto p) throws Exception {
         new NegocioProduto().deletarProduto(p);
    }

    @Override
    public void alterarProduto(Produto p) throws Exception {
        new NegocioProduto().alterarProduto(p);
    }

    @Override
    public void cadastrarCliente(Cliente c) throws Exception {
        new NegocioCliente().cadastrarCliente(c);
    }

    @Override
    public ArrayList<TipoPagamento> listarTipoPagamento() throws Exception {
        return new NegocioTipoPagamento().listarTipoPagamento();
    }

    @Override
    public void cadastraVendedor(Vendedor vendedor) throws Exception {
        new NegocioVendedor().cadastraVendedor(vendedor);
    }

    @Override
    public ArrayList<Vendedor> listarVendedor() throws Exception {
        return new NegocioVendedor().listarVendedor();
    }

    @Override
    public void deletarVendedor(Vendedor vendedor) throws Exception {
        new NegocioVendedor().deletarVendedor(vendedor);
    }

    @Override
    public void alterarVendedor(Vendedor vendedor) throws Exception {
        new NegocioVendedor().alterarVendedor(vendedor);
    }
    
     public ArrayList<Vendedor> pesquisarVendedor(Vendedor v) throws Exception{
         return new NegocioVendedor().pesquisarVendedor(v);
     }

    @Override
    public void cadastraPagamento(Pagamento p) throws Exception {
       new NegocioPagamento().cadastraPagamento(p);
    }

    @Override
    public ArrayList<Pagamento> listarPagamento() throws Exception {
        return new NegocioPagamento().listarPagamento();
    }

    @Override
    public int codigoPagamento() throws Exception {
        return new NegocioPagamento().codigoPagamento();
    }

    @Override
    public void cadastrarCartao(Cartao c) throws Exception {
       new NegocioCartao().cadastrarCartao(c);
    }

    @Override
    public ArrayList<Cartao> arrayCartao() throws Exception {
        return new NegocioCartao().arrayCartao();
    }

    @Override
    public void cadastrarCheque(Cheque c) throws Exception {
        new NegocioCheque().cadastrarCheque(c);
    }

    @Override
    public ArrayList<Cheque> arrayCheque() throws Exception {
        return new NegocioCheque().arrayCheque();
    }
    
    public ArrayList<Produto> pesquisarProduto(Produto p) throws Exception{
         return new NegocioProduto().pesquisarProduto(p);
     }

    @Override
    public void cadastraCompra(Compra c) throws Exception {
         new NegocioCompra().cadastraCompra(c);
    }

    @Override
    public ArrayList<Compra> arrayCompra() throws Exception {
        return new NegocioCompra().arrayCompra();
    }

    @Override
    public int nfCompra() throws Exception {
        return new NegocioCompra().nfCompra();
    }

    @Override
    public void cadastraListaItens(ArrayList<ListaItens> lista) throws Exception {
       new NegocioListaItens().cadastraListaItens(lista);
    }

   
    
}
