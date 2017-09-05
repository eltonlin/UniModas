/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import ClassesBasicas.Compra;
import ClassesBasicas.ListaItens;
import Interfaces.InterListaItens;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author elton
 */
public class DaoListaItens extends DaoConexao implements InterListaItens{
    Compra c = new Compra() ;
    @Override
    public void cadastraListaItens(ArrayList<ListaItens> lista) throws Exception {
        String sql = "INSERT INTO lista_itens(nf_compra, cod_produto, quantidade, preco)"
                + " VALUES (?,?,?,?)  " ;
        DaoCompra daoc = new DaoCompra();
        c.setNfCompra(daoc.nfCompra());
        
        PreparedStatement stmt = connect().prepareStatement(sql);
        for (ListaItens l : lista) {
        stmt.setInt(1, c.getNfCompra());
        stmt.setInt(2, l.getProduto().getCodProduto());
        stmt.setInt(3, l.getQuantidade());
        stmt.setFloat(4, l.getPreco());
        stmt.execute();        
        }
        stmt.close();
        desconectar();
        
        }
        
    }
    

