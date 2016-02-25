/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import Contas.Banco.Conta;
import Contas.Banco.ContaCorrente;
import Contas.Banco.ContaPoupanca;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author jose
 */
public class Teste {
    public static void main(String[] args){
        Set<Conta> t = new HashSet<>();
        
        ContaCorrente c1 = new ContaCorrente();
        c1.setNumero(1);
        
        ContaPoupanca c2 = new ContaPoupanca();
        c2.setNumero(1);
        
        t.add(c1);
        t.add(c2);
        
        
        Iterator<Conta> i = t.iterator();
        
        while(i.hasNext()){
            System.out.println(i.next());
        }
        
        
        if(c1.equals(c2))
            System.out.println("As contas sao iguais!!!");
    }
    
}
