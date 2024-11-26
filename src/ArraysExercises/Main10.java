package ArraysExercises;

import java.util.Scanner;

public class Main10 {
    //    Exercício 10: Verificar se um Número está no Array
//    Crie um array de inteiros.
//    Peça para o usuário (ou defina) um número a ser verificado.
//    Verifique se esse número está presente no array. Imprima uma mensagem informando se o número
//    foi encontrado ou não.
    public static void main(String[] args) {
        int[] array = {1, 23, 3, 45, 6};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um numero");
        int numeroEscolhido = scanner.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < array.length; i++) {
            if (numeroEscolhido == array[i]) {
                encontrado = true;
                System.out.println("O numero escolhido foi " + numeroEscolhido);
                break;
            }
        }
        if (!encontrado) {
            System.out.println("o numero escolhido " + numeroEscolhido + " Não foi encontrado");
        }

        scanner.close();
    }
}
