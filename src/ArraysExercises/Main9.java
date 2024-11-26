package ArraysExercises;

public class Main9 {
//    Exercícios 9: Soma dos Elementos Ímpares de um Array
//    Crie um array de inteiros. Some apenas os números ímpares do array. Imprima a soma total.
    public static void main (String []args){
        int [] nums = {1,2,3,4,5,6};
        int soma = 0;
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] % 2 != 0){
                soma += nums[i];
            }
        }
        System.out.println(soma);
    }
}
