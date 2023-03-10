/*
 * genera un arreglo de 10 posiciones con numeros aleatorios no repetidos entre si 
*/

import java.util.Random;
import java.util.Arrays;

public class Main{
    public static void main(String args[]) {
        int[] arr = new int[10];
        Random rnd = new Random();
        for(int i = 0; i < arr.length; i++){
            int n = rnd.nextInt();
            if(!Arrays.asList(arr).contains(n)){
                arr[i] = n;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}