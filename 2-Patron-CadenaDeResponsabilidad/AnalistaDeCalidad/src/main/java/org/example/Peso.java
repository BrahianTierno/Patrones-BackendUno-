package org.example;

public class Peso extends ManejadorCalidad {
    @Override
    public void compruebaCalidad(Articulo articulo) {

        if(articulo.getPeso() >= 1200 && articulo.getPeso() <= 1300){
            if(getControlSIguiente() != null){
                getControlSIguiente().compruebaCalidad(articulo);
            }else {
                System.out.println(articulo.getNombre() + " paso todas las preubas");
            }
        } else {
            System.out.println(articulo.getNombre() + " es rechazado por que no pasa la prueba de peso");
        }
    }
}
