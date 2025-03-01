
# FabricaBolos

O projeto **FabricaBolos** é uma aplicação desenvolvida utilizando os conceitos de Programação Orientada a Objetos (POO) para modelar uma fábrica de bolos. O sistema utiliza interfaces, classes abstratas e classes concretas para representar diferentes tipos de bolos e suas características, como formato e tipo de massa.

## Estrutura do Projeto

Este projeto possui as seguintes principais entidades:

- **Interface `IFormato`**: Define o comportamento para formatos de bolos. Ela estabelece um contrato para que qualquer classe que implementá-la tenha métodos para definir o formato do bolo.

- **Interface `IBolo`**: Define as operações essenciais para qualquer tipo de bolo. As classes que implementam essa interface devem fornecer as funcionalidades para preparar e exibir o bolo.

- **Classe Abstrata `Bolo`**: Serve como base para outros tipos de bolos. Ela implementa a interface `IBolo` e define atributos e métodos comuns a todos os bolos, como nome, ingredientes e preço.

- **Classe `BoloSimples`**: Representa um tipo de bolo simples, que herda da classe `Bolo` e implementa as especificidades de um bolo simples.

- **Classe `Torta`**: Representa outro tipo de bolo, que pode ter características diferentes de um bolo simples, mas ainda compartilha a estrutura básica de um bolo.

## Funcionalidades

- **Definir Formato**: Através da interface `IFormato`, os bolos podem ser atribuídos a diferentes formatos.
  
- **Preparar Bolo**: A classe `Bolo` permite que o bolo seja preparado com a combinação de diferentes ingredientes.

- **Exibir Informações**: As classes implementam métodos para exibir detalhes do bolo, como nome, preço e formato.

## Como Usar

1. **Clonar o Repositório**:
   
   ```bash
   git clone https://github.com/rafa-alves6/FabricaBolos.git
   ```

2. **Instalar Dependências**:
   
   Certifique-se de que tem o Java instalado em sua máquina. Caso não tenha, instale-o.

3. **Compilar e Executar o Projeto**:

   Para compilar o projeto, execute:
   
   ```bash
   javac *.java
   ```
   
   Para executar o projeto, use:
   
   ```bash
   java FabricaBolos
   ```

## Exemplo de Uso

Aqui está um exemplo simples de como o sistema pode ser usado para criar um bolo simples e uma torta:

```java
public class Main {
    public static void main(String[] args) {
        BoloSimples bolo = new BoloSimples();
        bolo.preparar();
        bolo.exibirDetalhes();
        
        Torta torta = new Torta();
        torta.preparar();
        torta.exibirDetalhes();
    }
}
```

## Contribuições

Contribuições são bem-vindas! Se você deseja melhorar o projeto, siga as etapas abaixo:

1. Faça o fork deste repositório.
2. Crie uma nova branch (`git checkout -b minha-feature`).
3. Faça as alterações necessárias.
4. Commit suas mudanças (`git commit -am 'Adiciona minha feature'`).
5. Faça o push para a branch (`git push origin minha-feature`).
6. Abra um Pull Request.

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).
