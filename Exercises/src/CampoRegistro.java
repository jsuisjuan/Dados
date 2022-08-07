import java.util.Scanner;

public class CampoRegistro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] carros = {"Uno", "HB20", "Gol", "ka", "Onix", "BMW"};
        System.out.println("\tBem vindo ao CampoRegistro\n");

        for (int i = 0; i < 6; i++) {
            System.out.println("Carro " + (i + 1) + " = " + carros[i]);
        }
    }
}
