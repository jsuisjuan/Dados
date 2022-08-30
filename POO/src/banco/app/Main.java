package banco.app;
import banco.core.ContaBancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;
        double valor;

        ContaBancaria conta = new ContaBancaria(1001,2,"Isidro","174.774.077-29", 100.00);

        do {
            System.out.println("IsiBank - Seu banco na Internet!");
            System.out.println("Digite 1-Deposito / 2-Saque / 3-Info / 0-Sair");
            opcao = input.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println(">>> DEPOSITO - Digite o valor:");
                    valor = input.nextDouble();
                    conta.depositar(valor);
                    break;
                case 2:
                    System.out.println(">>> SAQUE - Digite o valor:");
                    valor = input.nextDouble();
                    if (conta.sacar(valor)) {
                        System.out.println("\tSAQUE EFETUADO!");
                    } else {
                        System.out.println("\tSALDO INSUFICIENTE");
                    }
                    break;
                case 3:
                    System.out.println(">>> INFO: " + conta.exibirDados());
                    break;
                case 0:
                    System.out.println(">>> OBRIGAADO PELA PREFERENCIA - Volte Sempre!");
                    break;
                default:
                    System.out.println("*** Opcao Invalida! ***");
            }
        } while (opcao != 0);

    }
}
