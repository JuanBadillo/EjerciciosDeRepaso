/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Unidad1.EjerciciosParte1;
import java.util.Scanner;

/**
 *
 * @author juanm
 */
public class Cicunferencia {
    public static void main(String[] args){
        
        double circunferencia, radio;
        Scanner scanner = new Scanner (System. in) ;
        
        System.out.println("Capture el radio dei circulo") ;
        radio=scanner.nextDouble();
        circunferencia= 2* Math.PI* radio;
        System.out.println("circunferencia es: "+ circunferencia) ;
    }
}
