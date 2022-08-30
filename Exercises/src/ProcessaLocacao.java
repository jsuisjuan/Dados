import java.util.Scanner;

public class ProcessaLocacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] carros = {"Uno", "HB20", "Gol", "ka", "Onix", "BMW", "Sandero", "Fusion", "Prisma", "Palio"};
        int opcao, numeroCarro;

        System.out.println("\n\tBem vindo ao Processa Locacao!\n");

        do {
            System.out.println("1 - Mostra todos os carros");
            System.out.println("2 - Mostrar um carro desejado");
            System.out.println("3 - Fechar o programa");
            System.out.print("Entre com uma opcao: ");

            opcao = input.nextInt();

            switch(opcao) {
                case 1:
                    System.out.print("\n");
                    for (int i = 0; i < carros.length; i++) {
                        System.out.println("Carro " + (i + 1) + " = " + carros[i]);
                    }
                    System.out.print("\n");
                    break;
                case 2:
                    System.out.print("Entre com o numero do carro: ");
                    numeroCarro = input.nextInt();

                    for(int i = 1; i <= carros.length; i++) {
                        if (numeroCarro == i) {
                            System.out.println("\nVoce escolheu o carro "+numeroCarro+", portanto e o carro = "+carros[i-1]+"\n");
                            break;
                        }
                    }
                case 3: break;
                default:
                    System.out.println("\nNenhuma das opcoes foram escolhidas! Porfavor, escolha uma opcao.\n");
            }
        } while (opcao != 3);
        System.out.println("\nO programa foi fechado com sucesso!");

        input.close();
    }
}
