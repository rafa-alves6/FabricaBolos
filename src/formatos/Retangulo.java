public class Retangulo implements IFormato{
    double base, altura, area;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        area = base * altura;
        return area;
    }
}
