package org.example;

public class Main {
    public static void main(String[] args) {

        Usuario usuarioPremium = new Usuario(1,TipoDeUsuario.PREMIUN);
        Usuario usuarioFree = new Usuario(2,TipoDeUsuario.FREE);

        ProxyService proxyService = new ProxyService(usuarioFree);
        ProxyService proxyService2 = new ProxyService(usuarioPremium);

        proxyService.descargar("La bicicleta");
        proxyService2.descargar("Salio el Sol");


    }
}