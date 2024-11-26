package ArraysExercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Main12 {
//    Exercício 12: Remover um Elemento de um Array
//    Crie um array de inteiros. Peça para o usuário (ou defina) um número a ser removido.
//    Remova todas as ocorrências desse número do array. Imprima o array resultante
//    após a remoção.

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 5 numeros para por na lista");
        for (int i = 0; i < 5; i++) {
            int numero = sc.nextInt();
            lista.add(numero);

        }
        System.out.println(lista);
        System.out.println("Digite um numero para retirar da lista");
        int numeroRemovido = sc.nextInt();

        if (lista.contains(numeroRemovido)) {
            lista.remove(Integer.valueOf(numeroRemovido));
            System.out.println("Removido o " + numeroRemovido);
        } else {
            System.out.println("O numero não foi encontrado na lista");
        }
        System.out.println(lista);
    }
}
