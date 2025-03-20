import java.util.ArrayList;
import java.util.Arrays;

public class variaveis //2
{
    public static void main(String[] args)
    {
        //NUMEROS INTEIROS:
        //byte --> ocupa apenas 8bits na memoria --> vai de -128 a 127
        //short --> ocupa 16bits na memoria --> vai de -32.768 a 32.767
        //int --> ocupa 32 bits na memoria --> vai de -2.147.483.648 a 2.147.483.647
        //long --> ocupa 64bits na memoria --> vai de -9.223.372.036.854.775.808L a 9.223.372.036.854.775.807L #o L no fim é pra representar que é long
        //NUMEROS DECIMAIS:
        //float --> 32bits --> precisão simples, umas 6 ou 7 casas decimais, assim como o long, o float deve terminar com f
        //double --> 64bits --> precisão dupla, umas 15 ou 16 casas decimais
        //TEXTO:
        //char --> 16bits -->representa um unico caractere, deve ser sempre aspas simples
        //String --> representa texto, deve ser sempre aspas duplas, IMUTAVEL
        //BOOLEANO
        //boolean --> 1bit --> true or false

        //COMO FAZER UM VETOR?
        // vetor é quase uma tupla de mesmo tipo, pode ser de qualquer tipo
        // String[], int[], boolean[], float[] ...
        int[] colecao_de_inteiros = {1,2,3,4,5}; //é mutavel, mas o tamanho é fixo, se tem 5 elementos no inicio é isso e nunca vai mudar
        System.out.println(colecao_de_inteiros[0]); //vai printar 1

        //pode inicializar o vetor em branco, fazendo:
        //'tipo'[] "nome" = new int['tamanho']; aqui cria, contem varios 0 de acordo com o tamanho, é um vetor vazio
        //'nome'['posição'] = 'coisa';  aqui indexa o local 'posição' e dá a ele o valor de 'coisa'
        int[] inteiros = new int [3];
        inteiros[2] = 8;
        System.out.println(Arrays.toString(inteiros)); //precisa fazer isso pra printar a Array, vetor, tupla, lembrar de importar o java.util.Arrays

        //uma lista!!! //que na real é uma classe
        //import java.util.ArrayList; tem que importar pq é uma classe 
        //ArrayList<'tipo'> 'nome' = new ArrayList<>();
        //'nome'.add('coisa'); usa metodos, por ser um objeto da classe ArrayList

        //exemplo de usar lista:
        //import java.util.ArrayList; o import tá lá em cima bobão, import é sempre lá em cima 
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(5);
        numeros.add(8);
        numeros.add(11);
        numeros.remove(0); //remove por index
        numeros.remove(Integer.valueOf(11)); //remove por 'nome'// resultado
        System.out.println(numeros.get(0)); // é o equivalente em python de: print(numeros[0]), mas como numeros em java é um objeto, deve usar o metodo.get('index')
        //vai printar 5

        //ADICIONAR SET
    }
}