package arreglos;

import java.util.Scanner;

/**
 * Ejercicio para probar el uso de arreglos 
 * @author coby_
 */
public class Tabla {
    
    public static void main(String[] args) {
        int arreglo[] = new int[20]; 
        int[] arreglo2 = {4,3,2,1,2}; 
        int matriz[][] = new int[3][4]; 
        int[] matriz2[] = {
                            {2,4,2,6}, 
                            {1,2,3,5,3,2}
                          };
        System.out.println("Valor " + 
                   matriz2[0][1]);
        System.out.println("La matriz tiene "
                    + matriz2.length);
        
        System.out.println(matriz2[0].length);
        
        System.out.println("El primer "
                + "arreglo tiene "
                + arreglo.length 
                + " posiciones");
        System.out.println("El segundo "
                + "arreglo tiene "
                + arreglo2.length 
                + " posiciones");
        // Pedir 3 nombres, 3 carreras, 
        // pedir 3 edades 
        // Acomodar en una tabla que sea 
        // nombre carreras edad  
        String[][] misdatos = new String[5][3];
        Scanner sc = new Scanner(System.in); 
        for (int i = 0; i < 3; i++) {
            System.out.println("Dame el nombre: ");
            String nombre = sc.nextLine(); 
            System.out.println("Dame el carrera");
            String carrera = sc.nextLine(); 
            System.out.println("Dame edad");
            String edad = sc.nextLine(); 
            /// Aqui meterlos a la matriz
            misdatos[i][0] = nombre; 
            misdatos[i][1] = carrera; 
            misdatos[i][2] = edad; 
        }
        /// imprimir la matriz
        for (String[] misdato : misdatos) {
            for (String dato : misdato) {
                System.out.printf("%-10s",dato);
            }
            System.out.println("");
        }
         
    }
    
}
