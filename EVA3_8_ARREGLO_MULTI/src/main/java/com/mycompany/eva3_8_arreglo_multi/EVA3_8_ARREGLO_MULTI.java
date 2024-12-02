/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_8_arreglo_multi;

/**
 *
 * @author Dell
 */
public class EVA3_8_ARREGLO_MULTI {

    public static void main(String[] args) {
 int[][][] cubo = new int[10][10][10];
        //LLENADO
        System.out.println(cubo.length);
        System.out.println(cubo[1].length);
        System.out.println(cubo[0][0].length);
        for (int i = 0; i < cubo.length; i++) {//1era DIMENCION
            for (int j = 0; j < cubo.length; j++) {//2da DIMENCION
                for (int k = 0; k < cubo[i][j].length; k++) {//3era DIMENCION
                    cubo[i][j][k] = (int)(Math.random() * 100);
                }
            }
        }
        //IMPRIMIR LOS VALORES
        for (int i = 0; i < cubo.length; i++) {//1era DIMENCION
            for (int j = 0; j < cubo.length; j++) {//2da DIMENCION
                for (int k = 0; k < cubo[i][j].length; k++) {//3era 
                     System.out.print("[" + cubo[i][j][k] + "]");   
                }
}
        }
    }