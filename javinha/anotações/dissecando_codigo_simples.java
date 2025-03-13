import java.util.ArrayList; //permite cria listas

public class dissecando_codigo_simples { //public Significa que o método ou variável pode ser acessado de qualquer lugar #class cria a classe "Test"
          //static Indica que o método ou variável pertence à classe e não a um objeto da classe #void Significa que o método não retorna nenhum valor.
    public static void main(String[] args) {  //main é o ponto de entrada de um programa java #String[] é obrigatorio pra todo main java, args tambem, mas pode mudar de nome
        ArrayList<String> nomes = new ArrayList<>(); //cria uma nova arraylist de strings chamada nomes
        nomes.add("joao"); //adiciona joao a nomes
        nomes.add("mauro"); //adiciona mauro
        nomes.add("cid"); //adicina cid

        for (int i = 0; i < nomes.size(); i++) { //i começa em 0 e enquanto for menor que o tamanho de nomes (quantos nomes tem), i aumenta em 1 e o codigo é repetido
            System.out.println(nomes.get(i)); //printa a posição de i em nomes, nomes.get(0) == "joao"
        } //fecha o for
    } //fecha o main
} //fecha o Test

//o codigo sem anotações é;

/* import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("joao");
        nomes.add("mauro");
        nomes.add("cid");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
    } */
//}