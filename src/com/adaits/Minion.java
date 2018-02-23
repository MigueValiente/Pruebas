package com.adaits;

import java.util.ArrayList;

public class Minion {

    private String nombre;
    private int crimenes;

    //Crear propiedad para gestionar palabra favorita
    private String palabraFav;
    //Crear propiedad para los numeros de ojos
    private int ojos;
    //Crear propiedad de si lleva gafas o no
    private boolean gafas;
    //Crear propiedad de habilidades
    private ArrayList<String> habilidades = new ArrayList<String>();
    //Crear Clase Jefe y asociarla a un minion, tener en cuenta que un jefe puede tener varios minions
    private Jefe jefe;
    //Pero los minions solo obedecen a un jefe

    public Minion(String nombre, int crimenes,String palabraFav,int ojos, boolean gafas) {
        this.nombre = nombre;
        this.crimenes = crimenes;
        this.palabraFav = palabraFav;
        this.ojos = ojos;
        this.gafas = gafas;
    }

    public Minion(int ojos,boolean gafas){
        this.ojos=ojos;
        this.gafas=gafas;
    }

    @Override
    public String toString() {
        return "Minion{" +
                "nombre='" + nombre + '\'' +
                ", crimenes=" + crimenes +
                ", palabraFav='" + palabraFav + '\'' +
                ", ojos=" + ojos +
                ", gafas=" + gafas +
                ", habilidades=" + habilidades +
                ", jefe=" + jefe +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCrimenes() {
        return crimenes;
    }

    public void setCrimenes(int crimenes) {
        this.crimenes = crimenes;
    }

    public String getPalabraFav() {
        return palabraFav;
    }

    public void setPalabraFav(String palabraFav) {
        this.palabraFav = palabraFav;
    }

    public int getOjos() {
        return ojos;
    }

    public void setOjos(int ojos) {
        this.ojos = ojos;
    }

    public boolean isGafas() {
        return gafas;
    }

    public void setGafas(boolean gafas) {
        this.gafas = gafas;
    }

    public ArrayList<String> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(ArrayList<String> habilidades) {
        this.habilidades = habilidades;
    }

    public Jefe getJefe() {
        return jefe;
    }

    public void setJefe(Jefe jefe) {
        this.jefe = jefe;
    }

    public boolean esUnVillano(){
        boolean esMayor = false;

        if(this.crimenes >= 18){
            esMayor = true;
        }

        return esMayor;
    }

    public void agregarHabilidad(String habilidad){
        habilidades.add(habilidad);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Minion minion = (Minion) o;

        if (crimenes != minion.crimenes) return false;
        if (ojos != minion.ojos) return false;
        if (gafas != minion.gafas) return false;
        if (nombre != null ? !nombre.equals(minion.nombre) : minion.nombre != null) return false;
        if (palabraFav != null ? !palabraFav.equals(minion.palabraFav) : minion.palabraFav != null) return false;
        if (habilidades != null ? !habilidades.equals(minion.habilidades) : minion.habilidades != null) return false;
        return jefe != null ? jefe.equals(minion.jefe) : minion.jefe == null;
    }

    @Override
    public int hashCode() {
        int result = nombre != null ? nombre.hashCode() : 0;
        result = 31 * result + crimenes;
        result = 31 * result + (palabraFav != null ? palabraFav.hashCode() : 0);
        result = 31 * result + ojos;
        result = 31 * result + (gafas ? 1 : 0);
        result = 31 * result + (habilidades != null ? habilidades.hashCode() : 0);
        result = 31 * result + (jefe != null ? jefe.hashCode() : 0);
        return result;
    }
}
