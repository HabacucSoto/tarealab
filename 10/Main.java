// ! Promedio de 5,8,3,2,9

public class Main {
    public static void main(String args[]) {
        int[] numeros = {5, 8, 3, 2, 9};
        int r = 0;
        for(int i = 0; i < numeros.length; i++){
            r += numeros[i];
        }
        System.out.println(r / numeros.length);
    }
}