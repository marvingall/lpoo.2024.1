import java.util.Scanner;

public class OperacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu saldo inicial: ");
        double saldo = scanner.nextDouble();

        System.out.println("Qual operação você quer fazer: 1-Debito 2-Credito");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Digite o valor a ser debitado: ");
                double valorDebito = scanner.nextDouble();
                debitar(saldo, valorDebito);
                break;
            case 2:
                System.out.print("Digite o valor a ser creditado: ");
                double valorCredito = scanner.nextDouble();
                creditar(saldo, valorCredito);
                break;
            default:
                System.out.println("Opção inválida.");
        }

        scanner.close();
    }

    public static void creditar(double saldo, double valorCredito) {
        saldo += valorCredito;
        System.out.println("Operação de crédito realizada. Novo saldo: " + saldo);
    }

    public static void debitar(double saldo, double valorDebito) {
        if (valorDebito <= saldo) {
            saldo -= valorDebito;
            System.out.println("Operação de débito realizada. Novo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar o débito.");
        }
    }
}
