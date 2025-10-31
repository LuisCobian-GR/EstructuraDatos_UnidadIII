/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author coby_
 */
public class Principal {
    
    public static void main(String[] args) {
        System.out.println("Principal ");
        Persona pers = new Maestro(); 
        imprime(pers, new Alumno(), new Maestro());
        //Persona p = new Persona();
    }
    
    static void imprime(Persona ...pers){
        for (Persona per : pers) {
            per.saluda();
            System.out.println("Edad" + per.cuantosYearsTiene());
        }
    }
    
}
