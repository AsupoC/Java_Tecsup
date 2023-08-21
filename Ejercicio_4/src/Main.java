import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero;
        Scanner imput = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        numero=imput.nextInt();
        //int i=0;
        for(int i =1;i <= numero; i++ ){
            if(i % 2 > 0){
                System.out.println(i);
                i++;
            }
        }
    }
}