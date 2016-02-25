/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import Contas.Banco.Conta;
import Contas.Banco.ContaCorrente;
import Contas.Banco.ContaPoupanca;


/**
 *
 * @author jose
 */
public class Principal {
        
    public static void main (String[] args) throws Exception{
        Banco b = Banco.getInstance();
        
        ContaCorrente c1 = new ContaCorrente();
        c1.setNumero(10);
        c1.setNome("jose");
        
        ContaPoupanca c2 = new ContaPoupanca();
        c2.setNumero(2);
        c2.setNome("antonio");
        
        
        b.adiciona(c1);
        b.adiciona(c2);
        
        for(Conta a : b.conta()){
            System.out.println(a);
        }
        
        String nome = "josefdsafd";
        Conta procurar = b.buscaPorNome(nome);
        
        if(procurar != null)
            System.out.println("Conta de: "+ procurar.getNome() +"\tnumero: "+ procurar.getNumero());
        else
            System.out.println("Usuario: "+ nome +" nao encontrado!" );
    } 
}
