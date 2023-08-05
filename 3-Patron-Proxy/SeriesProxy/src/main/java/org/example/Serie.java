package org.example;

public class Serie implements ISerie{
    @Override
    public String getSerie(String nombre) {
        return "www."+ nombre +".com";
    }
}
