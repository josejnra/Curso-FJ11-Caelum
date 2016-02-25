/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao.banco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jose
 */
public class CarroDao {
    
    //a conexao com o banco de dados
    private Connection conexao;
    
    public CarroDao(){
        this.conexao = new ConnectionFactory().getConnection();
        System.out.println("Conexao aberta!");
    }
    
    public void adiciona(Carro carro){
        
        //Comando SQL que devera ser executada
        String sql = "INSERT INTO carros"+
                "(montadora, modelo, versao, cilindrada, combustivel) "+
                "VALUES(?,?,?,?,?)";
        try {
            
            //Prepara o comando para usar no banco
            PreparedStatement stmt = conexao.prepareStatement(sql);

            //set os valores de ? na consulta
            stmt.setString(1, carro.getMontadora());
            stmt.setString(2, carro.getModelo());
            stmt.setString(3, carro.getVersao());
            stmt.setInt(4, carro.getCilindrada());
            stmt.setString(5, carro.getCombustivel());

            //executa a insercao
            stmt.execute();
            //fecha o statement
            stmt.close();

            System.out.println("Gravado!");
        
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void fechaConexao() throws SQLException{
        this.conexao.close();
        System.out.println("Conexao encerrada!");
    }
    
    public List<Carro> getLista(){
        try {            
            //lista que sera retornada com a pesquisa do banco
            List<Carro> lista = new ArrayList<>();
            
            //Query a ser usada
            String sql = "SELECT * FROM carros";
            
            //Prepared Statement
            PreparedStatement stmt = this.conexao.prepareStatement(sql);
            
            //Varial que ira armazenar o resultado da query, do tipo ResultSet
            //como ira retornar algo, usa se executeQuery
            ResultSet r = stmt.executeQuery();
            
            //iterar o resultado e adicionando na lista os dados
            while(r.next()){
                //Criando o objeto
                Carro c = new Carro(); 
                c.setId(r.getInt(1));
                c.setMontadora(r.getString(2));
                c.setModelo(r.getString(3));
                c.setVersao(r.getString(4));
                c.setCilindrada(r.getInt(5));
                c.setCombustivel(r.getString(6));
                
                //adicionando a lista
                lista.add(c);
            }
            
            //fechando tudo que pode, exceto a conexao
            r.close();
            stmt.close();
            return lista;
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public Carro getCarro(int indice){
        try {
            String sql = "SELECT * FROM carros WHERE idcarros = " + indice;
            Carro c = new Carro();
            
            //try-catch-with-resources 
            PreparedStatement stmt = this.conexao.prepareStatement(sql);
            
            ResultSet resultado = stmt.executeQuery();
            
            while(resultado.next()){
                c.setId(resultado.getInt(1));
                c.setMontadora(resultado.getString(2));
                c.setModelo(resultado.getString(3));
                c.setVersao(resultado.getString(4));
                c.setCilindrada(resultado.getInt(5));
                c.setCombustivel(resultado.getString(6));
            }
            return c;
            
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
