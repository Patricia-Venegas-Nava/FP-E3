/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_7_matrices;

/**
 *
 * @author Dell
 */
public class EVA3_7_MATRICES {

    public static void main(String[] args) {
  // TODO code application logic here
        int[] arreglo = new int[5];//ARREGLO UNIDIMENCIONAL
        int[][] matriz = new int[3][3];//HOJA DE EXCEL
        matriz[0][0] = 100; //PRIMER POSICION
        matriz[0][1] = 200;
        matriz[0][2] = 300;
        matriz[1][0] = 400;
        matriz[1][0] = 500;
        matriz[1][2] = 600;
        matriz[2][0] = 700;
        matriz[2][1] = 800;
        matriz[2][2] = 900; //ULTIMA POSICION
        
        for (int i = 0; i < 10; i++) {//FILAS->LER DIMENSION
            for (int j = 0; j < 3; j++) {//COLUMNAS->2DA DIM
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }    }
}
