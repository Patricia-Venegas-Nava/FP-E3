/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_2_valor_de_retorno;

/**
 *
 * @author Dell
 */
public class EVA3_2_VALOR_DE_RETORNO {

    public static void main(String[] args) {
        int resu;
        resu = sumarDosNumeros(5, 10);
        System.out.println("RESULTADO =" + resu);
        System.out.println("RESULTADO =" + sumarDosNumeros(5, 10));
        
        //NO LES INTERESA EL RESULTADO
        sumarDosNumeros(100, 200);
    }
    public static int sumarDosNumeros(int num1, int num2){
    int suma;
    suma = num1 + num2;
        return suma;
    
    }
}
