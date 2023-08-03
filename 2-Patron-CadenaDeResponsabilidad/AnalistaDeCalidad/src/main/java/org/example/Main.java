package org.example;

public class Main {
    public static void main(String[] args) {

        Articulo articulo1 = new Articulo("Pilsen",1100,1250,"sano");
        Articulo articulo2= new Articulo("Patricia",200,1250,"sano");
        Articulo articulo3 = new Articulo("Salus",1100,1250,"roto");

        AnalisisCalidad analisisCalidad = new AnalisisCalidad();

        analisisCalidad.comprobarCalidad(articulo1);
        analisisCalidad.comprobarCalidad(articulo2);
        analisisCalidad.comprobarCalidad(articulo3);


    }
}