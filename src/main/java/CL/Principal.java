/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CL;

import Frame.Interface;
import Frame.calculador;
import static java.lang.Integer.parseInt;
import static java.time.Clock.system;
import javax.swing.*;
/**
 *
 * @author Asus
 */
public class Principal {
    
    public static void main(String[]args){
        new Interface().setVisible(true);
        //new calculador().setVisible(true);
            /* String cadena = "100";
             String x="11";

             for(int i=2;i<=16;i++){
                 System.out.println(x+" de base "+i +" a base 10 es: "+ Integer.parseInt(x,i));
             }*/
    }
}
