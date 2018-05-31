/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author jhand
 */
public class Arreglos2 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        // Declaracio del arreglo 
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Tabla de multiplicar de pares");
        
        //se usa el primer for para recorrer todos los elementos del arreglo
        for (int i = 0; i < arreglo.length; i++) {
            // se implementa una condicion para verificar si el elemento de la variable es par
            if (arreglo[i] % 2 == 0) {
                // se usa esete for para recorre solo los elementos pares
                for (int j = i; j < 13; j++) {
                    // se presenta el resultado de la miultiplicacion, en esta linea se realiza presentacion y proceso(multiplicacion)
                    System.out.println(arreglo[i] + " * " + j + " = " + arreglo[i]*j);
                }
                System.out.println("\n");
            }
         
        }
        
    }

}
