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
    int numRamdon = (int) (Math.random()*100) + 1;
    int[] viwers = new int[200];
    int[] mayores = new int[200];
    int contador = 0;

     for (int x = 0; x <= 200-1; x++){
         viwers[x] = (int) (Math.random()*1000) + 800;
         System.out.println(viwers[x]);
         if (viwers[x] > 1000){
             mayores[contador] = viwers[x];
             contador++;
             System.out.println("Ha superado las visitas");
         }else{
             System.out.println("no ha superado");
         }
        }
        System.out.println("Han superado las visitas");
     }else{

    }
    }


