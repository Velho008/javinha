#FORLOOPS
#for(var_do_loop; regra; mudança na var_do_loop){}
#ou
#for(<tipo> var_do_loop: lista){}
#exemplo:

#import java.util.ArrayList;
#ArrayList<String> nomes = new ArrayList<>();
#nomes.add("fernando");
#nomes.add("gabriel");
#for(int i = 0; i<nomes.size(); i++){ #vai loopar pra cada coisa em nomes
# System.out.println(nomes.get(i));
#}

#outro exemplo:

#for (<String> s : nomes){
# System.out.println(nome);
#}

#WHILELOOPS
#vou fazer logo um exemplo pq é bem simples
#int contador =0;
#while (contador < 10){
# System.out.println("while loop");
# contador++; #equivalente ao contador +=1
#}
