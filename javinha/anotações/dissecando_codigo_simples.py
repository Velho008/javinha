#DISSECANDO
#import java.util.ArrayList; #permite cria listas
#
#public class Test { #public Significa que o método ou variável pode ser acessado de qualquer lugar #class cria a classe "Test"
#          #static Indica que o método ou variável pertence à classe e não a um objeto da classe #void Significa que o método não retorna nenhum valor 
#    public static void main(String[] args) {  #main é o ponto de entrada de um programa java #
#        ArrayList<String> nomes = new ArrayList<>();
#        nomes.add("joao");
#        nomes.add("mauro");
#        nomes.add("cid");
#
#        for (int i = 0; i < nomes.size(); i++) {
#            System.out.println(nomes.get(i));
#        }
#    }
#}
#o codigo sem anotações é