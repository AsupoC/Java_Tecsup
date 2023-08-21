import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int litrosConsumo;
    final int litrosSinCosto=50;
    final double costoAdic1=0.5;
    final double costoAdic2=1.5;
    final double costoFijo=10.00;
    Scanner imput = new Scanner(System.in);
    System.out.println("Ingrese los litros consumidos: ");
    litrosConsumo=imput.nextInt();
    int litrosAdic = litrosConsumo - litrosSinCosto;
    double resul;
    if (litrosConsumo > litrosSinCosto){
        if (litrosConsumo > litrosSinCosto && litrosConsumo < 201){
            resul = costoFijo + (litrosAdic * costoAdic1);
            System.out.println("Consumo en litros es: "+litrosConsumo+" y el costo es: $"+resul);
        }
        else {
            int a=litrosConsumo-200;
            int b=150;
            resul=costoFijo+(a*costoAdic2)+(b*costoAdic1);
            System.out.println("Consumo en litros es: "+litrosConsumo+" y el costo es: $"+resul);
        }
    }
    else {
       resul = costoFijo;
        System.out.println("Consumo en litros es: "+litrosConsumo+" y el costo es: $"+resul);
    }
    }
}