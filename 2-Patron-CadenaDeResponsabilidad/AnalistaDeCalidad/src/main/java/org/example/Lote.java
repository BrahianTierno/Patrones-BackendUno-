package org.example;

public class Lote extends ManejadorCalidad {

    @Override
    public void compruebaCalidad(Articulo articulo) {
        if(articulo.getLote() >= 1000 && articulo.getLote() <= 2000){
            if(getControlSIguiente() != null){
                getControlSIguiente().compruebaCalidad(articulo);
            }else {
                System.out.println(articulo.getNombre() + " paso todas las preubas");
            }
        } else {
            System.out.println(articulo.getNombre() + " es rechazado por que no pasa la prueba de lotes");
        }
    }
}
