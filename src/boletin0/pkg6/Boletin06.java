/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin0.pkg6;

/**
 *
 * @author oquintansocampo
 */
public class Boletin06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo rect1=new Rectangulo();
        Rectangulo rect2=new Rectangulo("azul",4,8);        
        //visualizo la base de los 2 rectangulos
        System.out.println("Color: "+rect1.color +" Base: "+rect1.getBase());
        System.out.println("Color: "+rect2.color +" Base: "+rect2.getBase());
        
        
               
    }
    
}
