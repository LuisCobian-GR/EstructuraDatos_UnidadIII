
package ejemplCcolas;

import java.util.Arrays;

/**
 * Metodo para probar el funcionamiento de una fila 
 * @author coby_
 */
public class SimulacionFila {
    
    
    public static void main(String[] args) {
        MiFila fila = new MiFila(5); 
        
        fila.offer("Pepe"); 
        fila.offer("Janeth"); 
        fila.offer("Pedro");
        
        System.out.println("Valores: " 
                 + Arrays.toString(fila.aArreglo()));
        
        System.out.println("Atendido "  + fila.poll()); 
        System.out.println("Valores: " 
                 + Arrays.toString(fila.aArreglo()));
        
    }
}
