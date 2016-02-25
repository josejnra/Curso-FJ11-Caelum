/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao.banco;

import java.sql.*;

/**
 *
 * @author jose
 */
public class ConnectionFactory {
    
    //Abrindo a conexao com o banco
    public Connection getConnection(){
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/Lista9deExercicios", "root","123");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
