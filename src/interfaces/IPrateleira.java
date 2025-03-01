public interface IPrateleira {
    public int buscar(IBolo bolo);
    public boolean cheia();
    public boolean vazia();
    public boolean existe(IBolo bolo);
    public boolean inserir(IBolo bolo);
    public IBolo remover(IBolo bolo);
    public IBolo remover(int posicao);
    public IBolo consultar(IBolo bolo);
    public IBolo[] listar();
    public IBolo[] listar(char tipoDoBolo);
}
