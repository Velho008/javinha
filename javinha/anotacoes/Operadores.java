public class Operadores//9
{
    public static void main(String[] args)
    {   
        // dentre os operadores de java, existem varios, sendo eles:
        // OPERADORES ARITMETICOS: continha
        // + (literalmente soma)
        // - (literalmente subtração)
        // * (literalmente multiplicação)
        // % (resto da divisão)
        // / (divisão, if any number is int result = int else result = float) (pode fazer (float)3/5)
        System.out.println((float)3/5);
        // RELACIONAIS: comparar, sempre true or false
        // == (igual a)
        // != (diferente de)
        // > (maior que)
        // < (menor que)
        // >= (maior ou igual)
        // <= (menor ou igual)
        int a = 8, b = 2;
        System.out.println(a==b);
        // LOGICOS: combinações de true or false, retorna sempre true or false
        // && (e)
        // || (ou)
        // ! (não)
        System.out.println(! (5<3)); //inverte o valor de 5<3(false), tornando-o true
        System.out.println(3>5 || 8>0); //basta um ser verdadeiro
        int hmm = 0 , hm = 11;
        System.out.println(3<4 && hmm>hm); //os 2 tem que ser verdadeiros
        // ATRIBUIÇÃO: atribui valor a uma variavel (n é algo)
        // = (meio obvil)
        // +=n (var = var + n)
        // -=n (var = var - n)
        // *=n (var = var * n)
        // /=n (var = var / n)
        // %=n (var = var % n)
        System.out.println("");
        // BITWISE: faz umas budega bit a bit
        // &
        // ^ 
        // ~
        // <<
        // >>
        System.out.println("");
        // IF ELSE BONITO:
        int x = 10, y = 8;
        int resultado = ( x < y ) ? x : y; // se (coisa) então ? se não :
        System.out.println(resultado);
        // UNITARIO:
        resultado ++;//aumenta em uma unidade
        System.out.println((resultado)); 
        resultado --; //diminui em uma unidade
        System.out.println(resultado); 
        // INSTANCEOF: verifica se um objeto pertence a uma classe
        String s = "Hello";
        System.out.println(s instanceof String);
        System.out.println("");
        // == VS .EQUALS()
        String a1 = new String("Java");
        String b1 = new String("Java");
        System.out.println(a1 == b1); // false (compara endereços de memória.)
        System.out.println(a1.equals(b1)); // true (compara o conteúdo.)
    }
}
