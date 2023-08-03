package org.example;

public abstract class ManejadorCalidad {

    private ManejadorCalidad controlSIguiente;

    public abstract void compruebaCalidad(Articulo articulo);

    public ManejadorCalidad getControlSIguiente() {
        return controlSIguiente;
    }

    public void setControlSIguiente(ManejadorCalidad controlSIguiente) {
        this.controlSIguiente = controlSIguiente;
    }
}
