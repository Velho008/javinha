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
        //tá tudo em loops e em switch, tem if else e else if tmb, mas esses eu n falei pq n precisa
    }
}
        

