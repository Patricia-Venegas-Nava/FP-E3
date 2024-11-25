/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_5_metodos_arreglos;

/**
 *
 * @author Dell
 */
public class EVA3_5_METODOS_ARREGLOS {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    
    String diasSemana[] ={"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
    imprimirAreglo(diasSemana);
    String meses[] = {"Enero", "Febrero", "Martzo", "Abril", "Mayo", "Junio", "Julio",
        "Agosto", "Septiembre", "octubre", "Noviembre", "Diciembre",};
    imprimirAreglo(meses);
    int biletes[] = {20, 50, 100, 200, 500, 1000};
    imprimirBilletes(biletes);
    
    }
    public static void imprimirAreglo(String[] arreglo){
    for(int i = 0; i < arreglo.length; i++)
        System.out.println(arreglo[i]);
    }
     public static void imprimirBilletes(int[] arreglo){
    for(int i = 0; i < arreglo.length; i++)
        System.out.println(arreglo[i]);
    }
}
