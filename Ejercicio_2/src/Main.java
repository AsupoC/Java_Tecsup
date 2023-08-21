import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int edad;
        Scanner imput = new Scanner(System.in);
        System.out.println("Ingrese la edad del invitado: ");
        edad = imput.nextInt();
        System.out.println("El invitado tiene: "+edad);
        int a=0;
        if(edad>=15){
            System.out.println("Indique si el invitado trajo regalo 1=SI / 0=NO ");
            a= imput.nextInt();
            if(a == 1){
                System.out.println("El invitado puede ingresar");
            }
            else {
                System.out.println("El invitado no puede ingresar");
            }
        }
        else {
            System.out.println("El invitado es menor de 15 años; PUEDE INGRESAR");
        }
    }
}