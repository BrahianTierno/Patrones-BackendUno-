package org.example;

public class ServicioDescarga implements IServicioDescarga{
    @Override
    public void descargar(String cancion) {
        System.out.println("Descragando la cancion: " + cancion);
    }
}
