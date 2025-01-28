import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int respostaConfirmacao;
        String numeroConta;
        String primeiroNome;

        do {

            System.out.println("Seja bem vindo ao Internet Banking! Por favor, digite o número da sua conta:");
            numeroConta = scanner.nextLine();
            System.out.println("\nPor favor, digite o seu primeiro nome: ");
            primeiroNome = scanner.nextLine();

            System.out.println("\nPor favor, confirme se os seus dados estão corretos: ");
            System.out.println("\nNúmero de sua conta bancária: " + numeroConta + " \nSeu primeiro nome: " + primeiroNome);
            System.out.println("\nVocê confirma os seus dados: ");
            System.out.println("Digite 1- Sim ou 2- Não");
            System.out.println();
            respostaConfirmacao = scanner.nextInt();
            scanner.nextLine();
        } while (respostaConfirmacao == 2);

        double saldo = 0.0;
        double deposito = 0.0;
        double transferencia = 0.0;
        int opcaoOperacoes;


        System.out.println("\n******************************************");
        System.out.println("Seja bem vindo, " + primeiroNome + " --- Número da conta bancária: " + numeroConta);
        System.out.println("******************************************\n");

        do {

            System.out.println("Operações:\n");

            System.out.println("1- Consultar saldo ");
            System.out.println("2 - Realizar depósito");
            System.out.println("3 - Realizar transferências");
            System.out.println("4 - Sair\n");

            opcaoOperacoes = scanner.nextInt();
            System.out.println();

            while (opcaoOperacoes < 1 || opcaoOperacoes > 4) {
                System.out.println("Por favor, digite uma opção válida!\n");
                System.out.println("Operações:\n");
                System.out.println("1- Consultar saldo ");
                System.out.println("2 - Realizar depósito");
                System.out.println("3 - Realizar transferências");
                System.out.println("4 - Sair\n");
                opcaoOperacoes = scanner.nextInt();
            }


            if (opcaoOperacoes == 1) {
                System.out.printf("O saldo atual da conta é: R$%.2f\n", saldo);
            } else if (opcaoOperacoes == 2) {
                System.out.printf("Digite quanto você deseja depositar: R$%.2f\n", deposito);
                deposito = scanner.nextDouble();
                saldo = saldo + deposito;
                System.out.printf("Valor atualizado da conta: R$%.2f\n ", saldo);

            }

            if (opcaoOperacoes == 3) {
                System.out.printf("O valor disponível para transferências é: R$%.2f\n", saldo);
                System.out.println("Digite quanto você deseja transferir: ");
                transferencia = scanner.nextDouble();
                if (transferencia <= saldo) {
                    saldo = saldo - transferencia;
                    System.out.printf("\nValor atualizado da conta: R$%.2f ", saldo);
                } else {
                    System.out.println("Saldo insuficiente para transferências!");
                }
            }

            if (opcaoOperacoes == 4){
                System.out.println("Realmente deseja encerrar a sessão? ");
                System.out.println("Digite 1 para confirmar:\n");
                int opcao = scanner.nextInt();

                if (opcao == 1) {
                    System.exit(0);
                } else {
                    System.out.println("Opção inválida!\n");
                }
            }


        } while (opcaoOperacoes >= 1 && opcaoOperacoes <= 4);











    }
}

