/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro.Unidad1.EjerciciosParte1;
import java.util.Scanner;

public class TestCuenta {
    public static void main(String[] args){
        Cuenta miCuenta = new Cuenta("Pedro",300);
        Cuenta miCuenta2 = new Cuenta("Fernando",300);
        
        Scanner scanner = new Scanner(System.in); 
        
        double i, r;
        System.out.println("Ingrese la cantidad a agregar de la Cuenta 1");
        i = scanner.nextInt();
        miCuenta.Ingresar(i);
        System.out.println("Ingrese la cantidad a retirar de la Cuenta 1");
        r = scanner.nextInt();
        miCuenta.Retirar(r);
        miCuenta.toString();

        
        double i2, r2;
        System.out.println("Ingrese la cantidad a agregar de la Cuenta 2");
        i2 = scanner.nextInt();
        miCuenta2.Ingresar(i2);
        System.out.println("Ingrese la cantidad a retirar de la Cuenta 2");
        r2 = scanner.nextInt();
        miCuenta.Retirar(r2);
        miCuenta2.toString();
    }
}
