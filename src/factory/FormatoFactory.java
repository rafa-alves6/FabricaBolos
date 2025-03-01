public class FormatoFactory implements IFormato{

    public static void criarFormato(String tipo, double... parametros) {
        double area, lado, base, altura, baseMaior, baseMenor, raio;
        switch (tipo.toLowerCase().charAt(0)) {
            case 'q':
                lado = parametros[0];
                area = Math.pow(lado, 2);
            break;

            case 'c':
                raio = parametros[0];
                area = Math.PI * Math.pow(raio, 2);
            break;

            case 'r':
                base = parametros[0];
                altura = parametros[1];
                area = base * altura;
            break;

            case 't':
                baseMaior = parametros[0];
                baseMenor = parametros[1];
                altura = parametros[2];
                area = ((baseMenor + baseMaior) * altura) / 2;
            break;
        }
    }

    @Override
    public double area() {
        return 0;
    }
}
