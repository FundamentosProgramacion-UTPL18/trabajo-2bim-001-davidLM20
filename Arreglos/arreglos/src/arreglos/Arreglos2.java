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
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Tabla de multiplicar de pares");
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] % 2 == 0) {
                for (int j = i; j < 13; j++) {
                    
                    System.out.println(arreglo[i] + " * " + j + " = " + arreglo[i]);
                }

            }
         
        }
        
    }

}
