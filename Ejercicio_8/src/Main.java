import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero;
        Scanner imput = new Scanner(System.in);
        System.out.println("Ingrese numero de elementos: ");
        numero=imput.nextInt();
        int [] num = new int[numero];
        for(int i=0;i<numero;i++){
            System.out.println("Ingrese valor del elemento "+i);
            int nelem=imput.nextInt();
            num[i]=nelem;
        }
        Arrays.sort(num);
        int maxNum=num[num.length-1];
        System.out.println("El valor máximo es: "+maxNum);
}
    }