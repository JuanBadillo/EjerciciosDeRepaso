/*
 *Pedir un número entre 0 y 9,999 y mostrarlo con las cifras al revés.
 */
package Libro.Unidad1.EjerciciosParte1;
import java.util.Scanner;

public class Alreves {
    public static void main(String[] args){
       
    int a, r = 0; 
        
    Scanner scanner = new Scanner(System.in); 
    System.out.println("Introduzca un numero");
    a = scanner.nextInt();
    
    while(a != 0)
    {
      r = r * 10;
      r = r + a%10;
      a = a/10;
    }
    
    System.out.println("Alreves:" +r);
    }
}
