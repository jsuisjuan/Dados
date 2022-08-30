import java.util.ArrayList;
/*
* Estudo da arraylist através do CRUD
*
* c = create => add
* r = read => get
* u = update => set
* d = delete => remove
* */

public class CrudArrayList {
    public static void main(String[] args) {
        System.out.println("\n\tBem vindo ao CrudArrayList\n");

        // declarando a variável com a arraylist
        ArrayList<String> nomeClientes = new ArrayList<String>();

        // inserção de valores nos registros da arraylist
        nomeClientes.add("Pretolina");
        nomeClientes.add("Givanildo");
        nomeClientes.add("Adroaldo");
        nomeClientes.add("Tarciano");

        // modo de visualização de todos os registros alocados na variável nomeCliente
        System.out.println(nomeClientes);

        // modo de visualização específica dos registros alocados na variável nomeCliente
        System.out.println(nomeClientes.get(1));

        ArrayList<String> marcas = new ArrayList<String>();
        marcas.add("Fiat");
        marcas.add("Chevrolet");
        marcas.add("Ford");
        marcas.add("BMW");

        // atualização de um index específico da arraylist
        marcas.set(0, "Volkswagem");
        System.out.println(marcas);

        // deletar um registro específico da arraylist
        marcas.remove(2);
        System.out.println(marcas);

        // retornando a quantidade de registros/tuplas de um arraylist
        System.out.println(marcas.size());
        for (int i = 0; i < marcas.size(); i++) {
            System.out.println(marcas.get(i));
        }
        // ou
        for (String i: marcas) {
            System.out.println(i);
        }
    }
}
