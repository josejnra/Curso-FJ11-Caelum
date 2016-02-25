/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ordenacao;

import Contas.Banco.ContaPoupanca;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author jose
 */
public class TestaOrdenacao {
    public static void main (String[] args){
        List<ContaPoupanca> contas = new LinkedList<>();
        
        Random a = new Random();
        int i;
        
        for(i = 0; i < 10; i++){
            ContaPoupanca c = new ContaPoupanca();
            c.setNumero(a.nextInt(2000));
            
            contas.add(c);
        }
        
        System.out.println(contas);
        
        Collections.sort(contas);
        System.out.println(contas);
        
        
    }
}
