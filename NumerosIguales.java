/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Unidad1.EjerciciosParte1;
import java.util.Scanner;

public class NumerosIguales {
    public static void main(String[] args) {
    
        int n1,n2;
    
    Scanner entrada= new Scanner (System.in) ;
    
    System.out.print ("Introduce un numero:");
    n1= entrada.nextInt();
    
    System.out.print ("Introduce un numero:");
    n2= entrada.nextInt();
    
    if (n1==n2) {
            System.out.print ("Son Iguales"); 
    }
    else{
            System.out.print ("No Son Iguales");     
    }
    }
}
