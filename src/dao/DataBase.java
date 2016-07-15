package dao;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {
       
    public Connection conexao = null;
    private final String DRIVER = "com.mysql.jdbc.Driver";
    private final String URL = "jdbc:mysql://localhost:3306/";
    private final String BANCO = URL + "db_banco_senac";
    private final String USUARIO = "root";
    private final String SENHA = "SENAC";
        
    public boolean connect() {
        try {
            Class.forName(DRIVER);
            conexao = DriverManager.getConnection(BANCO,USUARIO,SENHA);
            System.out.println("CONECTOU");
            return true;
        } catch (ClassNotFoundException erro){
            System.out.println("DRIVER NÃO ENCRONTRADO");
            System.out.println("ERRO: " + erro);
            return false;
        } catch (SQLException erro){
            System.out.println("PROBLEMAS COMN A CONCECAO");
            System.out.println("ERRO: " + erro);
            return false;
        }
    }
    
    public void disconnect() {  
        try {
            conexao.close();
            System.out.println("DESCONECTOU");
        } catch (SQLException erro){
            System.out.println("PROBLEMAS COM A DESCONEXAO");
            System.out.println("ERRO: " + erro);
        }
    }
       
}
