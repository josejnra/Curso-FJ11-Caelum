/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caelum.exercicios;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.*;
/**
 *
 * @author jose
 */
public class CaelumExercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        
        int a = 1000;
        Random b = new Random();
        
        for ( int c = 0; c < a; c++){
            list.add(b.nextInt(10));
        }
        
        
        list.sort(new Comparator<Integer>(){

            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 > o2)
                    return -1;
                if(o2 > o1)
                    return 1;
                return 0;
            }
            
        });
        
        System.out.println(list);
    }
}
