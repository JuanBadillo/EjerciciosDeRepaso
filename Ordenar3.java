/*
 *Pedir tres números y mostrarlos ordenados de mayor a menor.
 */
package Libro.Unidad1.EjerciciosParte1;
import java.util.Scanner;

public class Ordenar3 {
    public static void main(String[] args){
    
    double a, b, c;
    double n1, n2, n3;
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Introduzca el primer numero");
    a = scanner.nextDouble();
    
    System.out.println("Introduzca el segundo numero");
    b = scanner.nextDouble();
    
    System.out.println("Introduzca el tercer numero");
    c = scanner.nextDouble();
    
    if (a > b){
        if (a > c) {
            n1 = a;
            if (b > c) {
                n2 = b;
                n3 = c;
            }
            else{ 
                n2 = c;
                n3 = b;
            }
        }
        else{
            n1 = c;
            n2 = a;
            n3 = b;
        }       
    }
    else{
        if (b > c) {
            n1 = b;
            if (a > c) {
                n2 = a;
                n3 = c;
            }
            else{
                n2 = c;
                n3 = a;
            }
        }
        else{
            n1 = c;
            n2 = b;
            n3 = a;
            }
        }
    System.out.println("Mayor a Menor:");
    System.out.println(n1);
    System.out.println(n2);
    System.out.println(n3);
    }
}  

