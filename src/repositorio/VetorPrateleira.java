public class VetorPrateleira implements IPrateleira{
    // ATRIBUTOS
    private IBolo[] prateleira;
    private int qtdBolo;


    // CONSTRUTORES
    public VetorPrateleira(int qtdBolo) {
        setQtdBolo(qtdBolo);
        this.prateleira = new IBolo[getQtdBolo()];
    }

    // ENCAPSULAMENTO
    public int getQtdBolo() {
        return this.qtdBolo;
    }

    public void setQtdBolo(int qtdBolo) {
        this.qtdBolo = qtdBolo;
    }

    public IBolo[] getPrateleira() {
        return this.prateleira;
    }

    // IMPLEMENTAÇÃO
    @Override
    public int buscar(IBolo bolo) {
        int index = -1;
        if (existe(bolo)) {
            for (int i = 0; i < getQtdBolo(); i++) {
                if (getPrateleira()[i] != null) {
                    if (getPrateleira()[i].equals(bolo)) {
                        index = i;
                    }
                }
            }
        }
//        System.out.print("Index: " + index);
        return index;
    }

    @Override
    public boolean cheia() {
        for (int i = 0; i < getQtdBolo(); i++) {
            if(getPrateleira()[i] == null) {
//                System.out.println("false");
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean vazia() {
        boolean resultado = true;
        for (int i = 0; i < getQtdBolo(); i++) {
            if(getPrateleira()[i] != null) {
                resultado = false;
            }
        }
        return resultado;
    }

    @Override
    public boolean existe(IBolo bolo) {
        boolean encontrado = false;
        if (!vazia()) {
            if (bolo != null) {
                for (int i = 0; i < getQtdBolo(); i++) {
                    if (getPrateleira()[i] != null) {
                        if (getPrateleira()[i].equals(bolo)) {
                            System.out.println("Bolo encontrado!");
                            return true;
                        }
                    }
                }
            }
            if (!encontrado) {
                System.out.println("Bolo não encontrado.");
            }
        }
        return encontrado;
    }

    @Override
    public boolean inserir(IBolo bolo) {
        if (existe(bolo)) {
            System.out.println("Bolo já cadastrado!");
            return true;
        } else {
            for (int i = 0; i < getQtdBolo(); i++) {
                if (getPrateleira()[i] == null) {
                    getPrateleira()[i] = bolo;
                    System.out.println("Bolo cadastrado com suscesso!");
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public IBolo remover(IBolo bolo) {
        boolean encontrado = false;
        if (bolo != null) {
            for (int i = 0; i < getQtdBolo(); i++) {
                if (getPrateleira()[i] != null) {
                    if (getPrateleira()[i].equals(bolo)) {
                        getPrateleira()[i] = null;
                        setQtdBolo(getQtdBolo() - 1);
                        encontrado = true;
                        System.out.println("Bolo removido com sucesso!");
                    }
                }
            }
        }
        if (!encontrado) {
            System.out.println("O bolo não foi encontrado.");
        }
        return null;
    }

    @Override
    public IBolo remover(int posicao) {
        if (getPrateleira()[posicao] != null) {
            getPrateleira()[posicao] = null;
            System.out.println("Bolo removido com sucesso!");
        } else {
            System.out.println("O bolo não foi encontrado.");
        }
        return null;
    }

    @Override
    public IBolo consultar(IBolo bolo) {
        for (IBolo item : getPrateleira()) {
            if (item.equals(bolo)) {
                return item;
            }
        }
        return null;
    }


    @Override
    public IBolo[] listar() throws VetorPrateleiraException{
        if (vazia()) {
            throw new VetorPrateleiraException("Prateleira Vazia!");
        } else {
            cabecalho();
            for (IBolo bolo : getPrateleira()) {
                if (bolo != null) {
                    System.out.println(bolo.toString());
                }
            }
            System.out.println("\n");
        }
        return null;
    }

    @Override
    public IBolo[] listar(char tipoDoBolo) {
        tipoDoBolo = Character.toLowerCase(tipoDoBolo);
        if (tipoDoBolo == 's' || tipoDoBolo == 't') {
            cabecalho();
            for (int i = 0; i < getQtdBolo(); i++) {
                Bolo boloPratelira = (Bolo) getPrateleira()[i];
                if (boloPratelira != null) {
                    if (tipoDoBolo == 's' && boloPratelira instanceof BoloSimples) {
                        System.out.println(boloPratelira.toString());
                    } else if (tipoDoBolo == 't' && boloPratelira instanceof Torta) {
                        System.out.println(boloPratelira.toString());
                    }
                }
            }
        } else {
            System.out.println("Tipo do Bolo inválido!");
        }
        System.out.println("\n");
        return null;
    }

    public void cabecalho() {
        int maior = 65;
        for (int i = 0; i < getQtdBolo() - 1; i++) {
            if (getPrateleira()[i + 1] != null && getPrateleira()[i] != null) {
                maior = getPrateleira().toString().length();
                if (getPrateleira()[i + 1].toString().length() > maior) {
                    maior = getPrateleira()[i + 1].toString().length();
                }
            }
        }
        String linha = "=".repeat(maior);
        String txtCentralizado = " ".repeat(maior / 2 - maior / 10);
        System.out.println(linha);
        System.out.println(txtCentralizado + "PRATELEIRA");
        System.out.println(linha);
    }

}
