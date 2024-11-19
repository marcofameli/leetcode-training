import java.util.Arrays;

public class Main7 {
//    Exercício 7:
//    Duplicar os Elementos do Array
//    Crie um array de inteiros com alguns valores.
//    Percorra o array e multiplique cada elemento por 2.
//    Imprima o array resultante.
    public static void main(String[] args){
        int[] nums = {2,4,6,8,10};
        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i] * 2;
        }
        System.out.println(Arrays.toString(nums));
    }
}
