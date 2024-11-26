package ArraysExercises;

public class Main13 {
//    Exercício 13: Multiplicar Todos os Elementos de um Array
//    Crie um array de inteiros. Multiplique todos os elementos entre si. Imprima o produto final.

    public static void main(String[] args) {
        int[] nums = {2,4,5,6,7,10};
        int multiplicado = 1;
        for (int i = 0; i < nums.length; i++) {
         multiplicado *= nums[i];
        }
        System.out.println("o valor é " + multiplicado);
    }

}