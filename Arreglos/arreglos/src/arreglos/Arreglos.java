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
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        // Declaracion del arreglo
        int[] c = new int[4];
        c[0] = 10;
        // se usa el ciclo for para recorrer y presentar los elementos del arreglo
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }

}
