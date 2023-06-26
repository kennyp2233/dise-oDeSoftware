/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package softwaredesings5;

import java.time.LocalDate;

/**
 *
 * @author kenny
 */
public class EmpleadoTemporal extends Empleado {

    private double horasTrabajadas;
    private double precioHora;

    public EmpleadoTemporal(double horasTrabajadas, double precioHora, String nombre, String apellido, LocalDate fechaIngreso) {
        super(nombre, apellido, fechaIngreso);
        this.horasTrabajadas = horasTrabajadas;
        this.precioHora = precioHora;
    }

    @Override
    public double calcularSalario() {
        double salarioTotal = horasTrabajadas * precioHora;
        return salarioTotal;
    }

}
