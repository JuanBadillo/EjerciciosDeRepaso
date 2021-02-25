/*
 *   Clase Persona
 */
package Libro.Unidad1.EjerciciosParte1;
import java.util.Scanner;

public class Persona {
    private String Nombre;
    private int Edad;
    private String RFC;
    private char Sexo;
    private double Peso;
    private double Altura;
    
    public Persona(){
        Nombre = "";
        Edad = 0;
        Sexo = 'H';
    }
    
    public Persona(String n, int e, String rfc, char s, double p, double a){
        Nombre = n;
        Edad = e;
        RFC = rfc;
        Sexo = s;
        Peso = p;
        Altura = a;
    }    
            
    public int CalcularIMC(double p, double a){
       double imc = p / (a*a) ;
       int imcr = 0;
       
        if (imc < 20) {
            imcr = -1;
        }
        if (imc >=20 && imc<=25 ) {
            imcr = 0;           
        }
        if (imc >25) {
            imcr = 1;
        }
        
        return imcr;
    }
    
    public boolean EsMayorDeEdad(int e){
        
        boolean mde = false;
        if (e >= 18) {
            mde = true;
        }
        return mde;
    }
}
