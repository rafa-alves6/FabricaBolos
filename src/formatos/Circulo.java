public class Circulo implements IFormato{
    double raio, area;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        area = Math.PI * Math.pow(raio, 2);
        return area;
    }
}
