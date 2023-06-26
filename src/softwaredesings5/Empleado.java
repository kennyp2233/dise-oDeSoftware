/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package softwaredesings5;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author kenny
 */
public abstract class Empleado {

    private String nombre, apellido;
    private LocalDate fechaIngreso;

    public Empleado(String nombre, String apellido, LocalDate fechaIngreso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaIngreso = fechaIngreso;
    }

    public abstract double calcularSalario();

    public boolean haCumplidoTresAnios() {
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaIngreso, fechaActual);
        int aniosTrabajados = periodo.getYears();
        return aniosTrabajados >= 3;
    }

    public String getNombre() {
        return this.nombre;
    }
}
