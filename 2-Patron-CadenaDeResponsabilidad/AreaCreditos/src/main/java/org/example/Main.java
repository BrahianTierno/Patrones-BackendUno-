package org.example;

public class Main {
    public static void main(String[] args) {

        EmpleadoBanco empleado1 = new Director();
        EmpleadoBanco empleado2 = new EjecutivoCuenta();
        EmpleadoBanco empleado3 = new Gerente();

        empleado1.setSigEmpleadoBanco(empleado2);
        empleado2.setSigEmpleadoBanco(empleado3);

        empleado1.procesarSolicitud(5000);

    }
}