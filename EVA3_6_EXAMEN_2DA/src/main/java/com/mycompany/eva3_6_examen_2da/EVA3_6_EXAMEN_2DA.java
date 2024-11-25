/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_6_examen_2da;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class EVA3_6_EXAMEN_2DA {
    public static final int PIEDRA = 1;
    public static final int PAPEL = 2;
    public static final int TIJERA = 3;

    public static void main(String[] args) {
       int jugadaUsu;
       int jugadaComp;
       int resuJugadas;
       do{
           jugadaUsu = capturarJugada("INTRODUCE TU JUGADA (1-PIEDRA, 2-PAPEL, 3-TIJERAS, 0-SALIR)");
           jugadaComp = generarJugadaComp();
           resuJugadas = evaluarJugadas(jugadaUsu, jugadaComp);
       }while(jugadaUsu != 0);
       
    }
    public static int capturarJugada(String mensaje){
    Scanner cap = new Scanner(System.in);
        System.out.println(mensaje);
        int resu = cap.nextInt();
        return resu;
    
    }
    public static int generarJugadaComp(){
    int resu;
    double valor = Math.random();
    if((valor >= 0) && (valor <= 0.33))
        resu= 1;
    else if((valor >= 0.3) && (valor <= 0.66))
        resu= 1;
    else 
        resu = 3;
    return resu;
    }
    public static int evaluarJugadas(int JugadaU, int JugadaC){
    // 9 POSIBLES SOLUCIONES
    int resu;
    if((JugadaU == 1) && (JugadaC == 1))
        resu = 0;
    else if ((JugadaU == 1) && (JugadaC == 2))
        resu = 2;
    else if ((JugadaU == 1) && (JugadaC == 3))
        resu = 1;
     else if ((JugadaU == 2) && (JugadaC == 1))
        resu = 1;
    else if ((JugadaU == 2) && (JugadaC == 2))
        resu = 0;
     else if ((JugadaU == 2) && (JugadaC == 3))
        resu = 2;
    else if ((JugadaU == 3) && (JugadaC == 1))
        resu = 2;
     else if ((JugadaU == 3) && (JugadaC == 2))
        resu = 1;
    else  
        resu = 0;
        return resu;
    }
}
