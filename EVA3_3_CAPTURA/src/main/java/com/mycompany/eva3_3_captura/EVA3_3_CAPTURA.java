/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_3_captura;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class EVA3_3_CAPTURA {

    public static void main(String[] args) {
        String nombre = capturaTexto("INTRODUCE TU NOMBRE");
        String apellido = capturaTexto("INTRODUCE TU APELLIDO");
        System.out.println("nombre :" + nombre);
        System.out.println("apellido :" + apellido);
        int edad = capturaEnteros("Introduce tu edad");
        System.out.println("SUELDO :" + sueldo);
        System.out.println("EDAD :" + edad);


    }
    public static String capturaTexto(String mensaje){
    
    Scanner cap = new Scanner(System.in);
        System.out.println(mensaje);
        String texto = cap.nextLine();
        return texto;
    }
    public static int capturaEnteros(int entero){
    Scanner cap = new Scanner(System.in);
        System.out.println(entero);
         int num = cap.nextInt();
        return num;
    
    }
     public static double capturaCentavo(double sueldo){
    
    Scanner cap = new Scanner(System.in);
        System.out.println(sueldo);
        double dinero = cap.nextInt();
        return dinero;
    }
}
