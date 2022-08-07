import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        int key[] = {82, 31, 28, 4, 45, 27, 59, 79, 35};

        for (int i = 0; i < 9; i++) {
            System.out.println(key[i] + "%11 = " + (key[i]%11));
        }

    }
}
