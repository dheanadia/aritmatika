/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmatika;

/**
 *
 * @author Bintang
 */
public class Pengurangan extends Number implements Operation{

    @Override
    public float operate(int x, int y) {
        return x-y; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void display() {
        System.out.println("Hasil pengurangan"+operate(x, y)); //To change body of generated methods, choose Tools | Templates.
    }
    
}
