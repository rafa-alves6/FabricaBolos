public abstract class Bolo implements IBolo{
    // ATRIBUTOS
    protected int codigo;
    protected double custo;
    protected IFormato formato;

    // CONSTRUTORES
    public Bolo(int codigo, double custo) {
        setCodigo(codigo);
        setCusto(custo);
    }

    public Bolo(int codigo, double custo, IFormato formato) {
        setCodigo(codigo);
        setCusto(custo);
        setFormato(formato);
    }

    // ENCAPSULAMENTO
    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getCusto() {
        return this.custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public IFormato getFormato() {
        return this.formato;
    }

    public void setFormato(IFormato formato) {
        this.formato = formato;
    }


    // IMPLEMENTAÇÃO
    @Override
    public double preco() {
        return getCusto() * getFormato().area();
    }

    @Override
    public boolean equals(Object obj) {
        boolean resultado = false;
        if (obj != null && obj instanceof Bolo) {
            Bolo boloObject = (Bolo) obj;
            if (boloObject != null && this.getCodigo() == boloObject.getCodigo()) {
                resultado = true;
            }
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "Código: " + getCodigo() + ", Custo de Produção: " + getCusto() + ", Formato: " + getFormato() + ", Preço: " + preco();
    }
}
