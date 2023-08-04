package org.example;

public class Usuario {

    private int id;
    private TipoDeUsuario tipoDeUsuario;

    public Usuario(int id, TipoDeUsuario tipoDeUsuario) {
        this.id = id;
        this.tipoDeUsuario = tipoDeUsuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TipoDeUsuario getTipoDeUsuario() {
        return tipoDeUsuario;
    }

    public void setTipoDeUsuario(TipoDeUsuario tipoDeUsuario) {
        this.tipoDeUsuario = tipoDeUsuario;
    }
}
