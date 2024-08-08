Projeto de Gerenciamento de Contas Bancárias
Este projeto é uma aplicação Java simples para criar uma conta bancária e exibir uma mensagem de confirmação. A aplicação solicita que o usuário insira os dados da conta e, em seguida, exibe uma mensagem com essas informações.

Estrutura do Projeto
O projeto contém os seguintes arquivos:

ContaBancaria.java: Arquivo principal que define a classe ContaBancaria e inclui a lógica para criar uma conta e exibir uma mensagem.
Como Executar o Projeto
1. Preparar o Ambiente
Certifique-se de ter o JDK instalado no seu sistema.

2. Compilar o Código
Abra um terminal ou prompt de comando e navegue até o diretório onde o arquivo ContaBancaria.java está localizado.

Compile o código com o seguinte comando:

bash
Copiar código
javac ContaBancaria.java
3. Executar o Código
Após a compilação, execute o código com o seguinte comando:

bash
Copiar código
java ContaBancaria
4. Inserir Dados
Quando solicitado, insira as seguintes informações:

Número da Agência: O número da agência bancária.
Número da Conta: O número da conta bancária.
Tipo de Conta: O tipo de conta (por exemplo, Corrente, Poupança).
Nome do Cliente: O nome do cliente.
Saldo Inicial: O saldo inicial da conta.
5. Visualizar a Mensagem
Após inserir os dados, o programa exibirá uma mensagem de confirmação com as informações fornecidas.

Estrutura do Código
Aqui está o código da classe ContaBancaria:

java
Copiar código
import java.util.Scanner;

public class ContaBancaria {
    private String numero;
    private String tipo;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public ContaBancaria(String numero, String tipo, String agencia, String nomeCliente, double saldo) {
        this.numero = numero;
        this.tipo = tipo;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public void exibirMensagem() {
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo de R$" + saldo + " já está disponível para saque.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da conta: ");
        String numero = scanner.nextLine();

        System.out.print("Por favor, digite o tipo de conta: ");
        String tipo = scanner.nextLine();

        System.out.print("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo inicial: ");
        double saldo = scanner.nextDouble();

        ContaBancaria conta = new ContaBancaria(numero, tipo, agencia, nomeCliente, saldo);
        conta.exibirMensagem();

        scanner.close();
    }
}
Tecnologias Utilizadas
Java: Linguagem de programação utilizada para o desenvolvimento da aplicação.
Contribuições
Se você quiser contribuir com este projeto, fique à vontade para enviar pull requests ou abrir issues com sugestões e melhorias.

Licença
Este projeto está licenciado sob a MIT License.

Esse README.md fornece uma visão geral clara de como executar e utilizar a aplicação Java. Se precisar adicionar mais detalhes ou ajustes específicos, sinta-se à vontade para personalizar!








