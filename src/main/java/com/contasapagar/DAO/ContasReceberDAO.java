/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.contasapagar.DAO;

import com.contasapagar.DATAMODEL.ContasReceber;
import com.contasapagar.FABRICA_CONEXAO.FabricaDeConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tássio
 */
public class ContasReceberDAO {

    private Connection conexao;

    public ContasReceberDAO() throws SQLException {
        conexao = FabricaDeConexao.getConexao();
    }
    

    /**
     *
     * @return
     */
    public List listarTodos() throws SQLException {
        String sql = "SELECT * FROM CONTAS_RECEBER";
        PreparedStatement ps = conexao.prepareStatement(sql);

        ResultSet rs = ps.executeQuery();

        List<ContasReceber> contas = new ArrayList<ContasReceber>();
        ContasReceber r;

        while (rs.next()) {
            r = new ContasReceber();
            r.setId(rs.getString("ID"));
            r.setNome(rs.getString("NOME"));
            r.setDescricao(rs.getString("DESCRIÇÃO"));
            r.setDataInicio(rs.getString("DATA_INICIO"));
            r.setDataVencimento(rs.getString("DATA_VENCIMENTO"));
            r.setValor(rs.getBigDecimal("VALOR"));

            contas.add(r);
        }

        return contas;
    }
    
    public void inserir(ContasReceber conta) throws SQLException{
         String sql = "INSERT INTO CONTAS_RECEBER"
                + " (NOME, DESCRIÇÃO, DATA_INICIO, DATA_VENCIMENTO, VALOR)"
                + " VALUES (?,?,?,?,?)";
        PreparedStatement ps = conexao.prepareStatement(sql);
        
        ps.setString(1, conta.getNome());
        ps.setString(2, conta.getDescricao());
        ps.setString(3, conta.getDataInicio());
        ps.setString(4, conta.getDataVencimento());
        ps.setBigDecimal(5, conta.getValor());
        ps.execute();
    }

}
