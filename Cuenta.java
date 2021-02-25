/*
 * Crea una clase llamada Cuenta
 */
package Libro.Unidad1.EjerciciosParte1;

import java.util.Scanner;

public class Cuenta {
    private String Titular;
    private double Cantidad;
  
    public String getTitular(){
        return Titular;
    }
    
    public void setTitular(String Titular){
        this.Titular = Titular;
    }
    
    public double getCantidad(){
        return Cantidad;
    }
    
    public void setCantidad(double Cantidad){
        this.Cantidad = Cantidad;
    }
    
    public Cuenta(String t, double c){
        Titular = t;
        Cantidad = c;
    }
    
    public String toString()   {     
        System.out.println(Titular+": "+Cantidad);
        return Titular+": "+Cantidad ;
    }
    Scanner scanner = new Scanner(System.in); 
        
    public void Ingresar(double cantidad){
        if (cantidad > 0) {
            Cantidad = Cantidad + cantidad;
        }
    }
    
    public void Retirar(double cantidad){
        Cantidad = Cantidad - cantidad;
        if (Cantidad < 0) {
            Cantidad = 0;
        }
    }
}
