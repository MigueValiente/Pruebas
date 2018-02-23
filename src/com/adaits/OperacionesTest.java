package com.adaits;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class OperacionesTest {

    @Test
    void sumarTest(){
        Operaciones o = new Operaciones();
        assertEquals(10, o.sumar(6,4));
    }

    @Test
    void sumarTest2(){
        Operaciones o = new Operaciones();
        assertNotEquals(10, o.sumar(6,6));
    }

    @Test
    void sumarTest3(){
        Operaciones o = new Operaciones();
        assertTrue(o.sumar(6,6) == 12);
    }

    @Test
    void sumarTest4(){
        Operaciones o = new Operaciones();
        assertFalse(o.sumar(3,4) == 12);
    }

    @Test
    void sumarTest5(){
        Operaciones o = null;
        assertNull(o);
    }

    @Test
    void sumarTest6(){
        Operaciones o = new Operaciones();
        assertNotNull(o);
    }

    @Test
    void sumarTest7(){
        Operaciones o = new Operaciones();
        assertSame(o,o);
    }

    @Test
    @DisplayName("Ejemplo de Iguales")
    void sumarTest8(){
        Operaciones o = new Operaciones();
        Operaciones o2 = new Operaciones();
        assertNotSame(o,o2);
    }

    @DisplayName("Ejemplo de Arrays")
    @Test
    void sumarTest9(){
        Operaciones o = new Operaciones();
        int[] numeros1 = new int[3];
        int[] numeros2 = new int[3];

        numeros1[0] = o.sumar(1,2);
        numeros1[1] = o.sumar(3,5);
        numeros1[2] = o.sumar(7,8);

        numeros2[0] = o.sumar(2,1);
        numeros2[1] = o.sumar(5,3);
        numeros2[2] = o.sumar(8,7);

        assertArrayEquals(numeros1,numeros2);
    }

    @DisplayName("Ejemplo de Arrays 2")
    @Test
    void sumarTest10(){
        Operaciones o = new Operaciones();
        Operaciones o2 = new Operaciones();

        Operaciones[] ops = new Operaciones[2];
        Operaciones[] ops2 = new Operaciones[2];

        ops[0] = o;
        ops[1] = o2;

        ops2[0] = o;
        ops2[1] = o2;


        assertArrayEquals(ops,ops2);
    }




}