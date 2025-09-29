import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

       /* int[] temperaturas = {95, 120, 68, 34, 276, 34, 145};
        System.out.println("Temperatuars mayores a 100ºC");

        for (int i = 0; i < temperaturas.length ; i++) {
            if (temperaturas[i] > 100) {
                System.out.println(temperaturas[i] + " grados");
            }
        }*/
        //Ejercicio 2
        int[] viwers = new int[200];          // Array principal
        int[] mayoresQue1000 = new int[200];  // Para los números >1000
        int[] menoresQue1000 = new int[200];  // Para los números <=1000
        int contMayor = 0;
        int contMenor = 0;

        for (int x = 0; x < viwers.length; x++) {
            viwers[x] = (int) (Math.random() * 2000) + 1; // números entre 1 y 2000

            if (viwers[x] > 1000) {
                mayoresQue1000[contMayor] = viwers[x];
                contMayor++;
            } else {
                menoresQue1000[contMenor] = viwers[x];
                contMenor++;
            }
        }

        // Mostramos primero los mayores a 1000
        System.out.println("Números mayores que 1000:");
        for (int i = 0; i < contMayor; i++) {
            System.out.println(mayoresQue1000[i] + " numeros mayores");
        }

        // Luego los menores o iguales a 1000
        System.out.println("Números menores o iguales a 1000:");
        for (int i = 0; i < contMenor; i++) {
            System.out.println(menoresQue1000[i] + " numeros menores");
        }
    }
}

