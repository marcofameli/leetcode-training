package ArraysExercises;

import java.util.Scanner;

public class Main8 {

//    Exercício 8: Contar Frequência de um Número no Array
//    Crie um array de inteiros.
//    Solicite ao usuário um número para buscar no array (ou defina um número fixo).
//    Conte quantas vezes o número aparece no array.
//    Imprima a quantidade.

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4, 5, 2};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero para buscar no array");
        int numeroBuscado = scanner.nextInt();
        int contador = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == numeroBuscado) {
                contador++;
                System.out.println(contador);
            }
        }
    }
}
