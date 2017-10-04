package com.example.android.operaciones;

/**
 * Created by android on 03/10/2017.
 */

public class Metodos {

    public static double sumar(double n1, double n2){
        return n1 + n2;
    }

    public static double restar(double n1, double n2){
        return n1 - n2;
    }

    public static double multiplicar(double n1, double n2){
        return n1 * n2;
    }

    public static double dividir(double n1, double n2){
        return n1 / n2;
    }

    public static boolean denominadorDivisionCero ( double n2, int operacion){
        if (n2==0 && operacion==3) return true;
        else return false;
    }

    /*public static boolean denominadorDivisionCero ( double n2, int operacion){
        if (n2==0 && operacion==3) {
            throw  new IllegalArgumentException();
        }
        else return false;
    }*/

    public static boolean loppInfinito (){
        boolean a = true;
        while (a){
            a= true;
        }
        return a;
    }



}
