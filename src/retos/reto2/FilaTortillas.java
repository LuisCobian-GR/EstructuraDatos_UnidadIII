
package retos.reto2;

import java.util.Scanner;

/**
 * Programa que simula una fila un servicio  
 * @author coby_
 *  21 Octubre
 */
public class FilaTortillas {
 
    public static void main(String[] args) {
        int opc = 0; 
        Scanner sc  = new Scanner(System.in); 
        System.out.println("Tortillas Tec");
        Persona inicioFila = null; 
        do{
            System.out.println("1. Nuevo Cliente");
            System.out.println("2. Atender Cliente");
            System.out.println("3. Cliente enojado");
            System.out.println("4. Terminar servicio");
            opc = Integer.parseInt(sc.nextLine()); 
            switch(opc){
                case 1 -> { 
                    System.out.println("Dame un nombre:");
                    String nombre = sc.nextLine();
                    Persona personaNueva = new Persona(); 
                    personaNueva.nombre = nombre;
                    if(inicioFila == null)
                        inicioFila = personaNueva;
                    else
                        acomodaPersona(inicioFila, personaNueva); 
                    imprimirLista(inicioFila,0);
                }
                case 2 -> { 
                    if(inicioFila!=null)
                        inicioFila = inicioFila.vieneAtras;
                    imprimirLista(inicioFila,0);
                }
                case 3 -> { 
                    System.out.println("A quien quieres eliminar:");
                    String elimina = sc.nextLine();
                    Persona[] buscadoEncontrados = encuentraNodo(inicioFila, elimina, null); 
                    Persona atras = buscadoEncontrados[1];
                    Persona buscado = buscadoEncontrados[0];
                    if(buscado!=null){
                        //caso 1 
                        if(atras == null) inicioFila = inicioFila.vieneAtras;
                        else if(buscado.vieneAtras == null) atras.vieneAtras=null;
                        else atras.vieneAtras = buscado.vieneAtras; 
                    }
                }
                case 4 -> { 
                    System.out.println("Terminando servicio");
                    System.out.println("Personas listado de personas que se quedaron sin servicio");
                    System.out.println("Numero total: " + imprimirLista(inicioFila, 0));
                }
            }
        }while(opc!=4);     
    }
   
    public static Persona[] encuentraNodo(Persona personaEnFila, String encuentra, Persona personaAnterior ){
        if( personaEnFila == null || personaEnFila.nombre.equals(encuentra))
            return new Persona[] {personaEnFila, personaAnterior}; 
        else 
            return encuentraNodo(personaEnFila.vieneAtras, encuentra, personaEnFila);
    }
    
    public static void acomodaPersona(Persona personaEnFila, Persona personaNueva){
        if(personaEnFila.vieneAtras == null)
            personaEnFila.vieneAtras = personaNueva;
        else 
            acomodaPersona(personaEnFila.vieneAtras, personaNueva); 
    }
    
    
    public static int imprimirLista(Persona persona, int n){
        if(persona != null){
            n++; 
            System.out.println("Lugar: " + n + " - " + persona.nombre);
            return imprimirLista(persona.vieneAtras, n);
        } 
        return n; 
    }
}