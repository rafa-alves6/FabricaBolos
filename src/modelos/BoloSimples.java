public class BoloSimples extends Bolo{
    // ATRIBUTOS
    private boolean semLactose;

    // CONSTRUTORES
    public BoloSimples(int codigo, double custo, IFormato formato) {
        super(codigo, custo, formato);
        setSemLactose(false);
    }

    public BoloSimples(int codigo, double custo, IFormato formato, boolean semLactose) {
        super(codigo, custo, formato);
        setSemLactose(true);
    }

    // ENCAPSULAMENTO
    public boolean isSemLactose() {
        return this.semLactose;
    }

    public void setSemLactose(boolean semLactose) {
        this.semLactose = semLactose;
    }

    // IMPLEMENTAÇÃO
    @Override
    public double preco() {
        double preco = getCusto() * getFormato().area();
        if (isSemLactose()) {
            preco += 35;
        }
        return preco;
    }

    @Override
    public String toString() {
        return "Código: " + getCodigo() + ", Custo de Produção: " + getCusto() + ", Formato: " + getFormato() + ", Sem Lactose: " + isSemLactose() + ", Preço: " + preco();
    }
}
