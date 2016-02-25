/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collections;

import Contas.Banco.ContaPoupanca;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author jose
 */
public class Estruturas {
    public static void main(String[] args){
        /*Interface Set, ideia de conjunto*/
        Set<String> cargos = new TreeSet<>();
        cargos.add("Gerente");
        cargos.add("Diretor");
        cargos.add("Presidente");
        cargos.add("Secretária");
        cargos.add("Funcionário");
        cargos.add("Diretor"); // repetido!
        // imprime na tela todos os elementos
        System.out.println(cargos);
        
        /*Iterator para percorrer o conjunto*/
        Iterator<String> i = cargos.iterator();
        
        while(i.hasNext()){
            if(i.next().equals("Presidente")){
                i.remove();
                break;
            }
        }
        
        i = cargos.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        
        
        /*Interface Map, ideia de função, usa chaves e valores */
        Map<String, ContaPoupanca> mapa = new TreeMap<>();
        
        ContaPoupanca c1 = new ContaPoupanca();
        c1.setNumero(100);
        
        ContaPoupanca c2 = new ContaPoupanca();
        c2.setNumero(45);
        
        ContaPoupanca c3 = new ContaPoupanca();
        c3.setNumero(75);
        
        mapa.put("Conta 1", c1);
        mapa.put("Conta 2", c2);
        mapa.put("Conta 3", c3);
        
        
        /*Percorrer as chaves do Map, para percorrer os valores mude para "mapa.values().iterator" */
        Iterator<String> t = mapa.keySet().iterator();
        
        while(t.hasNext()){
            System.out.println(t.next());
        }
    
        
        /*Classe Properties, usa ideia de Map, com apenas String*/
        Properties teste = new Properties();
        teste.setProperty("login", "jose");
        teste.setProperty("log", "jo");
        
        System.out.println(teste.getProperty("login"));
        
        /*Percorrer o conjunto*/
        Iterator c = teste.values().iterator();
        
        while(c.hasNext()){
            System.out.println(c.next());
        }
    }
    
    
}
