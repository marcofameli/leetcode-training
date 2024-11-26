package ArraysExercises;

import java.util.Random;

public class Main2 {
    public static void main(String [] args) {
        int[] numeros = {2, 3, 4, 5, 6, 7, 9};
        Random random = new Random();
        int indiceAleatorio = random.nextInt(numeros.length);
        int numeroSorteado = numeros[indiceAleatorio];

        System.out.println(numeroSorteado);
    }

}
