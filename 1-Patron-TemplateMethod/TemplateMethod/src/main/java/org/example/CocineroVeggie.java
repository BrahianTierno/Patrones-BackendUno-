package org.example;

public class CocineroVeggie extends Cocinero{
    @Override
    protected void prepararIngredientes() {
        System.out.println("Preparando tomate y queso");
    }

    @Override
    protected void agregarIngredientes() {
        System.out.println("Agregando tomate y quesos");
    }
}
