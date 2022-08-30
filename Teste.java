import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
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
            System.out.println("Escolha uma opcao: ");
            opcao = input.nextInt();

            switch(opcao) {
                case 1:
                    System.out.print("Entre com uma fruta: ");
                    nomeFruta = input.nextLine();
                    frutas.add(nomeFruta);
                    System.out.println("Fruta adicionada com sucesso!");
                    break;
                case 2:
                    System.out.println("Lista de Frutas\n");
                    System.out.println(frutas);
                    break;
                case 3:
                    System.out.println("Escolha um id da fruta: ");
                    idFruta = input.nextInt();
                    frutas.remove(idFruta);
                    System.out.println("Fruta excluida com sucesso!");
                    break;
                case 4:
                    System.out.println("Escolha o id da fruta: ");
                    idFruta = input.nextInt();
                    System.out.println("Fruta escolhida = " + (frutas.get(idFruta)));
                    break;
                case 5:
                    System.out.println("Escolha o id e nome da fruta: ");
                    idFruta = input.nextInt();
                    nomeFruta = input.nextLine();
                    frutas.set(idFruta, nomeFruta);
                    System.out.println("Fruta atualizada com sucesso!");
                    break;
            }
        } while(opcao != 6);
        System.out.println("Programa encerrado com sucesso!");
        input.close();
    }
}
