package com.example.android.operaciones;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    //regla numero 1 @Test
    //regle numero 2 public void
    //regla numero 3 nombre descriptivo de la prueba
    //teoria dice que tenga una prueba con datos correctos y una prueba con datos incorrectos

    @Test
    public void sumaDeDosNumerosDeFormaCorrecta(){
        //ve = Valor esperado, vr = Valor real, tercer valor es delta como una tolerancia
        double ve=4.0;
        double vr = Metodos.sumar(2,2);
        assertEquals(ve,vr,0);
    }

    @Test
    public void sumaDeDosNumerosDeFormaIncorrecta(){
        //ve = Valor esperado, vr = Valor real, tercer valor es delta como una tolerancia
        double ve=4.0;
        double vr = Metodos.sumar(1,2);
        assertNotEquals(ve,vr,0);
    }

    @Test
    public void restaDeDosNumerosDeFormaCorrecta(){
        //ve = Valor esperado, vr = Valor real, tercer valor es delta como una tolerancia
        double ve=-3.0;
        double vr = Metodos.restar(1,4);
        assertEquals(ve,vr,0);
    }

    @Test
    public void restaDeDosNumerosDeFormaIncorrecta(){
        //ve = Valor esperado, vr = Valor real, tercer valor es delta como una tolerancia
        double ve=10.0;
        double vr = Metodos.restar(5,2);
        assertNotEquals(ve,vr,0);
    }

    @Test
    public void multiplicacionDeDosNumerosDeFormaCorrecta(){
        //ve = Valor esperado, vr = Valor real, tercer valor es delta como una tolerancia
        double ve=25;
        double vr = Metodos.multiplicar(5,5);
        assertEquals(ve,vr,0);
    }

    @Test
    public void multiplicacionDeDosNumerosDeFormaIncorrecta(){
        //ve = Valor esperado, vr = Valor real, tercer valor es delta como una tolerancia
        double ve=11.0;
        double vr = Metodos.multiplicar(5,2);
        assertNotEquals(ve,vr,0);
    }

    @Test
    public void divisionDeDosNumerosDeFormaCorrecta(){
        //ve = Valor esperado, vr = Valor real, tercer valor es delta como una tolerancia
        double ve=5.0;
        double vr = Metodos.dividir(10,2);
        assertEquals(ve,vr,0);
    }

    @Test
    public void divisionDeDosNumerosDeFormaIncorrecta(){
        //ve = Valor esperado, vr = Valor real, tercer valor es delta como una tolerancia
        double ve=10.0;
        double vr = Metodos.dividir(5,2);
        assertNotEquals(ve,vr,0);
    }

    @Test
    public void denominadorDivisionIguaCero(){
        boolean estado = Metodos.denominadorDivisionCero(0,3);
        assertTrue(estado);
    }

    /*@Test(expected = IllegalArgumentException.class)
    public void denominadorDivisionIguaCero(){
        boolean estado = Metodos.denominadorDivisionCero(0,3);
        assertTrue(estado);
    }*/

    /*@Test (timeout = 10)
    public void pruebaLoopInfinito(){
        boolean estado = Metodos.loppInfinito();
        assertTrue(estado);
    }*/


}