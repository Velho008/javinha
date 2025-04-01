public class casting // 4
{
    // casting em java é trocar tipos de variaveis:

    // de num com virgula para num inteiro e vice-versa:
    float dindin = 50.922f; // float 
    short dindinInt = (short)dindin; // nova variavel agr do tipo short
    short dinheiro = 50; // short
    float dineros = (float)dinheiro; // nova variavel do tipo float


    // de string pra numero e vice-versa:
    String Entrada = "50"; // string
    int numEntrada = Integer.parseInt(Entrada); //nova variavel do tipo int
    float floatentrada = Float.parseFloat(Entrada); //nova variavel do tipo float
    String voltaDaEntrada = String.valueOf(numEntrada); //nova variavel agr do tipo String
    //para Strings é diferente pq String é classe

    //up casting e down casting de objetos e classes:
    // usa-se upcasting para evitar repetição, imagine um programa com 100 animais, eu teria que criar um metodo para cada animal fazer barulho.
    //ao fazer o up casting, posso usar isso:

/*     Animal[] animais = new Animal[2];
       animais[0] = new Cachorro();  // Upcasting
       animais[1] = new Gato();      // Upcasting

       for (Animal a : animais)
       {
           a.fazerSom();  // Funciona para todos os animais!
       } */

    public static void main(String[] args) 
    {
        // O objeto criado ainda é um Cachorro, mas estamos olhando para ele como um Animal
        Animal meuAnimal = new Cachorro();
        meuAnimal.fazerSom(); //Método de Animal
       // meuAnimal.latir();    //Método não existe em Animal 
       Animal meuAnimal2 = new Cachorro();// Upcasting – Podemos tratar Cachorro como Animal, mas só acessar métodos de Animal.
       Cachorro meuAnimal3 = new Cachorro();// Criamos um Cachorro e podemos acessar todos os métodos da classe Cachorro e Animal.
       //Cachorro meuAnimal = new Animal();  //	Erro de compilação! Animal não pode ser tratado como Cachorro.
    }
}
class Animal
{
        void fazerSom()
        {
            System.out.println("O animal faz um som");
        }
    }
    
    class Cachorro extends Animal
    {
        void latir()
        {
            System.out.println("O cachorro está latindo");
        }
    }