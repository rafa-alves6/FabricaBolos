public class Main {
    public static void main(String[] args) {
        // FORMATOS
        IFormato circulo = new Circulo(5);
        IFormato quadrado = new Quadrado(10);
        IFormato retangulo = new Retangulo(8, 6);

        // BOLOS
        Bolo b0 = new BoloSimples(0, 25,circulo, true);
        Bolo b1 = new Torta(1, 18,quadrado);
        Bolo b2 = new BoloSimples(2, 18,quadrado);
        Bolo b3 = new Torta(3, 23,retangulo, true, false);
        Bolo b4 = new Torta(4, 25, circulo, true, true);

        // PRATELEIRA
        VetorPrateleira vp = new VetorPrateleira(10);


        try {
            vp.listar();
        }catch (VetorPrateleiraException e) {
            System.out.println("ERRO!: " + e.getMessage());
        }

        vp.inserir(b0);
        vp.inserir(b1);
        vp.inserir(b2);
        vp.inserir(b3);
        vp.inserir(b4);
        vp.listar();
    }
}