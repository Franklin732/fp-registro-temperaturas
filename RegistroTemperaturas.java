/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registrotemperaturas;

/**
 *
 * @author Franklin Parra
 */
public class RegistroTemperaturas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // 1. Crear una matriz 3D que represente las temperaturas diarias
        //     Primera dimension: ciudades (mínimo 2)
        //     Segunda dimension: días de la semana (Lunes a Domingo)
        //     Tercera dimension: semanas (mínimo 2 semanas)
        String[] ciudades = {"Cuenca", "Azogues"};
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        int numSemanas = 2;
        int numCiudades = ciudades.length;
        int numDias = dias.length;

        // Matriz 3D: [ciudad][día][semana]
        double[][][] temperaturas = new double[numCiudades][numDias][numSemanas];

        // 2. Llenar la matriz con valores numéricos representando las temperaturas
        //    Valores simulados entre 14 y 24 grados que son temperaturas promedio en esas ciudades 
        for (int c = 0; c < numCiudades; c++) {
            for (int s = 0; s < numSemanas; s++) {
                for (int d = 0; d < numDias; d++) {
                    temperaturas[c][d][s] = 14 + (Math.random() * 10); 
                }
            }
        }

        // 3. Usar bucles anidados para calcular el promedio por ciudad y por semana
        // 4. Mostrar en pantalla el promedio de temperaturas para cada ciudad y semana
        for (int c = 0; c < numCiudades; c++) {
            System.out.println("=== " + ciudades[c] + " ==="); 

            for (int s = 0; s < numSemanas; s++) {
                double suma = 0;

                // Sumar las temperaturas de los 7 días de la semana actual
                for (int d = 0; d < numDias; d++) {
                    suma += temperaturas[c][d][s];
                }

                // Calcular promedio semanal
                double promedio = suma / numDias;

                // Mostrar resultado
                // %.2f = muestra el número con 2 decimales
                // grados C = unidad de temperatura
                System.out.printf("Semana %d: Promedio de temperatura = %.2f grados C\n", s + 1, promedio);
            }
            // Espacio entre ciudades
            System.out.println(); 
        }
    }
}