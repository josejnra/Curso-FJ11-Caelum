/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

/**
 *
 * @author jose
 */
public class Exercicios {
    public static void main(String[] args){
        
        /*Teste de tempo gasto em cada tipo de estrutura de dados
        (HashSet, ArrayList, LinkedList, TreeSet), na inserção e na pesquisa*/
        
        System.out.println("Iniciando...");
        List<Integer> teste = new LinkedList<>();
        
        int tam = 30000;
        long inicio = System.currentTimeMillis();
        
        for(int a = 0; a < tam; a++){
            teste.add(a);
        }

        for (int a = 0; a < tam; a++){
            teste.contains(a);
        }

        long fim = System.currentTimeMillis();        
        long tempo = fim - inicio;
        System.out.println("Tempo gasto: "+tempo);
    }
}
