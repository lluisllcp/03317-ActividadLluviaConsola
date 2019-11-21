/* 
 * Copyright 2019 Lluís CP - aw.lluiscerda@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Random;

/**
 *
 * @author Lluís CP - aw.lluiscerda@gmail.com
 */
public class Main {

    public static final Random RND = new Random();

    public static void main(String[] args) {
//Constantes
        final int LLUVIA_MIN = 0;
        final int LLUVIA_MAX = 500;
        final int DIAS_MIN = 0;
        final int DIAS_MAX = 7;
//Constantes switch
        final String DIA1 = "Lunes";
        final String DIA2 = "Martes";
        final String DIA3 = "Miercoles";
        final String DIA4 = "Jueves";
        final String DIA5 = "Viernes";
        final String DIA6 = "Sabado";
        final String DIA7 = "Domingo";
//Variables
        int dia = 0;
        int diaMin = 0;
        int diaMax = 7;
        int suma = 0;
        int media;
        int cantidadLitros;
        String Diasem = null;
        String DiaMin = null;
        String DiaMax = null;
        int lluviaMin = 500;
        int lluviaMax = 0;
        //cabecera
        System.out.println("\t Actividad lluvia semanal");
        System.out.println("\t-------------------------");
//Bucle
        for (int i = DIAS_MIN; i < DIAS_MAX; i++) {
//Random lluvia diaria
            cantidadLitros = RND.nextInt(LLUVIA_MAX - LLUVIA_MIN + 1) + LLUVIA_MIN;
//Dias
            switch (dia + 1) {
                case 1:
                    Diasem = DIA1;
                    break;
                case 2:
                    Diasem = DIA2;
                    break;
                case 3:
                    Diasem = DIA3;
                    break;
                case 4:
                    Diasem = DIA4;
                    break;
                case 5:
                    Diasem = DIA5;
                    break;
                case 6:
                    Diasem = DIA6;
                    break;
                case 7:
                    Diasem = DIA7;
                    break;
            }

            //Salida litros por dia
            System.out.printf("El %s - %03d l/m2 %n", Diasem,
                    cantidadLitros);
            //suma litros dia
            suma += cantidadLitros;
            //Aumenta dias
            dia++;

            //comprobar dia menos lluvia
            if (cantidadLitros < lluviaMin) {
                lluviaMin = cantidadLitros;
                diaMin = dia;
                //comprobar dia mas lluvia
                if (cantidadLitros > lluviaMax) {
                    lluviaMax = cantidadLitros;
                    diaMax = dia;
                }

            }
        }
        //Switch dia menos llovio
        switch (diaMin) {
            case 1:
                DiaMin = DIA1;
                break;
            case 2:
                DiaMin = DIA2;
                break;
            case 3:
                DiaMin = DIA3;
                break;
            case 4:
                DiaMin = DIA4;
                break;
            case 5:
                DiaMin = DIA5;
                break;
            case 6:
                DiaMin = DIA6;
                break;
            case 7:
                DiaMin = DIA7;
                break;
        }
        //Switch  dia que mas llovio
        switch (diaMax) {
            case 1:
                DiaMax = DIA1;
                break;
            case 2:
                DiaMax = DIA2;
                break;
            case 3:
                DiaMax = DIA3;
                break;
            case 4:
                DiaMax = DIA4;
                break;
            case 5:
                DiaMax = DIA5;
                break;
            case 6:
                DiaMax = DIA6;
                break;
            case 7:
                DiaMax = DIA7;
                break;
        }
        //calculo media
        media = suma / DIAS_MAX;

        //Salida menor lluvia
        System.out.printf("%nEl dia que menos llovio fue el %s - %03d"
                + "l/m2 %n", DiaMin, lluviaMin);
        //Salida mayor lluvia
        System.out.printf("El dia que mas llovio fue el %s - %03d"
                + "l/m2 %n", DiaMax, lluviaMax);
        //Salida de la media
        System.out.printf("La media es de ...: %3d l/m2 %n%n", media);
    }
}
