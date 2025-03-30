public class Tarefinha_extra_classe
{
    public static void main(String[] args)
    {
        //1 O que são tipos de dados primitivos em uma linguagem de programação?
        //Pesquise quais são os tipos de dados primitivos em Java e qual tipo de dado eles representam.
        //literalmente tá tudo anotado em variaveis.java

        //2 Apresente quais são os comandos de saída em Java (textual e gráfico).
        // System.out.println("coisa"); textual com quebra de linha
        // System.out.print("coisa"); textual sem quebra de linha
        // System.out.printf("%s %s", "coisa1", "coisa2"); textual, formatado
        // JOptionPane.showMessageDialog("coisa"); grafico, nativo e sem import

        //3 apresente quais são os comandos de entrada em Java (textual e gráfico).
        // cria um scanner e usa ele com scanner.nextInt() para int e é isso
        //pode usar tmb o proprio args de main
        // JOptionPane.showInputDialog() pode ser usado graficamente

        //4 O que é o type-casting? Quando acontece o up-casting? Quando acontece o down-casting? Quais as duas formas de realizar o down-casting em Java?
        // type-casting ta anotado em casting.java de anotações
        // O up-casting ocorre quando um objeto de uma subclasse é atribuído a uma variável de sua superclasse.
        class Animal
        {
            void fazerSom()
            {
                System.out.println("Animal faz um som");
            }
        }
        
        class Cachorro extends Animal
        {
            void latir()
            {
                System.out.println("Cachorro está latindo");
            }
        }
        
        
        Animal meuAnimal = new Cachorro(); // Up-Casting (implícito)
        meuAnimal.fazerSom(); // OK (método da superclasse)
        // meuAnimal.latir(); // Erro! O método latir() não está acessível sem Down-Casting.
        //como fazer o down-cast sem ter erros
        if (meuAnimal instanceof Cachorro)
        {
            Cachorro meuCachorro = (Cachorro) meuAnimal;
            meuCachorro.latir();
        } 
        else 
        {
            System.out.println("Conversão inválida!");
        }
        //5 Quais as instruções de controle e de repetição em Java? Apresente-as junto de suas sintaxes.
        //tá tudo em loops e em switch, tem if, else e else if tmb, mas esses eu n falei pq n precisa

        //6 O que é uma referência em Java?
        // diferente do tipo primitivo que armazena diretamente o valor, a referencia guarda em si o endereço do objeto
        // ao modificar o objeto, todas as referencias a ele mudam, por todos referenciarem o mesmo objeto]

        //7 Como se declara uma referência para um vetor em Java? Como se declara uma referência para uma matriz em Java?
        //tipo[] nome; //criou um vetor
        //tipo[][] nome; //criou uma matriz
        int[] vetor = {1,2,3};
        int[][] matriz = {{0,1,2},{3,4,5},{6,7,8}};
        System.out.println(vetor); //vai printar o endereço na memoria, não o vetor
        for (int num : vetor) // loop para printar o vetor
        {
            System.out.print(num + " ");
        }
        System.out.println(); //adicionar uma quebra de linha dps do ultimo valor 
        for (int i = 0; i<matriz.length;i++) //loop para cada vetor dentro da matriz
        {
            for (int j = 0; j< matriz[i].length; j++) //loop para cada valor dento dos vetores
            {
                System.out.print(matriz[i][j] + " "); //printa com espaço entre
            }
            System.out.println(); //mesma quebra de linha dps do ultimo valor
        }

        //8 Como se cria (instancia) um vetor e uma matriz em Java? Apresente exemplos de criação de vetor e matriz de inteiros.
        //ja foi respondido acima

        //9 O que são funções e procedimentos? Como uma função é definida em Java?
        //função retorna valor, portanto, tem return
        //procedimento não retorna um valor, portanto, um metodo void
        // definindo uma função em java:
        // modificador tipoDeRetorno nome (parametros) // modificador define a segurança, public, private, default ou protected, o tipo é oq retorna (pode ser void), parametros é oq recebe de fora
        //{
            //return valor; //no caso de ser uma função
        //}
        
        //10 Apresente o que será impresso pela execução do seguinte algoritmo em Java. (ta no pdf)
        //6, 18, 30, 42, 54, 66, 78, 90, 102, 114,
        //o codigo:
        int[] n;
        int a = 2, b = 4;
        n = new int[10]; //passa a ter 10 espaços

        for (int i = 0; i<10; i++)
        {
            while (a%3 !=0)
            {
                a+=b;
            }
            n[i] = a;
            a+=b;
        }
        for (int i = 0; i<10; i++)
        {
            System.out.print(n[i] + ", ");
        }
    }
}
        

