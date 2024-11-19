public class Main6 {
    //    Exercício 6:
    //    Soma dos Elementos Pares de um Array
//        Crie um array de inteiros.
//        Some apenas os números pares do array.
//        Imprima a soma total.
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int somaDosPares = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] % 2 == 0){
                somaDosPares += nums[i];
            }
        }
        System.out.println(somaDosPares);
    }

}
