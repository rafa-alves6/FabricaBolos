public class Quadrado implements IFormato{
    double lado, area;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        area = Math.pow(lado, 2);
        return area;
    }
}
