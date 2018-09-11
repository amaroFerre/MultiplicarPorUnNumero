/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicarporunnumero;

// Importo el paquete java.util para poder utilizar la clase Scanner

import java.util.*;

/**
 *
 * @author Amarico
 */
public class MultiplicarPorUnNumero {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    
    //Muestra la tabla de multiplicar de un número introducido por teclado.
    
    // Creo un objeto de la clase Scanner
    
    Scanner entrada = new Scanner(System.in);
    
    // Creo una variable de tipo entero
    
    int numero;
    
    // Creo otra variable de tipo entero para el resultado de la multiplicación
    
    int resultado;
    
    // Pido un número por teclado
    
    System.out.println("Introduce un número: ");
    
    numero = entrada.nextInt();
    
    
    // Comienzo el bucle for
    
    for (int i = 0; i < 10; i++) {
      
      resultado = numero * i;
      
      System.out.println("El número " + numero + " multiplicado por "+ i + " es igual " + resultado);
      
    }
    
    
    
  }
  
}
