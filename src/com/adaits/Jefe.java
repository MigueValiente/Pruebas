package com.adaits;
import com.adaits.Minion;

import java.util.ArrayList;

public class Jefe {
    private String nombre;
    private ArrayList<Minion> minions = new ArrayList<Minion>();


    public Jefe(String nombre){
        this.nombre = nombre;
    }

    public void agregarMinion(Minion m){
        minions.add(m);
        m.setJefe(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Crear una funcion que obtengan todos los minions con mas de un ojo y sin gafas
    public Minion masOjosSinGafas(){
        for (Minion m:minions) {
            if (m.getOjos() > 1 && m.isGafas() == false)
                return m;
        }
        return null;
    }



    //Crear una función que obtenga todos los minions con más de una habilidad
    public Minion MasHabilidad(){
        for (Minion m:minions) {
            if (m.getHabilidades().size()>1)
                return m;
        }
        return null;
    }


    //Crear una función que obtenga un minion con la misma palabra favorita que tu
    public Minion PalabrasFavIguales(Minion minion){
        for (Minion m:minions) {
            if (minion.getPalabraFav()==m.getPalabraFav())
                return m;
        }
        return null;
    }

    //Crear una función que te devuelva el primer minion que se unio a un jefe
    public Minion primerEsbirro(){
        return minions.get(0);
    }

    @Override
    public String toString() {
        return nombre;
    }
}
