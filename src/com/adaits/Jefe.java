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

    public ArrayList<Minion> getMinions() {
        return minions;
    }

    public void setMinions(ArrayList<Minion> minions) {
        this.minions = minions;
    }

    //Crear una funcion que obtengan todos los minions con mas de un ojo y sin gafas
    public ArrayList<Minion> masOjosSinGafas(){
        ArrayList<Minion>minionsD = new ArrayList<Minion>();
        for (Minion m:minions) {
            if (m.getOjos() > 1 && !m.isGafas())
                minionsD.add(m);
        }
        return minionsD;
    }



    //Crear una función que obtenga todos los minions con más de una habilidad
    public Minion MasHabilidad(){
//        for (Minion m:minions) {
//            if (m.getHabilidades().size()>1)
//                return m;
//        }
        return null;
    }


    //Crear una función que obtenga un minion con la misma palabra favorita que tu
    public Minion PalabrasFavIguales(Minion minion){
//        for (Minion m:minions) {
//            if (minion.getPalabraFav()==m.getPalabraFav())
//                return m;
//        }
        return null;
    }

    //Crear una función que te devuelva el primer minion que se unio a un jefe
    public Minion primerEsbirro(){
//        return minions.get(0);
        return null;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
