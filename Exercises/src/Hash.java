import java.util.HashMap;

public class Hash {
    public static void main(String[] args) {
        HashMap<Integer,String> nomeEmail = new HashMap<Integer,String>();

        // inserindo valores no hashmap
        nomeEmail.put(0, "ricardo@gamaacademy.com.br");
        nomeEmail.put(1, "willo@gamaacademy.com.br");

        for(int i = 0; i < nomeEmail.size(); i++) {
            System.out.println(nomeEmail.get(i));
        }
    }
}
