/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_9_multi;

/**
 *
 * @author Dell
 */
public class EVA3_9_MULTI {

    public static void main(String[] args) {
        int[] billetes = {20, 50, 100, 200, 500, 1000};
        String[][] ciudades = {{"Aguascalientes", "Jesus Maria", "Calvillo"},
        {"Ensenada", "Mexicali", "Tecate", "Tijuana"},
        {"La Paz", "Cavo San Lucas", "San Jose del Cabo"}};
        
        System.out.println(ciudades.length);
        System.out.println(ciudades[1].length);
        
        for(int i = 0; i < ciudades.length; i++){
        for(int j = 0; j < ciudades[i].length; j++){
            System.out.println(ciudades[i][j]);
        }
        }
    }
    }

