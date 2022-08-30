import java.util.Scanner;

public class PassagemMetodoParametro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome, email;
        int idade;

        System.out.print("Digite o seu nome: ");
        nome = input.nextLine();

        System.out.print("Digite o seu email: ");
        email = input.nextLine();

        System.out.print("Entre com a sua idade: ");
        idade = input.nextInt();

        MandaMensagem executar = new MandaMensagem();
        executar.mensagem(nome, email, idade);

    }
}
