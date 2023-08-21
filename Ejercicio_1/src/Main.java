import Ejercicio1.HorasExtras;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //atributos
        int horasTrab;
        final int jornada=40;
        final double ingreso=40;


        //pedimos las horas trabajadas y la almacenamos en horasTrab
        System.out.println("Ingrese horas trabajadas: ");
        Scanner imput = new Scanner(System.in);
        horasTrab=imput.nextInt();

        HorasExtras horas = new HorasExtras(horasTrab,ingreso);
        int a=horas.calcHoras(horasTrab,jornada,ingreso);
        if (a<=1600){
            System.out.println("El trabajador no registra horas extras y su pago es: $"+a);
        }
        else{
            System.out.println("El trabajador tiene horas extras y su pago es: $"+a);
        }
    }
}
