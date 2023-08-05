package org.example;

public class Main {
    public static void main(String[] args) {

        int maxVistas = 3;
        ProxySeries proxy = new ProxySeries(maxVistas);

        try {
            for (int i = 0; i <= maxVistas; i++) {
                String link = proxy.getSerie("lacasadepapel");
                System.out.println("Link obtenido: " + link);
            }
        } catch (SerieNoHabilitadaException e) {
            System.out.println("Excepción: " + e.getMessage());
        }


    }
}