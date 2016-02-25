/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linhas.de.processo.thread;

/**
 *
 * @author jose
 */
public class Programa implements Runnable{
    private int id;

    public Programa(int id){
        this.id = id;
    }
    
    @Override
    public void run() {
        for(int a = 0; a < 10; a++){
            System.out.println("Programa : "+ id +" id : "+ a);
        }
    }
}
