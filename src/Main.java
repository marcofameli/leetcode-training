public class Main {

//    Exercício 1: Soma dos Elementos de um Array
//    Vamos praticar com o exercício de soma de elementos de um array. O objetivo é percorrer um array e somar todos os seus elementos.
//
//    Passos:
//
//    Crie um array de inteiros com valores de sua escolha.
//    Crie uma variável soma para armazenar o resultado.
//    Use um loop para percorrer o array e somar os valores.
//    Imprima o resultado final da soma.
    public static void main(String[] args) {
    int [] nums = {1,2,3,4,5,6,7,8,9,10};
    int armazenador = 0;

    for (int i = 0; i < nums.length; i++) {
        armazenador += nums[i];
    }
        System.out.println(armazenador);
    }
}