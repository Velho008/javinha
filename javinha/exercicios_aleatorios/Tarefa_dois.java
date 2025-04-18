public class Tarefa_dois {
// String nome = Gabriel Velho De Souza
// int matricula = 242015218

/*1: Defina o que é Orientação a Objetos (OO)
     Explique, com suas palavras, o que é a programação orientada a objetos e qual o seu principal objetivo. */
/*1R: a OO tem como objetivo evitar repetição de codigo, facilitar futuras alterações e simplificar o codigo (principalmente para grandes programas) */

/*2: Conceitos básicos
Explique os seguintes conceitos:
a) Classe
b) Objeto
c) Atributo
d) Método*/
/*2a)R: classe é um "tipo" de objeto, por exemplo, a classe pessoas, que vai ser responsavel por "criar" objetos chamados pessoa, com caracteristicas proprias, mas que derivam da classe */
/*2b)R: um objeto é uma instancia de uma classe */
/*2c)R: um atributo é como uma variavel de uma classe, que um objeto passa a ter, como por exemplo, o atributo cor de um possivel objeto carro de uma classe automovel */
/*2d)R: um metodo é como uma função para uma classe, que um objeto passa a ter, como por exemplo, o metodo pintar(String cor_nova) que recebe uma nova cor e troca a velha pela nova*/

/*3: Conceito de classe e um objeto
O que é uma classe e um objeto? Dê um exemplo simples em Java. */
/*3R: ambas as questoes foram respondidas acima, mas como outro exemplo, uma classe "cachorros" e um objeto "meu_cachorro", exemplo:
public class Cachorros
{
    int idade;
    String nome;
}* 
Cachorros meu_cachorro = new Cachorros() // objeto da classe Cachorros
*/

/*4: Associação entre classes
Explique o que é uma associação entre duas classes e cite um exemplo prático. */
/*4R: associação entre classes é quando existe um vinculo entre ambas as classes, como por exemplo, uma classe "Carrinho" que contem varios objetos da classe "Produtos"*/

/*5: Criação de classe simples
Implemente uma classe Apartamento em Java, que tenha os atributos area, quartos, andar, valorDeCompra, vagasDeGaragem e temVaranda, e um método exibirInfo() que imprime esses dados no terminal. */
/*5R:
class Apartamento
{
    int area;
    int quartos;
    int andar;
    int vagasDeGaragem;
    double valorDeCompra;
    boolean temVaranda;
    
    void exibirInfo()
    {
    System.out.println("area: "+area+" metros quadrados");
    System.out.println("numero de quartos: "+quartos);
    System.out.println("andar: "+andar);
    System.out.println("vagas de garagem: "+vagasDeGaragem);
    System.out.println("valor de compra: R$"+valorDeCompra);
    if (temVaranda)
    {
        System.out.println("tem varanda");
    }else
        {
        System.out.println("não tem varanda");
        }
    }
    Apartamento(int area, int quartos, int andar, int vagasDeGaragem, double valorDeCompra, boolean temVaranda)
    {
        this.andar = andar;
        this.area = area;
        this.quartos = quartos;
        this.vagasDeGaragem = vagasDeGaragem;
        this. valorDeCompra = valorDeCompra;
        this.temVaranda = temVaranda;
    }
}
 */
/*6: Herança
Explique o conceito de herança em OO e implemente duas classes em Java que a utilizem herança. */
/*6R:  
 *     class Animal
    {
        String nome_cientifico;
        String cor;
        int idade;

        void fazerSom()
        {
            System.out.println("SOM DE ANIMAL MTO ZIKA");
        }
        int calcularAreaDoRetangulo(int base, int altura)
        {
            System.out.println("pq vc colocou isso dentro de animal?");
            System.out.println(" ");
            System.out.println("pq eu pensei nesse exemplo, ai eu resolvi usar");
            return base*altura;
        }
        double calcularAreaDoRetangulo(double base, double altura)
        {
            System.out.println("olha só a sobrecarga acontecendo diante dos seus olhos!!!!!");
            return base*altura;
        }
    }
    class Cachorro extends Animal //isso significa que ele herda as coisas de animal!
    {
        void fazerSom()
        {
            System.out.println("SOM DE CACHORRO! PQ ACONTECEU UMA SOBRESCRITA");
        }
    }
*/

/*7:Polimorfismo - Sobrecarga
O que é polimorfismo em Orientação a Objetos? Dê um exemplo prático usando sobrecarga em Java. */
/*7R: acabei por responder na 6 */

/*8:Polimorfismo - Sobrescrita
O que é sobreescrita em Orientação a Objetos? Dê um exemplo prático em Java. */
/*8R: acabei tambem por responder na 6 */

/*9: Encapsulamento
O que é encapsulamento? Reescreva a classe Apartamento da questão 5 usando atributos privados e fornecendo métodos getters e setters. */
/*9R: o encapsulamento serve para esconder detalhes internos e proteger dados importantes, estabelecendo um controle, tornando o programa mais seguro ao deixar atributos privados
class Apartamento
{
    private int area;
    private int quartos;
    private int andar;
    private int vagasDeGaragem;
    private double valorDeCompra;
    private boolean temVaranda;
    
    public int getArea()
    {
        return area;
    }
    public void setArea(int area)
    {
        this.area = area;
    }
    public int getQuartos()
    {
        return quartos;
    }
    public void setQuartos(int quartos)
    {
        this.quartos=quartos;
    }
    public int getAndar() 
    {
        return andar;
    }
    public void setAndar(int andar) 
    {
        this.andar = andar;
    }
    public int getVagasDeGaragem() 
    {
        return vagasDeGaragem;
    }
    public void setVagasDeGaragem(int vagasDeGaragem) 
    {
        this.vagasDeGaragem = vagasDeGaragem;
    }
    public double getValorDeCompra() 
    {
        return valorDeCompra;
    }
    public void setValorDeCompra(double valorDeCompra) 
    {
        this.valorDeCompra = valorDeCompra;
    }
    public boolean isTemVaranda() //eu resolvi trocar get por is, por ser booleano, pesquisei e vi que o correto é assim.
    {
        return temVaranda;
    }
    public void setTemVaranda(boolean temVaranda) 
    {
        this.temVaranda = temVaranda;
    }
} */
}
