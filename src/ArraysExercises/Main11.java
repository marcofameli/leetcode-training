package ArraysExercises;

public class Main11 {
//    Exercício 11: Contar o Número de Ocorrências de um Número no Array
//    Crie um array de inteiros. Escolha um número específico.
//    Conte quantas vezes esse número aparece no array. Imprima o número de ocorrências

    public static void main(String[] args) {
        int[] a = {12, 3, 4, 5, 4, 5, 6, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4};
        int n = 4;
        int c = 0;

        for (int i = 0; i < a.length; i++) {
            if (n == a[i]) {
                c++;
            }
        }
        System.out.println("A quantidade que o numero escolhido apareceu foi " + c );
    }
}
