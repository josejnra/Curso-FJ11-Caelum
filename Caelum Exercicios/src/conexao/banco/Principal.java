/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexao.banco;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author jose
 */
public class Principal {
    public static void main(String[] args) throws SQLException{
        
        //Dados para gravar
        Carro c = new Carro();
        c.setMontadora("Zord");
        c.setModelo("Mega");
        c.setVersao("Elite");
        c.setCilindrada(10000);
        c.setCombustivel("Uranio");
       
        //grave nessa conexao!!!
        CarroDao m = new CarroDao();
        
        //metodo elegante para insercao
//        m.adiciona(c);
        
        
        List<Carro> li = m.getLista();

        for (Carro contato : li) {
            System.out.print("Id Carro: " + contato.getId());
            System.out.print("; Montadora: " + contato.getMontadora());
            System.out.print("; Modelo: " + contato.getModelo());
            System.out.print("; Versao: " + contato.getVersao());
            System.out.print("; Cilindrada: " + contato.getCilindrada());
            System.out.println("; Combustivel: " + contato.getCombustivel());            
        }
        
        
        System.out.println(m.getCarro(1).getCilindrada());
        
        //fecha a conexao
        m.fechaConexao();
    }

}
