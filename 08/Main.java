// ! Suma de los numeros impares del 1 al 15
public class Main {
    public static void main(String args[]) {
        int r = 0;
        for(int i = 1; i <= 15; i++){
            if(i % 2 != 0){
                r += i;
            }
        }
        System.out.println("Suma: " + r);
    }
}