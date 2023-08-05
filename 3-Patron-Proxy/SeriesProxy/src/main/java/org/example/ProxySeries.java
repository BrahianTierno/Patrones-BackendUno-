package org.example;

public class ProxySeries implements ISerie{

    private Serie serie;
    private int visitas;
    private int maxVisitas;

    public ProxySeries(Integer maxVisitas) {
        this.visitas = 0;
        this.maxVisitas = maxVisitas;
        this.serie = new Serie();
    }

    @Override
    public String getSerie(String nombre) throws SerieNoHabilitadaException {
       if(visitas >= maxVisitas){
           throw new SerieNoHabilitadaException("El numero de vista ya fue superado");
       }
       visitas++;
       return  serie.getSerie(nombre);
    }
}
