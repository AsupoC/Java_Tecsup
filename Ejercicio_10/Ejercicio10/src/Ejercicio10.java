import java.util.Scanner;

public class Ejercicio10 {

    public void adivina() {
        int numeroMagico = 45;
        int adivinando = -1;
        do{
            Scanner myObj = new Scanner(System.in);
            System.out.print("Ingrese un numero");
            adivinando = myObj.nextInt();
            if (adivinando <1 || adivinando >100)
                System.out.println("Numero no valido, tiene que ser entre 1 a 100");
            if(adivinando > numeroMagico)
                System.out.println("Numero demasiado alto");
            if(adivinando < numeroMagico)
                System.out.println("Numero demasiado bajo");

        }while(adivinando != numeroMagico);
        System.out.println("Felicidades adivinaste el numero");
    }
}
