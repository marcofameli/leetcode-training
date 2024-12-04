package ListsExercises;

import java.util.ArrayList;
import java.util.Random;

public class Main {
//    Exercicio 1
//    Filtrar Números Pares e Ímpares
//
//    Crie um ArrayList de inteiros com 20 números aleatórios entre 1 e 100.

//    Separe os números em dois ArrayLists diferentes: um para números pares
//    e outro para números ímpares.
//
//    Imprima ambos os ArrayLists.

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            int randomNumber = random.nextInt(101);
            lista.add(randomNumber);
        }

        for (int numero : lista) {
            if (numero % 2 == 0) {
                pares.add(numero);
            } else {
                impares.add(numero);
            }
        }
            // FOR NORMAL
//        for (int i = 0; i < lista.size(); i++) {
//            int numero = lista.get(i); // Obtém o elemento na posição 'i'
//            if (numero % 2 == 0) {
//                pares.add(numero); // Adiciona aos pares
//            } else {
//                impares.add(numero); // Adiciona aos ímpares
//            }
//        }

        System.out.println(pares);
        System.out.println(impares);

    }
}
