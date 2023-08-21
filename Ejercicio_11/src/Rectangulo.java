public class Rectangulo extends Figura{
    private int ancho;
    private int altura;
    public Rectangulo(String color, boolean coloreada, int ancho, int altura){
        super(color, coloreada);
        this.altura=altura;
        this.ancho=ancho;
    }
}
