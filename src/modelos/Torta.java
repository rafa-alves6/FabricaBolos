public class Torta extends Bolo{
    // ATRIBUTOS
    private boolean recheio;
    private boolean cobertura;

    // CONSTRUTORES
    public Torta(int codigo, double custo, IFormato formato) {
        super(codigo, custo, formato);
    }

    public Torta(int codigo, double custo, IFormato formato, boolean recheio, boolean cobertura) {
        super(codigo, custo, formato);

    }

    // ENCAPSULAMENTO
    public boolean isCobertura() {
        return this.cobertura;
    }

    public void setCobertura(boolean cobertura) {
        this.cobertura = cobertura;
    }

    public boolean isRecheio() {
        return this.recheio;
    }

    public void setRecheio(boolean recheio) {
        this.recheio = recheio;
    }

    // IMPLEMENTAÇÃO


    @Override
    public double preco() {
        double preco = getCusto() * getFormato().area();
        if (isRecheio()) {
            preco += 12.5;
        }
        if (isCobertura()) {
            preco += 20;
        }
        return preco;
    }

    @Override
    public String toString() {
        return "Código: " + getCodigo() + ", Custo de Produção: " + getCusto() + ", Formato: " + getFormato() + ", Recheio: " + isRecheio() + ", Cobertura: " + isCobertura() + ", Preço: " + preco();
    }
}
