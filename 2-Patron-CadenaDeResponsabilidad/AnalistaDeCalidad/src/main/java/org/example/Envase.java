package org.example;

public class Envase extends ManejadorCalidad {
    @Override
    public void compruebaCalidad(Articulo articulo) {
        if(articulo.getEnvase() == "sano" ||  articulo.getEnvase() == "casi sano" ){
            if(getControlSIguiente() != null){
                getControlSIguiente().compruebaCalidad(articulo);
            }else {
                System.out.println(articulo.getNombre() + " paso todas las preubas");
            }
        } else {
            System.out.println(articulo.getNombre() + " es rechazado por que no pasa la prueba del envase");
        }
    }
}
