package com.adaits;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MinionTest {

    static Minion[] minions;
    static int posMinionActual = 0;
    private Minion minionProbar = null;

    @BeforeAll
    static void crearPersonas(){
        Jefe gru = new Jefe("Gru");
        minions = new Minion[10];
        minions[0] = new Minion("Dave",30,"Banana",1,true);
        minions[1] = new Minion("Carl",15,"Villano",2,false);
        minions[2] = new Minion("Stuart",Integer.MAX_VALUE,"Papaya",1,false);
        minions[3] = new Minion("Jerry",Integer.MIN_VALUE,"Bello",2,true);
        minions[4] = new Minion("Jorge",17,"Gelato",1,true);
        minions[5] = new Minion("Tim",18,"Banana",2,false);
        minions[6] = new Minion("Mark",19,"Para tu",2,true);
        minions[7] = new Minion("Phil",Integer.MIN_VALUE -1,"Bee Doo",1,false);
        minions[8] = new Minion("Kevin",Integer.MAX_VALUE+1,"Papaya",1,true);
        for (int i = 0; i < minions.length-1; i++) {
            gru.agregarMinion(minions[i]);
        }
    }

    @BeforeEach
    void prepararMinionProbar(){
        minionProbar = minions[posMinionActual];
        System.out.println(minionProbar);
    }

    @AfterEach
    void aumentarPosicion(){
        posMinionActual +=1;
        System.out.println("POSICION ACTUAL: "+ posMinionActual);
    }

    @AfterAll
    static void terminar(){
        System.out.println("TODAS LAS PRUEBAS HAN TERMINADO");
    }



    @Test
    void probarEsUnVillano1(){
        assertTrue(minionProbar.esUnVillano());
    }

    @Test
    void probarEsUnVillano2(){
        assertFalse(minionProbar.esUnVillano());
    }

    @Test
    void probarEsUnVillano3(){
        assertTrue(minionProbar.esUnVillano());
    }

    @Test
    void probarEsUnVillano4(){
        assertFalse(minionProbar.esUnVillano());
    }

    @Test
    void probarEsUnVillano5(){
        assertFalse(minionProbar.esUnVillano());
    }
    @Test
    void probarEsUnVillano6(){
        assertTrue(minionProbar.esUnVillano());
    }
    @Test
    void probarEsUnVillano7(){
        assertTrue(minionProbar.esUnVillano());
    }
    @Test
    void probarEsUnVillano8(){
        assertTrue(minionProbar.esUnVillano());
    }
    @Test
    void probarEsUnVillano9(){
        assertFalse(minionProbar.esUnVillano());
    }






}