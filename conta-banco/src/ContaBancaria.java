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
