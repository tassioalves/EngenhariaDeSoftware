/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.contasapagar.FABRICA_CONEXAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Gustavo
 */
public class FabricaDeConexao {
    
    private static Connection conexao;
    private static String url = "jdbc:mysql://localhost:3306/bd_tabela_contas?useTimezone=true&serverTimezone=UTC&useSSL=false";
    private static String usuario ="root";
    private static String senha ="root";
    
    public static Connection getConexao() throws SQLException{
        if(conexao == null){
            conexao = DriverManager.getConnection(url,usuario, senha);
        }
        return conexao;
    }
}
