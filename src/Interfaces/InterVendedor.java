/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import ClassesBasicas.Vendedor;
import java.util.ArrayList;

/**
 *
 * @author elton
 */
public interface InterVendedor {
    void cadastraVendedor(Vendedor vendedor) throws Exception;
    ArrayList<Vendedor> listarVendedor() throws Exception;
    void deletarVendedor(Vendedor vendedor) throws Exception;
    void alterarVendedor(Vendedor vendedor) throws Exception;
    ArrayList<Vendedor> pesquisarVendedor(Vendedor v) throws Exception;
}
