package ArraysExercises;

public class Main4 {
    //    Exercício 4:
//    Contar Números Pares em um Array
//    Crie um array de inteiros com alguns valores.
//    Percorra o array e conte quantos números pares existem nele.
//    Imprima a quantidade total de números pares.
    public static void main(String[] args) {
        int[] nums = {2, 2, 2, 3};
        int contador = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                contador++;
                System.out.println(contador);

            }
        }
        //Se o número atual do array dividido por 2 tiver resto igual a zero
        //ele é par, e não ímpar.


    }
}
