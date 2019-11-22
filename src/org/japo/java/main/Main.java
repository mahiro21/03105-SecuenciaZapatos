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
        int patasAnimal1;
        int patasAnimal2;
        int patasAnimal3;
        int patasAnimal4;

        //Constantes
        final String ANIMAL_1 = "Vaca";
        final int VACA = 3;
        final String ANIMAL_2 = "Oveja";
        final int OVEJA = 14;
        final String ANIMAL_3 = "Burro";
        final int BURRO = 2;
        final String ANIMAL_4 = "Gallina";
        final int GALLINA = 18;

        final int CUADRUPEDO = 4;
        final int BIPEDO = 2;

        //Operaciones
        System.out.printf("Secuencia de Kung-Fu%n====================%n");
        //Vaca
        System.out.printf("Animal ........: %s%n", ANIMAL_1);
        System.out.printf("Cantidad .......: %d%n", VACA);
        patasAnimal1 = VACA * CUADRUPEDO;
        System.out.printf("Patas ..........: %d%n", patasAnimal1);
        //Oveja
        System.out.printf("---%n");
        System.out.printf("Animal ........: %s%n", ANIMAL_2);
        System.out.printf("Cantidad .......: %d%n", OVEJA);
        patasAnimal2 = OVEJA * CUADRUPEDO;
        System.out.printf("Patas ..........: %d%n", patasAnimal2);
        System.out.printf("---%n");
        //Burro
        System.out.printf("Animal ........: %s%n", ANIMAL_3);
        System.out.printf("Cantidad .......: %d%n", BURRO);
        patasAnimal3 = BURRO * CUADRUPEDO;
        System.out.printf("Patas ..........: %d%n", patasAnimal3);
        System.out.printf("---%n");
        //Gallina
        System.out.printf("Animal ........: %s%n", ANIMAL_4);
        System.out.printf("Cantidad .......: %d%n", GALLINA);
        patasAnimal4 = GALLINA * BIPEDO;
        System.out.printf("Patas ..........: %d%n", patasAnimal4);
        System.out.printf("---%n");
        //Totales
        totalPatas = patasAnimal1 + patasAnimal2 + patasAnimal3 + patasAnimal4;
        System.out.printf("Total de Patas .: %d%n", totalPatas);
        totalPares = totalPatas / 2;
        System.out.printf("Total de Pares .: %d%n", totalPares);
    }
}
