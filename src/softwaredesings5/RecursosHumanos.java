/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package softwaredesings5;

import java.util.ArrayList;
import java.util.List;

public class RecursosHumanos {

    private List<Empleado> empleados;

    public RecursosHumanos() {
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void calcularCostosSalarios() {
        double costosSalarios = 0;
        for (Empleado empleado : empleados) {
            costosSalarios += empleado.calcularSalario();
        }
        System.out.println("Costos totales de salarios: " + costosSalarios);
    }

    public void asignarRegalos() {
        for (Empleado empleado : empleados) {
            if (empleado instanceof EmpleadoPermanente) {
                EmpleadoPermanente empleadoPermanente = (EmpleadoPermanente) empleado;
                String regalo = empleadoPermanente.calcularRegalo();
                System.out.println("Regalo asignado a " + empleado.getNombre() + ": " + regalo);
            }
        }
    }
}
