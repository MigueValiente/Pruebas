package com.adaits;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
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
    void probarOjosGafas1(){
        Minion m1 = new Minion(2,false);
        Jefe j1 = new Jefe("Pepe");
        j1.agregarMinion(m1);
        j1.masOjosSinGafas();
        ArrayList<Minion>minionsPrueba=new ArrayList<>();
        minionsPrueba.add(m1);
        assertEquals(j1.masOjosSinGafas().size(),minionsPrueba.size());
       for (int i = 0; i <j1.masOjosSinGafas().size() ; i++) {
           Minion minionRe=j1.getMinions().get(i);
           Minion minionF=minionsPrueba.get(i);
           assertSame(minionRe,minionF);
       }
   }

   //Hacer pruebas de dos metodos que esten bien.


}
