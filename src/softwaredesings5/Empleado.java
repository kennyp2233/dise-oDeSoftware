/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package softwaredesings5;

/**
 *
 * @author kenny
 */
public abstract class Empleado {

    private String nombre, apellido;

    public Empleado(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public abstract double calcularSalario();

    public String getNombre() {
        return this.nombre;
    }
}
