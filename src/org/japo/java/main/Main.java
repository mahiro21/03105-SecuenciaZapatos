/* 
 * Copyright 2019 Mario Merlos Abella <mario.merlos.alum@iescamp.es>.
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

import java.util.Locale;

/**
 *
 * @author Mario Merlos Abella <mario.merlos.alum@iescamp.es>
 */
public final class Main {

    public static void main(String[] args) {

        // Variables
        int totalPatas;
        int totalPares;
        int patasanimal1;
        int patasanimal2;
        int patasanimal3;
        int patasanimal4;

        //Constantes
        final String Animal1 = "Vaca";
        final int Vacas = 3;
        final String Animal2 = "Oveja";
        final int Ovejas = 14;
        final String Animal3 = "Burro";
        final int Burros = 2;
        final String Animal4 = "Gallina";
        final int Gallinas = 18;

        final int Cuadropedo = 4;
        final int Bipedo = 2;

        //Operaciones
        System.out.printf("Secuencia de Kung-Fu%n====================%n");
        //Vaca
        System.out.printf("Animal ........: %s%n", Animal1);
        System.out.printf("Cantidad .......: %d%n", Vacas);
        patasanimal1 = Vacas * Cuadropedo;
        System.out.printf("Patas ..........: %d%n", patasanimal1);
        //Oveja
        System.out.printf("---%n");
        System.out.printf("Animal ........: %s%n", Animal2);
        System.out.printf("Cantidad .......: %d%n", Ovejas);
        patasanimal2 = Ovejas * Cuadropedo;
        System.out.printf("Patas ..........: %d%n", patasanimal2);
        System.out.printf("---%n");
        //Burro
        System.out.printf("Animal ........: %s%n", Animal3);
        System.out.printf("Cantidad .......: %d%n", Ovejas);
        patasanimal3 = Ovejas * Cuadropedo;
        System.out.printf("Patas ..........: %d%n", patasanimal3);
        System.out.printf("---%n");
        //Gallina
        System.out.printf("Animal ........: %s%n", Animal4);
        System.out.printf("Cantidad .......: %d%n", Gallinas);
        patasanimal4 = Gallinas * Bipedo;
        System.out.printf("Patas ..........: %d%n", patasanimal4);
        System.out.printf("---%n");
        //Totales
        totalPatas = patasanimal1 + patasanimal2 + patasanimal3 + patasanimal4;
        System.out.printf("Total de Patas .: %d%n", totalPatas);
        totalPares = totalPatas / 2;
        System.out.printf("Total de Pares .: %d%n", totalPares);
    }
}
