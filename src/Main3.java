public class Main3 {
//    Exercício 3: Buscar por um Elemento no Array
//    Agora, vamos fazer um exercício onde você precisa procurar um valor específico
//    em um array e imprimir se ele foi encontrado ou não.//
//    Passos:
//    Crie um array de inteiros.
//    Crie uma variável para armazenar o valor que você deseja buscar.
//    Use um loop para percorrer o array e verificar se o valor existe.
//    Se encontrar o valor, imprima "Valor encontrado!" e saia do loop.

    public static void main(String[] args) {
        int[] arrayInteiro = {1, 2, 3, 4, 5};
        int valorProcurado = 3;


        for (int i = 0; i < arrayInteiro.length; i++) {
            if (valorProcurado == arrayInteiro[i]) {
                System.out.println("Valor encontrado foi " + valorProcurado);
                return;
            }

        }
        System.out.println("Não encontrado no array");
    }
}
