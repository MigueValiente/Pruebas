package com.adaits;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

public class JefeTest {

    static Jefe jefe;
    static Minion[] minions;

   @BeforeAll
    static void crearPersonas(){
       jefe = new Jefe("Gru");
       minions = new Minion[10];
       minions[0] = new Minion(0,true);
       minions[1] = new Minion(0,false);
       minions[2] = new Minion(1,true);
       minions[3] = new Minion(1,false);
       minions[4] = new Minion(2,true);
       minions[5] = new Minion(2,false);
       minions[6] = new Minion(3,true);
       minions[7] = new Minion(3,false);
       minions[8] = new Minion(-1,true);
       minions[9] = new Minion(-1,false);
       for (int i = 0; i <minions.length-1 ; i++) {
           jefe.agregarMinion(minions[i]);
       }
   }

   @Test
   @DisplayName("Prueba-1 con más de 1 ojo y sin gafas ")
    void probarOjosGafas1(){
        Minion m1 = new Minion(2,false);
        Jefe j1 = new Jefe("Pepe");
        j1.agregarMinion(m1);

        ArrayList<Minion> minionsEsperado = j1.getMinions();
        ArrayList<Minion> minionsResultado = j1.masOjosSinGafas();

        assertEquals(minionsEsperado.size(),minionsResultado.size());
       for (int i = 0; i <minionsEsperado.size() ; i++) {
           assertSame(minionsEsperado.get(i),minionsResultado.get(i));
       }
   }
    @Test
    @DisplayName("Prueba-2 con más de 1 ojo y sin gafas ")
    void probarOjosGafas2(){
        ArrayList<Minion> minions = new ArrayList<Minion>();
        Minion m1 = new Minion(2,false);
        Minion m2 = new Minion(3,false);
        Minion m3 = new Minion(4,false);
        Minion m4 = new Minion(1,false);
        Minion m5 = new Minion(0,true);
        minions.add(m1);
        minions.add(m2);
        minions.add(m3);
        minions.add(m4);
        minions.add(m5);

        Jefe j1 = new Jefe("Pepe");
        j1.agregarMinion(m1);
        j1.agregarMinion(m2);
        j1.agregarMinion(m3);
        j1.agregarMinion(m4);
        j1.agregarMinion(m5);

        ArrayList<Minion> minionsEsperado=new ArrayList<>();
        minionsEsperado.add(m1);
        minionsEsperado.add(m2);
        minionsEsperado.add(m3);
        ArrayList<Minion> minionsResultado = j1.masOjosSinGafas();

        assertEquals(minionsEsperado.size(),minionsResultado.size());
        Iterator it = minionsEsperado.iterator();
        while (it.hasNext()){
            Minion minionEsperado = (Minion) it.next();
            assertTrue(minionsResultado.contains(minionEsperado));
        }
//        for (int i = 0; i <minionsEsperado.size() ; i++) {
//            assertTrue(minionsEsperado.contains(i));
//        }
    }
    @Test
    @DisplayName("Prueba-3 con más de 1 ojo y sin gafas ")
    void probarOjosGafas3() {
        ArrayList<Minion> minions = new ArrayList<Minion>();
        Minion m1 = new Minion(2, false);
        Minion m2 = new Minion(3, false);
        Minion m3 = new Minion(4, false);
        Minion m4 = new Minion(1, false);
        Minion m5 = new Minion(0, true);
        minions.add(m1);
        minions.add(m2);
        minions.add(m3);
        minions.add(m4);
        minions.add(m5);

        Jefe j1 = new Jefe("Pepe");
        j1.agregarMinion(m1);
        j1.agregarMinion(m2);
        j1.agregarMinion(m3);
        j1.agregarMinion(m4);
        j1.agregarMinion(m5);

        ArrayList<Minion> minionsEsperado = new ArrayList<>();
        minionsEsperado.add(m5);
        minionsEsperado.add(m4);
        ArrayList<Minion> minionsResultado = j1.masOjosSinGafas();

        assertNotEquals(minionsEsperado.size(), minionsResultado.size());
        Iterator it = minionsEsperado.iterator();
        while (it.hasNext()) {
            Minion minionEsperado = (Minion) it.next();
            assertFalse(minionsResultado.contains(minionEsperado));
        }
    }

    @Test
    @DisplayName("Prueba-4 con más de 1 ojo y sin gafas ")
    void probarOjosGafas4() {
        ArrayList<Minion> minions = new ArrayList<Minion>();
        Minion m1 = new Minion(1, false);
        Minion m2 = new Minion(5, true);
        Minion m3 = new Minion(2, false);
        Minion m4 = new Minion(3, false);
        Minion m5 = new Minion(5, false);
        minions.add(m1);
        minions.add(m2);
        minions.add(m3);
        minions.add(m4);
        minions.add(m5);

        Jefe j1 = new Jefe("Pepe");
        j1.agregarMinion(m1);
        j1.agregarMinion(m2);
        j1.agregarMinion(m3);
        j1.agregarMinion(m4);
        j1.agregarMinion(m5);

        ArrayList<Minion> minionsEsperado = new ArrayList<>();
        minionsEsperado.add(m1);
        minionsEsperado.add(m2);
        minionsEsperado.add(m3);
        ArrayList<Minion> minionsResultado = j1.masOjosSinGafas();

        assertEquals(minionsEsperado.size(), minionsResultado.size());
        Iterator it = minionsEsperado.iterator();
        int c = 0;
        while (it.hasNext()) {
            Minion minionEsperado = (Minion)it.next();

            if (minionsEsperado.contains(minionEsperado)) {
                c++;
            }
        }
        assertTrue(c==minionsEsperado.size());
    }

    @Test
    @DisplayName("Prueba-5 con más de 1 ojo y sin gafas ")
    void probarOjosGafas5() {
        ArrayList<Minion> minions = new ArrayList<Minion>();
        Minion m1 = new Minion(1, false);
        Minion m2 = new Minion(5, true);
        Minion m3 = new Minion(2, false);
        Minion m4 = new Minion(3, false);
        Minion m5 = new Minion(5, false);
        minions.add(m1);
        minions.add(m2);
        minions.add(m3);
        minions.add(m4);
        minions.add(m5);

        Jefe j1 = new Jefe("Pepe");
        j1.setMinions(null);

        ArrayList<Minion> minionsEsperado = new ArrayList<>();
        minionsEsperado.add(m1);
        minionsEsperado.add(m2);
        minionsEsperado.add(m3);
        ArrayList<Minion> minionsResultado = j1.masOjosSinGafas();

        assertNotEquals(minionsEsperado.size(), minionsResultado.size());
        Iterator it = minionsEsperado.iterator();
        int c=0;
        while (it.hasNext()) {
            Minion minionEsperado = (Minion)it.next();
            if (minionsEsperado.contains(minionEsperado)){
                c++;
            }
        }
        assertTrue(c==minionsEsperado.size());
    }

    @Test
    @DisplayName("Prueba-6 con más de 1 ojo y sin gafas ")
    void probarOjosGafas6() {
        ArrayList<Minion> minions = new ArrayList<Minion>();
        Minion m1 = new Minion(2, false);
        Minion m2 = new Minion(5, false);
        Minion m3 = new Minion(4, false);
        Minion m4 = new Minion(3, false);
        Minion m5 = new Minion(3, false);
        minions.add(m1);
        minions.add(m2);
        minions.add(m3);
        minions.add(m4);
        minions.add(m5);

        Jefe j1 = new Jefe("Pepe");
        j1.agregarMinion(m1);
        j1.agregarMinion(m2);
        j1.agregarMinion(m3);
        j1.agregarMinion(m4);
        j1.agregarMinion(m5);

        ArrayList<Minion> minionsEsperado = new ArrayList<>();
        minionsEsperado.add(m1);
        minionsEsperado.add(m2);
        minionsEsperado.add(m3);
        minionsEsperado.add(m4);
        minionsEsperado.add(m5);
        ArrayList<Minion> minionsResultado = j1.masOjosSinGafas();

        assertEquals(minionsEsperado.size(), minionsResultado.size());
        Iterator it = minionsEsperado.iterator();
        int c=0;
        while (it.hasNext()) {
            Minion minionEsperado = (Minion)it.next();
            if (minionsEsperado.contains(minionEsperado)) {
                c++;
            }
        }
        assertTrue(c==minionsEsperado.size());
    }
        //Hacer pruebas de dos metodos que esten bien.


}
