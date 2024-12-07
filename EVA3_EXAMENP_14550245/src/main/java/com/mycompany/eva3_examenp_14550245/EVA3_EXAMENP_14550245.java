/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_examenp_14550245;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class EVA3_EXAMENP_14550245 {

    public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);

        // Solicitar el numero de estudiantes
        System.out.print("Ingresa el numero de estudiantes: ");
        int numEstudiantes = scanner.nextInt();

        //Verificar que el numero de estudiantes sea mayor a 0
        while (numEstudiantes <= 0) {
            System.out.println("El número de estudiantes debe ser mayor a 0.");
            System.out.print("Ingresa el número de estudiantes nuevamente: ");
            numEstudiantes = scanner.nextInt();
        }

        // Crear arreglo para las calificaciones
        double[] calificaciones = new double[numEstudiantes];

        // Pedir calificaciones a los usuarios
        for (int i = 0; i < numEstudiantes; i++) {
            System.out.print("Ingresa la calificacion del estudiante " + (i + 1) + " (entre 0 y 100): ");
            double calificacion = scanner.nextDouble();

            // Validar que la calificacion esté entre 0 y 100
            while (calificacion < 0 || calificacion > 100) {
                System.out.println("La calificacion debe estar entre 0 y 100.");
                System.out.print("Ingresa nuevamente la calificacion del estudiante " + (i + 1) + ": ");
                calificacion = scanner.nextDouble();
            }

            calificaciones[i] = calificacion;
        }

        // Calcular promedio
        double promedio = calcularPromedio(calificaciones);

        // Contar las calificaciones mayores o iguales al promedio
        int cantidadMayoresPromedio = contarCalificacionesMayores(calificaciones, promedio);

        // Obtener la calificacion mas alta
        double calificacionMasAlta = obtenerCalificacionMasAlta(calificaciones);

        // Obtener la calificacion mas baja
        double calificacionMasBaja = obtenerCalificacionMasBaja(calificaciones);

        // Imprimir los resultados
        System.out.println("--- Resultados ---");
        System.out.println("Promedio de las calificaciones: " + promedio);
        System.out.println("Cantidad de calificaciones mayores o iguales al promedio: " + cantidadMayoresPromedio);
        System.out.println("Calificacion mas alta: " + calificacionMasAlta);
        System.out.println("Calificacion mas baja: " + calificacionMasBaja);

        scanner.close();
    }

    // Metodo para calcular el promedio
    public static double calcularPromedio(double[] calificaciones) {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }

    // Metodo para contar calificaciones mayores o iguales al promedio
    public static int contarCalificacionesMayores(double[] calificaciones, double promedio) {
        int contador = 0;
        for (double calificacion : calificaciones) {
            if (calificacion >= promedio) {
                contador++;
            }
        }
        return contador;
    }

    // Metodo para obtener la calificación mas alta
    public static double obtenerCalificacionMasAlta(double[] calificaciones) {
        double maximo = calificaciones[0];
        for (double calificacion : calificaciones) {
            if (calificacion > maximo) {
                maximo = calificacion;
            }
        }
        return maximo;
    }

    // Metodo para obtener la calificación mas baja
    public static double obtenerCalificacionMasBaja(double[] calificaciones) {
        double minimo = calificaciones[0];
        for (double calificacion : calificaciones) {
            if (calificacion < minimo) {
                minimo = calificacion;
            }
        }
        return minimo;
    }
    }

