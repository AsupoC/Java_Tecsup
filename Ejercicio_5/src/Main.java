import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        System.out.println("Ingrese número de elementos: ");
        int n=imput.nextInt();
        int [] numeros = new int[n];
        for (int e=0; e<n; e++) {
            numeros[e] = (int) (Math.random() * 100);
            //System.out.println(numeros[e]);
        }
        for(int i=0; i<numeros.length;i++){
            System.out.println("El elemento "+i+" es: "+numeros[i]);

        }
    }
}