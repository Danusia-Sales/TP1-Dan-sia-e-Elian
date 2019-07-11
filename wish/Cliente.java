package wish;

import java.util.ArrayList;
import java.util.Collections;

public class Cliente {

    String nome;
    int CPF;
    int CEP;
    int telefone;
    Cliente endereço;

    public Cliente(String n) {
        this.nome = n;
    }
}

public class Lista {

    public static void main(String[] args) {
        Collection<String> endereco = new ArrayList();
        endereco.add("Carapebus");
        endereco.add("Macaé");
        endereco.add("Rio das Ostras");
        endereco.add("Campos dos Goytacazes");
        endereco.add("Arraial do Cabo");
        endereco.add("Bruxelas");
        endereco.add("Camarões");
        endereco.add("Cabo Frio");

        System.out.println("Lista de endereço: " + endereco);

    }
}
