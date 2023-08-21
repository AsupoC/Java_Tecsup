public class Triangulo extends Figura{
    private int ladoA;
    private int ladoB;
    private int ladoC;
    public Triangulo(String color, boolean coloreada, int ladoa, int ladob, int ladoc){
        super(color, coloreada);
        this.ladoA=ladoa;
        this.ladoB=ladob;
        this.ladoC=ladoc;
    }
}
