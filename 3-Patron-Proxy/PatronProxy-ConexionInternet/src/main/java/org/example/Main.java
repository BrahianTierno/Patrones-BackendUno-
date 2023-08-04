package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        InternetService internetService1 = new InternetService();
        List<String> listaSitiosBloqueados = new ArrayList<>();
        listaSitiosBloqueados.add("www.face.com");
        listaSitiosBloqueados.add("www.instagram.com");
        listaSitiosBloqueados.add("www.tw.com");

        ProxyInternet proxyInternet = new ProxyInternet( internetService1 , listaSitiosBloqueados);

        proxyInternet.conectarCon("www.face.com");
        proxyInternet.conectarCon("www.instagram.com");
        proxyInternet.conectarCon("www.google.com");

    }
}