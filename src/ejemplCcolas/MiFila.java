package ejemplCcolas;

/**
 * Queue (Interfaz ) - >  PriorityQueue
 * Clase que simula las operaciones con una fila 
 * @author coby_

 */
public class MiFila {
    
    private final int MAXIMO ; 
    private final String[] fila;
    private int fin; 
    
    /**
     * Metodo que convierte la fila en arreglo 
     * @return el arreglo y sus valores
     */
    public String[] aArreglo(){
        String arreglo[] = new String[fin];
        for(int i=0;i<fin; i++){
            arreglo[i] = fila[i]; 
        }
        return arreglo; 
    }
    
    /**
     * Metodo que me permite traer el primer valor que tengo en la
     * fila 
     * @return el valor 
     */
    public String peek(){
        String value = "";
        if(fin>0){
            value = fila[0]; 
        }
        return value; 
    }
    
    /**
     * Método que regresa el primer valor que se tiene en 
     * la fila 
     * @return el valor que se encontro, en blanco si no hay
     */
    public String poll(){
        String value ="";       
        if(fin > 0){
            value = fila[0]; 
            for(int i=1; i<fin; i++){
                fila[i-1] = fila[i]; 
            }
            fin --; 
        }
        else {
            throw new RuntimeException("No hay valores"); 
        }
        return value; 
    }
    
    /**
     * metodo que me permite agregar valores a la fila 
     * @param value valor a agregar 
     * @return verdadero si se pudo agregar
     */
    public boolean offer(String value){
        boolean isSuccess; 
        if(fin<MAXIMO){
          fila[fin] = value; 
          fin++; 
          isSuccess = true; 
        } else {
            isSuccess = false; 
        }
        return isSuccess; 
    }
    
    public MiFila(int max){
        MAXIMO = max; 
        fila = new String[MAXIMO];
        fin = 0;
    }
    
    public MiFila(){
        this(10); 
    }
}











