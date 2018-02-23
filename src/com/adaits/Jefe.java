package com.adaits;
import com.adaits.Minion;

import java.util.ArrayList;

public class Jefe {
    private String nombre;
    private ArrayList<Minion> minions = new ArrayList<Minion>();
    private String palabraFav;

    public Jefe(String nombre,String palabraFav){
        this.nombre = nombre;
        this.palabraFav = palabraFav;
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

    public String getPalabraFav() {
        return palabraFav;
    }

    public void setPalabraFav(String palabraFav) {
        this.palabraFav = palabraFav;
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
    public Minion PalabrasFavIguales(){
        for (Minion m:minions) {
            if (m.getPalabraFav()==this.getPalabraFav())
                return m;
        }
        return null;
    }

    //Crear una función que te devuelva el primer minion que se unio a un jefe
    public Minion primerEsbirro(){
        return minions.get(0);
    }
}
