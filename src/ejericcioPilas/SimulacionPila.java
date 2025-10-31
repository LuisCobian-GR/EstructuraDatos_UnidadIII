
package ejericcioPilas;

import java.util.Arrays;

/**
 * Clase que me permite verificar mis operaciones con la pila 
 * @author coby_
 */
public class SimulacionPila {
    
    public static void main(String[] args) {
        MiStack miPila = new MiStack(4); 
        miPila.push("Uno"); 
        miPila.push("Dos"); 
        miPila.push("Tres");
        
        System.out.println("Valor que esta en el tope " + 
                             miPila.peek());
        miPila.peek();
        miPila.peek();
        
        System.out.println("Todos los valores " 
                           + Arrays.toString(miPila.viewStack()));
        
    }
    
}
