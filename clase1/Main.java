
package main;

import java.util.Scanner;

/**
 *
 * @author tumir
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Escribir un programa que pida dos números
        enteros por teclado y calcule la suma de los dos
        . El programa deberá después mostrar el resultado de la suma*/
        Scanner leer = new Scanner(System.in);
        /*int uno, dos, tres;
        
        System.out.println("ingresar el primer numero y luego el siguien");
        
        uno = leer.nextInt();
        dos = leer.nextInt();
        
        tres = uno + dos;
        System.out.println("la suma es: " + tres);*/
        /*==============================================================*/
        /*Escribir un programa que pida tu nombre,
        lo guarde en una variable y lo muestre por pantalla.*/
        
        /*String name;
        System.out.println("ingresar el nombre");
        
        name = leer.next();
        
        System.out.println("el nombre es: " + name);*/
        
        /*===========================================================*/
        
        /* Escribir un programa que pida una frase y la muestre toda
        en mayúsculas y después toda en minúsculas. 
Nota: investigar la función toUpperCase() y toLowerCase() en Java */
        
        /*String frase;
        System.out.println("ingresar la frase");
        
        frase = leer.next();
        
        
        System.out.println("frase en minusculas: "+frase.toLowerCase() + " frase en MAYUSCULAS: " + frase.toUpperCase());*/
        
        
        /*===========================================================*/
        
        /*Dada una cantidad de grados centígrados se debe mostrar su 
        equivalente en grados Fahrenheit. La fórmula correspondiente 
        es: F = 32 + (9 * C / 5).*/
       
        
       /*int uno, dos;
       uno = leer.nextInt();
       dos = 32 + (9 * uno /5); 
       
       
       System.out.println(dos);*/
        
       /*============================================================/
       
       /*Escribir un programa que lea un número entero por teclado y 
       muestre por pantalla el doble, el triple y la raíz cuadrada de 
       ese número. Nota: investigar la función Math.sqrt().*/ 
       
       int uno, dos;
       
       uno = leer.nextInt();
       
       System.out.println(Math.sqrt(uno)+ " "+ (uno*uno) + " "+ (uno*uno*uno));
       
       
       
       
    }  
}

