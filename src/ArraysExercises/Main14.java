package ArraysExercises;

public class Main14 {
//    Exercício 14: Encontrar o Segundo Maior Número
//    Crie um array de inteiros.
//    Encontre o maior número e o segundo maior número no array. Imprima os dois números.


    public static void main(String[] args) {
        int[] numeroAtual = {2,19,30,492,35,6,3,534};
        int primeiroMaiorNumero = Integer.MIN_VALUE;
        int segundoMaiorNumero = Integer.MIN_VALUE;
        for (int index = 0; index < numeroAtual.length; index++) {
            if (numeroAtual[index] > primeiroMaiorNumero) {
                segundoMaiorNumero = primeiroMaiorNumero;
                primeiroMaiorNumero = numeroAtual[index];

            } else if (numeroAtual[index] > segundoMaiorNumero) {
                segundoMaiorNumero = numeroAtual[index];
            }
            System.out.println(segundoMaiorNumero);
            System.out.println(primeiroMaiorNumero);
        }
    }
}