/*
 * crea un arreglo de 100 posiciones que contenga los numeros del uno al cien para obtener la suma y 
 * la media de todos
*/
public class Main {
    public static void main(String args[]) {
        int[] arr = new int[100];
        int s = 0;
        for(int i = 1; i <= arr.length; i++){
            arr[i-1] = i;
            s += arr[i-1];
        }
        System.out.println("Suma: " + s);
        System.out.println("Promedio: " + (s / arr.length));
    }
}