import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Ejercicio 1 La NASA está probando sensores de temperatura en las alas de un avión experimental.
        //Crea un array de enteros que represente las temperaturas registradas en cada ala. Recorre el
        //array y muestra únicamente las temperaturas que superan los 100 grados.

        int[] temperaturas = {95, 120, 68, 34, 276, 34, 145};
        System.out.println("Temperatuars mayores a 100ºC");

        for (int i = 0; i < temperaturas.length ; i++) {
            if (temperaturas[i] > 100) {
                System.out.println(temperaturas[i] + " grados");
            }
        }
        //Ejercicio 2 Un streamer guarda la cantidad de espectadores en cada hora de transmisión en un array.
        //Recorre el array e imprime en quéhoras el número de espectadores fue mayor a 1000.
        //Además, cuenta cuántas veces se superó esa cifra.

        int[] viwers = new int[10];
        int[] mayoresQue1000 = new int[10];
        int[] menoresQue1000 = new int[10];
        int contMayor = 0;
        int contMenor = 0;
        for (int x = 0; x < viwers.length; x++) {
            viwers[x] = (int) (Math.random() * 1500) + 1; //
            if (viwers[x] > 1000) {
                mayoresQue1000[contMayor] = viwers[x];
                contMayor++;
            } else {
                menoresQue1000[contMenor] = viwers[x];
                contMenor++;
            }
        }
        System.out.println("Números mayores que 1000:");
        for (int i = 0; i < contMayor; i++) {
            System.out.println(mayoresQue1000[i] + " numeros mayores");
        }

        // Luego los menores o iguales a 1000
        System.out.println("Números menores o iguales a 1000:");
        for (int i = 0; i < contMenor; i++) {
            System.out.println(menoresQue1000[i] + " numeros menores");
        }
        //Ejercicio 3 Un banco registra en un array los movimientos de una cuenta (positivos ingresos,
        //negativos gastos). Recorre el array y calcula el saldo final. Muestra también cuántos
        //movimientos fueron ingresos y cuántos fueron gastos.

        Scanner sc = new Scanner(System.in);
        System.out.println(" Cuantos movimientos quieres hacer? ");
        int n = sc.nextInt();
        int[] movimientos = new int[n];
        int saldo = 0;
        int ingresos = 0;
        int gastos = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Ingresa el numero de movimientos que quieras hacer " + (i + 1) + ": ");
            movimientos[i] = sc.nextInt();
            saldo += movimientos[i];
            if (movimientos[i] > 0) {
                ingresos++;
            } else if (movimientos[i] < 0) {
                gastos++;
            }
        }
        System.out.println("====Resumen de la cuneta====");
        System.out.println("Saldo Final: " + saldo + " €");
        System.out.println("Numero de ingresos: " + ingresos);
        System.out.println("Numero de gastos: " + gastos);
        sc.close();


        //Ejercicio 4 . Un profesor guarda las notas de 20 alumnos en un array. Recorre el array y determina
        //cuántos alumnos han aprobado (nota >= 5). Crea una función que reciba una nota y
        //devuelva si es aprobado o suspenso.

        int[] notasClase = {10, 5, 3, 4, 6, 7, 8, 9, 3, 1, 6, 8, 5, 7, 8, 9, 4, 3, 2, 5};
        System.out.println("Notas de clase");
        for (int h = 0; h < notasClase.length; h++) {
            if (notasClase[h] >= 5) {
                System.out.println(notasClase[h] + "!HAS APROBADO¡");
            } else {
                System.out.println(notasClase[h] + " HAS SUSPENDIDO:(");
            }
        }
        comprobanteNotas(notasClase);

        //Ejercicio 5 Tienes un array con el tiempo de ejecución (en milisegundos) de varios algoritmos.
        //Recorre el array y encuentra cuál fue el tiempo más rápido y el más lento.

        double[] numeros = {0.7346,0.2225,0.4214,0.1153};
        double minima = numeros[0];
        double maxima = numeros[0];
        for (int i = 1;i<numeros.length;i++){
            if (numeros[i]<minima){
                minima = numeros[i];
            }
            if (numeros[i] > maxima){
                maxima = numeros[i];
            }
        }
        System.out.println("el numero mas pequeño es " + minima);
        System.out.println("el numero mas grande es " + maxima);*/

        //Ejercicio 6 En un partido de baloncesto, un array almacena los puntos anotados por cada jugador de
        //un equipo. Recorre el array y muestra el total de puntos del equipo. Además calcula la media
        //de puntos por jugador.

        int[] juan = {3,2,1,3,2,3,3,2,3,2};
        int[] sergio = {3,2,2,1,2,1,1,2,3,3};
        int sumaJ = 0;
        int sumaS = 0;
        for ( int i = 0; i < juan.length; i++) {
            sumaJ += juan[i];
        }
        System.out.println("La suma de juan " + sumaJ);
        for ( int e = 0; e < sergio.length; e++){
            sumaS += sergio[e];
        }
        System.out.println("Suma de sergio " + sumaS);
        System.out.println("Suma total " + (sumaJ + sumaS));

        }

    public static  void comprobanteNotas(int[] notas) {
        Scanner ph = new Scanner(System.in);
        System.out.println("Di posicionamiento");
        int posicion = ph.nextInt();
        if(posicion < 1 || posicion > notas.length) {
            System.out.println("no valido");
        }else {
            int nota = notas[posicion-1];
            System.out.println(" La nota del alumno " + posicion + " es: " + nota);

            if(nota >= 5){
                System.out.println("Aprobaado");
            }else{
                System.out.println("SUSPENDIDO");
            }
        }
       ph.close();

    }
}

