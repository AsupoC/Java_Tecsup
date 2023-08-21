package Ejercicio1;

public class HorasExtras {
    protected int horas;
    protected double ValorHora;
    private double pagoFinal;


    public HorasExtras(int horas, double valorHora) {
        this.horas = horas;
        ValorHora = valorHora;
    }

    public HorasExtras(int horas) {
        this.horas = horas;
    }

    public int calcHoras(int NumHora,int tope,double valHora){
        int horasExtra= NumHora-tope;
        pagoFinal = 0;
        if (horasExtra>0){
            if (horasExtra<=8){
                pagoFinal =(tope*valHora)+(horasExtra * (valHora*2));
            }
            else{
                int masdeOcho=horasExtra-8;
                pagoFinal =(tope*valHora)+((horasExtra-masdeOcho) * (valHora*2))+masdeOcho*(valHora*3);
            }
        }
        else {
            pagoFinal =NumHora * valHora;
        }
        return (int) pagoFinal;
    }
    public void mensaje(){

        System.out.println("Estamos en la clase HorasExtras... "+horas);
    }

//    public void calcHoras(int horasTrab) {
//    }
}
