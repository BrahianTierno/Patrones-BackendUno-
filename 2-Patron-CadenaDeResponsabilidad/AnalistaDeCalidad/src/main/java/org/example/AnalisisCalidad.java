package org.example;

import org.example.*;

public class AnalisisCalidad {

    private ManejadorCalidad cadena;

    public AnalisisCalidad() {
        cadena = new Lote();
        ManejadorCalidad pruebaEnvase = new Envase();
        ManejadorCalidad pruebaPeso = new Peso();
        cadena.setControlSIguiente(pruebaEnvase);
        pruebaEnvase.setControlSIguiente(pruebaPeso);
    }

    public void comprobarCalidad(Articulo articulo){
        cadena.compruebaCalidad(articulo);
    }
}
