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
public class Arreglos3 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        double[] calificaciones_progr = {18, 19, 15, 19, 17, 10};
        double[] calificaciones_bd = {10, 12, 13, 20, 17, 20};
        double[] promedios = new double[6];

        for (int i = 0; i < calificaciones_bd.length; i++) {
            double suma = calificaciones_progr[i] + calificaciones_bd[i];
            double promedio = suma / 2;

            promedios[i] = promedio;
        }
        for (int i = 0; i < promedios.length; i++) {
            System.out.println("Promedio de estudiantes " + (i + 1) + " : " + promedios[i]);
        }

    }
}
