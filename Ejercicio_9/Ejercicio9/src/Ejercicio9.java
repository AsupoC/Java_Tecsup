import java.util.Scanner;

public class Ejercicio9 {

    public void fillArray(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Ingrese tamaño de array : ");

        int tamañoArray = myObj.nextInt();
        int array[] = new int[tamañoArray];
        for (int i=0; i < tamañoArray; i++) {
            array[i] = (int)(Math.random()*100+1);
            System.out.print(array[i]+" ");
        }
        System.out.println();
        for (int j=tamañoArray-1; j>=0; j--){
            System.out.print(array[j] +  " ");
        }
    }

}
