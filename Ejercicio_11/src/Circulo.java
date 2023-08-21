
public class Circulo extends Figura{
    private int radio;
    static double npi=3.1416;

    public Circulo(String color, Boolean coloreada, int radio) {
        super(color, coloreada);
        this.radio = radio;
    }
    public int area(int radio){
        double narea = npi*(radio*radio);
        return (int) narea;
    }
}

