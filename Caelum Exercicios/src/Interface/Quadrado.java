/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author jose
 */
public class Quadrado implements AreaCalculavel{

    private int lado;
    
    public Quadrado(int lado){
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }
    
    @Override
    public double calculaArea(){
        return lado*lado;
    }
    
}
