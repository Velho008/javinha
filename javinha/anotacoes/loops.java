import java.util.ArrayList; //import deve sempre estar no topo, antes de entrar em classe
public class loops // 3
{
    //FORLOOPS:
    //for(var_do_loop; regra; mudança na var_do_loop){}
    //ou
    //for(<tipo> var_do_loop: lista){}
    //exemplo:
    public static void main(String[] args) //main é necessario para rodar o codigo
    { 
        ArrayList<String> nomes = new ArrayList<>(); //cria uma lista vazia
        nomes.add("fernando"); //adiciona fernando
        nomes.add("gabriel"); //adiciona gabriel
        for(int i = 0; i<nomes.size(); i++) //vai loopar pra cada coisa em nomes
        { 
        System.out.println(nomes.get(i));
        }
    
    //outro exemplo:

        for (String nome : nomes)
        { // for each type == String in nomes
        System.out.println(nome); //print(nome)
        }

    /* WHILELOOPS:
     vou fazer logo um exemplo pq é bem simples */
        int contador =0;
        while (contador < 10)
        {
        System.out.println("while loop");
        contador++; //equivalente ao contador +=1
        }

        // DO WHILE:
        int count = 0;
        do { //garante que vai executar pelo menos uma vez, bom pra fazer menus
            System.out.println("sla mano " + count);
        } while (count !=0); //primeiro executa e dps checa com o while
    }
}