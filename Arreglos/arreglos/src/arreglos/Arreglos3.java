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
        // se declara todos los arreglos a usar en el desarrollo 
        double[] calificaciones_progr = {18, 19, 15, 19, 17, 10};
        double[] calificaciones_bd = {10, 12, 13, 20, 17, 20};
        double[] promedios = new double[6];
        // encabezados
        System.out.println("            Nomina de promedios de estudiantes\n");
        System.out.println("\t      Programcion\tBase de datos\tPromedios");
        //este for se usa para recorrer el arreglo y aplicar los proceso  suma y la division del promedio
        for (int i = 0; i < calificaciones_bd.length; i++) {
            double suma = calificaciones_progr[i] + calificaciones_bd[i];
            double promedio = suma / 2;
            // se guarda los resultados en el arreglo promedio
            promedios[i] = promedio;
        }
        // se realiza la presentacion de los resultados y los valores ya establecidos en los arreglos
        for (int i = 0; i < promedios.length; i++) {
            System.out.println("Estudiante " + (i + 1) + ":   " + calificaciones_progr[i] + " \t\t" + calificaciones_bd[i] + "\t\t" + promedios [i] );
            
        }

    }
}
