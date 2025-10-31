/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author coby_
 */
public class Maestro implements Persona {

    @Override
    public void saluda() {
        System.out.println("Hola queridos estudiantes");
    }

    @Override
    public int cuantosYearsTiene() {
        return 30; 
    }
    
}
