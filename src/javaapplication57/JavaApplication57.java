/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication57;

import java.util.Scanner;

/**
 *
 * @author apenasampedro
 */
public class JavaApplication57 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
     int num1;
     int num2;
     Scanner teclado=new Scanner (System.in);
     num1=teclado.nextInt();
     num2=teclado.nextInt();
     System.out.println("Suma d dos numeros:"+(num1+num2));
     System.out.println("La multiplicacion:"+(num1*num2));
    }
    
}
