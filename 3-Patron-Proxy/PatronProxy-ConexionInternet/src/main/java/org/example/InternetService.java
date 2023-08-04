package org.example;

public class InternetService implements IConexionInternet{
    @Override
    public void conectarCon(String url) {
        System.out.println("Conectado con " + url);
    }
}
