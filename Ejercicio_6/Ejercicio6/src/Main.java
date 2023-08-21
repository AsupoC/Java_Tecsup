import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        Scanner imput = new Scanner(System.in);
        System.out.println("Ingrese numero: ");
        int a = imput.nextInt();
        Ejercicio6 ejercicio6= new Ejercicio6();
        ejercicio6.starIterator(a);
    }
}
