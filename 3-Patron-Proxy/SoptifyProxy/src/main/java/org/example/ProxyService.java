package org.example;

public class ProxyService implements IServicioDescarga{

    private ServicioDescarga servicioDescarga;
    private Usuario usuario;

    public ProxyService(Usuario usuario) {
        this.servicioDescarga = new ServicioDescarga();
        this.usuario = usuario;
    }

    @Override
    public void descargar(String cancion) {
        if(usuario.getTipoDeUsuario() == TipoDeUsuario.PREMIUN){
            servicioDescarga.descargar(cancion);
        }else{
            System.out.println("No puede descragar la cancion por que no es una usuario premiun");
        }


    }
}
