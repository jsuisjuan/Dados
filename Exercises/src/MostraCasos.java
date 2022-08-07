import java.util.Scanner;

public class MostraCasos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;

        String[] carros = {"Sandero", "Fusion", "Prisma"};
        System.out.println("\tEscolha uma das opcoes");
        System.out.println("1 - Mostrar carro da Marca Honda");
        System.out.println("2 - Mostrar todos os carros");
        System.out.print("Entre com a opcao: ");
        opcao = input.nextInt();

        switch(opcao) {
            case 1:
                System.out.println("Nao temos carros para alocar");
                break;
            case 2:
                for (int i = 0; i < 3; i++) {
                    System.out.println(carros[i]);
                }
                break;
            default:
                System.out.println("Nenhuma das opcoes foram escolhidas");
        }
    }
}
