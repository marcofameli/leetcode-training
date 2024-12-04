package ListsExercises;

//2. Remover Elementos Repetidos
//Crie um ArrayList de inteiros chamado numeros e adicione alguns números repetidos
//como {1, 3, 5, 3, 7, 5, 8, 1, 10}.
//Crie um novo ArrayList chamado numerosSemRepeticao.
//Percorra o ArrayList original usando um loop for.
//Para cada elemento, verifique se ele já está no numerosSemRepeticao.
//Caso não esteja, adicione o elemento.
//Imprima o ArrayList numerosSemRepetidos.

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Integer> inteiros = new ArrayList<>();
        inteiros.add(1);
        inteiros.add(3);
        inteiros.add(5);
        inteiros.add(3);
        inteiros.add(7);
        inteiros.add(5);
        inteiros.add(8);
        inteiros.add(1);
        inteiros.add(10);
        ArrayList<Integer> numerosSemRepeticao = new ArrayList<>();

        for (int i = 0; i < inteiros.size(); i++) {
            if (!numerosSemRepeticao.contains(inteiros.get(i))) {
                numerosSemRepeticao.add(inteiros.get(i));
            }

        }
        System.out.println(numerosSemRepeticao);
    }
}