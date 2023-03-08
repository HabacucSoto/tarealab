// ! Calcular factorial de un numero

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa el numero a factorializar:");
        int n = in.nextInt();
        int r = 1;
        for(int i = n; i > 0; i--){
            r *= i;
        }
        System.out.println("Factorial: " + r);
    }
}