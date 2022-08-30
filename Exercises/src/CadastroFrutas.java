import java.util.ArrayList;
import java.util.Scanner;

public class CadastroFrutas {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<String> frutas = new ArrayList<String>();

        int opcao, idFruta;
        String nomeFruta;

        System.out.println("\n\tBem vindo ao ControleFrutas\n");

        do {
            System.out.println("1 - Cadastrar Frutas");
            System.out.println("2 - Listar Frutas");
            System.out.println("3 - Excluir");
            System.out.println("4 - Listar Frutas com ID");
            System.out.println("5 - Modificar uma Fruta");
            System.out.println("6 - Fechar programa");
            System.out.print("Escolha uma opcao: ");

            opcao = input.nextInt();

            switch(opcao) {
                case 1:
                    System.out.print("Entre com uma fruta: ");
                    nomeFruta = input.next();
                    if (nomeFruta != null) {
                        frutas.add(nomeFruta);
                        System.out.println("\nFruta adicionada com sucesso!\n");
                    }
                    break;
                case 2:
                    System.out.println("\nLista de Frutas\n");
                    System.out.println(frutas);
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.print("Escolha um id da fruta: ");
                    idFruta = input.nextInt();
                    frutas.remove(idFruta);
                    System.out.println("\nFruta excluida com sucesso!\n");
                    break;
                case 4:
                    System.out.print("Escolha o id da fruta: ");
                    idFruta = input.nextInt();
                    System.out.println("\nFruta escolhida = " + (frutas.get(idFruta)) + "\n");
                    break;
                case 5:
                    System.out.println("Escolha o id e nome da fruta: ");
                    System.out.print("id: ");
                    idFruta = input.nextInt();
                    System.out.print("fruta: ");
                    nomeFruta = input.next();
                    frutas.set(idFruta, nomeFruta);
                    System.out.println("\nFruta atualizada com sucesso!\n");
                    break;
            }
        } while(opcao != 6);
        System.out.println("Programa encerrado com sucesso!");
        input.close();
    }
}
