import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       /* int[] temperaturas = {95, 120, 68, 34, 276, 34, 145};
        System.out.println("Temperatuars mayores a 100ºC");

        for (int i = 0; i < temperaturas.length ; i++) {
            if (temperaturas[i] > 100) {
                System.out.println(temperaturas[i] + " grados");
            }
        }
        //Ejercicio 2
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
        //Ejercicio 3
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
        sc.close();*/


        //Ejercicio 4
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

