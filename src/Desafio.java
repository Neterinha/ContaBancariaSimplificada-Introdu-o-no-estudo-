import java.util.Scanner;

/*"Desafio Conta bancaria" simplificada aplicando conceitos
de variáveis, condicionais, loops e leitura de dados no Java,
juntamente à lógica de programação.*/


public class Desafio {
    public static void main(String[] args) {
        String nome = "Pandora";
        String tipoConta = "Corrente";
        double saldo = 2000;
        Scanner leitor = new Scanner(System.in);
        int opcao = 0;

        System.out.println("*********************************\n" +
                           "        Dados do cliente\n\n" +
                           "Nome do cliente: " + nome +
                           "\nTipo de conta: " + tipoConta +
                           "\nSaldo da Conta: " + saldo +
                           "\n\n*********************************");

        String menu = ("""
                -----------------------
                                
                1- Consultar Saldo
                2- Fazer Transferencia
                3- Receber Transferencia
                4- Sair
                                
                Escolha uma opção
                """);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitor.nextInt();

            if (opcao > 4 || opcao <= 0) {
                System.out.println("\nOpção inválida!!!");
                System.out.println("\n\nDigite uma opção valida!");
            }

            if (opcao == 1) {
                System.out.println("\nSeu saldo atual é: " + saldo);

            } else if (opcao == 2) {
                System.out.println("\nQual valor deseja transferir ?");
                double valor = leitor.nextDouble();
                if (valor > saldo) {
                    System.out.println("\nNão é possível fazer essa transferencia!" +
                                       "\n\nSeu saldo é de: " + saldo);
                } else {
                    saldo -= valor;
                    System.out.println("\nNovo saldo: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("\nQual valor deseja receber ?");
                double valor = leitor.nextDouble();
                saldo += valor;
                System.out.println("\nNovo saldo: " + saldo);
            }
        }
    }
}

