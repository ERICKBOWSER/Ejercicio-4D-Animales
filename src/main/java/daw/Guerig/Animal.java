/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package daw.Guerig;

import java.time.LocalDate;

/**
 *
 * @author ERICK
 */
public class Animal {

    private LocalDate fechaNacimiento;
    private String nombre;
    private String tipo;
    private double peso;
    private String estado;
    
    // Constructor por defecto
    public Animal(){
        
    }
    
    // Método contructor que inicializa los atributos de la clase Animal
    public Animal(LocalDate fechaNacimiento, String nombre, String tipo, double peso, String estado){
        
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.tipo = tipo;
        this.peso = peso;
        this.estado = estado;        
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    public double getPeso(){
        return peso;
    }
    
    public String getEstado(){
        return estado;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
