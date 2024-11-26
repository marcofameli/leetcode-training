package ArraysExercises;

import java.util.Arrays;

public class Main5 {
    //    Exercício 5:
//    Inverter um Array
//    Crie um array de inteiros com alguns valores.
//    Crie um novo array que armazene os elementos do array original na ordem inversa.
//    Imprima o novo array.


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int[] reverse = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
                     // expressão para inverter o array
            reverse[i] = nums[nums.length - 1 - i];
        }
        System.out.println(Arrays.toString(reverse));

    }

}
