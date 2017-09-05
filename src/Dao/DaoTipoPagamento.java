/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;



import ClassesBasicas.TipoPagamento;
import Interfaces.InterTipoPagamento;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author elton
 */
public class DaoTipoPagamento extends DaoConexao implements InterTipoPagamento {

    @Override
    public ArrayList<TipoPagamento> listarTipoPagamento() throws Exception {
        ArrayList<TipoPagamento> retorno = new ArrayList<TipoPagamento>();
        String Sql = "SELECT cod_tipo_pagamento, desc_tipo_pagamento FROM tipo_pagamento"; 
        PreparedStatement stmt = connect().prepareStatement(Sql);
        ResultSet rs = stmt.executeQuery();
        
        while(rs.next()){
            TipoPagamento tp = new TipoPagamento();
            tp.setCodTipoPagamento(rs.getInt("cod_tipo_pagamento"));
            tp.setDescTipoPagamento(rs.getString("desc_tipo_pagamento"));
            retorno.add(tp);
        }
        rs.close();
        stmt.close();
        desconectar();
        return retorno ;
    }
    
}
