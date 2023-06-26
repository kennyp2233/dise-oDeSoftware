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
public class EmpleadoPermanente extends Empleado {

    private double salarioBase, valorHoraExtra;
    private int horasExtra;

    public EmpleadoPermanente(double salarioBase, double valorHoraExtra, int horasExtra, String nombre, String apellido, LocalDate fechaIngreso) {
        super(nombre, apellido, fechaIngreso);
        this.salarioBase = salarioBase;
        this.valorHoraExtra = valorHoraExtra;
        this.horasExtra = horasExtra;
    }

    @Override
    public double calcularSalario() {
        double salarioTotal = salarioBase + (horasExtra * valorHoraExtra);
        return salarioTotal;
    }

    public String calcularRegalo() {
        if (haCumplidoTresAnios()) {
            return "Regalo para vacaciones otorgado";
        }
        return null;
    }
}
