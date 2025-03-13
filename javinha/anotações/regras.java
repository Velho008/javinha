public class regras //1
{
    //o comando import deve ser feito no topo do arquivo, nunca dentro da classe
    //para rodar, o codigo java necessita de um "main", explicado melhor em dissecando_codigo_simples
    //algumas regras basicas:
    //em todo arquivo java, uma classe deve ser declarada

    //public class "nome do arquivo"{
    //}
    //quase todo arquivo inicia dessa forma 

    //o tipo de uma variavel não pode ser alterado, ele inicia e se mantem em um tipo

    //declarar variaveis!:
    //"tipo" "nome_da_variavel" = "valor";
    //após ser declarada, pode ser livremente usada, sem precisar identificar novamente o tipo
    //pode tmb fazer
    //'var' 'nome_da_variavel' = 'valor'; #aqui o java vai identificar e tipar sozinho dependendo do valor

    //toda linha deve terminar com ; menos as que abrem ramificações

    //basico de estrutura:
    //em python
    //if coisa:
    //    fazer
    //elif coisa2:
    //    fazer2
    //else:
    //    fazer3

    //em java:
    //if (coisa) {
    //    fazer;
    //} else if (coisa2) {
    //    fazer2;
    //} else {
    //    fazer3;
    //}
    public static void main(String[] args)
    {
        int numero = 40;
        System.out.println(numero);
    }
}