import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SuperCalculadora calcular = new SuperCalculadora();

        float num1, num2;
        int opcao;

        System.out.println("\n\tBem vindo a Super Calculadora!\n");
        System.out.println("Entre com dois numeros");
        System.out.print("Primeiro numero: ");
        num1 = input.nextFloat();

        System.out.print("Segundo numero: ");
        num2 = input.nextFloat();

        do {
            System.out.print("\n");
            System.out.println("1 - Adicao");
            System.out.println("2 - Subtracao");
            System.out.println("3 - Multiplicacao");
            System.out.println("4 - Divisao");
            System.out.println("5 - Fechar o programa");
            System.out.print("Escolha uma opcao: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    calcular.adicao(num1, num2);
                    break;
                case 2:
                    calcular.subtracao(num1, num2);
                    break;
                case 3:
                    calcular.multiplicacao(num1, num2);
                    break;
                case 4:
                    if (num2 <= 0) {
                        System.out.println("O divisor e um numero menor ou igual a 0! Porfavor, reinicie o programa e insira um valor valido.");
                        break;
                    } else {
                        calcular.divisao(num1, num2);
                    }
                    break;
                case 5: break;
                default:
                    System.out.println("\nNenhuma das opcoes foram escolhidas! Porfavor, escolha uma opcao.\n");
            }
        } while (opcao != 5);
        System.out.println("Programa encerrado com sucesso!");
        input.close();
    }
}
