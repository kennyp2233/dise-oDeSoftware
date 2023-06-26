/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package softwaredesings5;

import java.time.LocalDate;

/**
 *
 * @author kenny
 */
public class Funcionamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RecursosHumanos rh = new RecursosHumanos();

        Empleado emp1 = new EmpleadoPermanente(800, 15, 50, "Kenny", "Pinchao", LocalDate.of(2020, 2, 15));
        Empleado emp2 = new EmpleadoTemporal(530, 15, "Juan", "Perez", LocalDate.of(2019, 3, 16));
        Empleado emp3 = new EmpleadoPermanente(500, 16, 250, "Matias", "Cano", LocalDate.of(2021, 6, 20));
        Empleado emp4 = new EmpleadoTemporal(600, 20, "Kevin", "Villarreal", LocalDate.of(2018, 3, 16));
        Empleado emp5 = new EmpleadoPermanente(1200, 20, 300, "Jose", "Flores", LocalDate.of(2019, 6, 20));

        rh.agregarEmpleado(emp1);
        rh.agregarEmpleado(emp2);
        rh.agregarEmpleado(emp3);
        rh.agregarEmpleado(emp4);
        rh.agregarEmpleado(emp5);

        rh.calcularCostosSalarios();
        rh.asignarRegalos();
    }

}
