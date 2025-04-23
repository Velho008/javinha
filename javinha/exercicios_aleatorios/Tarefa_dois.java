public class Tarefa_dois {
// String nome = Gabriel Velho De Souza
// int matricula = 242015218
// para alguns codigos funcionarem, tem que colocar import java.util.List, java.util.Arrays, java.util.ArrayList;

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
/*10:Relacionamento de agregação
Explique o que é agregação e crie duas classes em Java que representem esse relacionamento. */
/*10R: agregação é relativamente parecida com a composição, na composição uma classe depende da outra para existir, como por exemplo, pulmão e humano
 * já na agregação, uma classe não depende da outra, mas podem coexistir, como por exemplo: uma classe produto e outra prateleira (o produto pode estar no carrinho ou em uma caixa)
 *     public static void main(String[] args)
    {
        Produto banana = new Produto();
        banana.setNome("Banana");
        banana.setDiasRestantesValidade(14);
        Produto cocacola = new Produto();
        cocacola.setDiasRestantesValidade(90);
        cocacola.setNome("CocaCola");

        Prateleira padaria = new Prateleira();
        padaria.setSetor("8G");
        padaria.setProdutos(Arrays.asList(banana, cocacola));

        System.out.println(banana.getDiasRestantesValidade());
        System.out.println(banana.getNome());
        cocacola.diaPassou();
        System.out.println(cocacola.getDiasRestantesValidade());
        System.out.println(cocacola.getNome());
        System.out.println(padaria.getSetor());
        padaria.listarProdutos();
    }
}
class Produto
{
    private String nome;
    private int diasRestantesValidade;

    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public String getNome()
    {
        return this.nome;
    }
    public void setDiasRestantesValidade(int dias)
    {
        this.diasRestantesValidade = dias;
    }
    public int getDiasRestantesValidade()
    {
        return this.diasRestantesValidade;
    }

    public void diaPassou()
    {
        this.diasRestantesValidade--;
    }
}
class Prateleira
{
    private String setor;
    private List<Produto> produtos;

    public void listarProdutos()
    {
        System.out.println("produtos do setor "+setor+":");
        {
            for (Produto produto : produtos) 
            {
                System.out.println(produto.getNome());
            }
        }
    }
    public void setSetor(String setor)
    {
        this.setor = setor;
    }
    public String getSetor()
    {
        return this.setor;
    }
    public void setProdutos(List<Produto> produtos)
    {
        this.produtos = produtos;
    }
 */
/*11: Projeto orientado a objetos
Desenhe um pequeno diagrama de classes para representar um sistema de gerenciamento de biblioteca, contendo pelo menos três classes (Livro, Usuario, Emprestimo) e depois implemente essas classes em Java. */
/*11R: diagrama de classes: ("desenhei" no txt mesmo)
 *     //LIVRO:
        // nome da classe: Livro
        // atributos da classe: nome, autor, quantidade
        // metodos da classe: diminuirQuantidade, setter e getter

        //USUARIO:
        // nome da classe: Usuario
        // atributos da classe: nome, livros
        // metodos da classe: setter e getter

        //EMPRESTIMO:
        // nome da classe: Emprestimo
        // atributos da classe: livro, usuario, dataEmprestimo, dataDevolucao
        // metodos da classe: emprestimo(construtor), devolucao
    classes em java:
class Livro
{
    private String nome;
    private String autor;
    private int quantidade;

    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public String getNome()
    {
        return this.nome;
    }
    public void setAutor(String autor)
    {
        this.autor = autor;
    }
    public String getAutor()
    {
        return this.autor;
    }
    public void setQuantidade(int quantidade)
    {
        this.quantidade = quantidade;
    }
    public int getQuantidade()
    {
        return this.quantidade;
    }

    public void diminuirQuantidade()
    {
        this.quantidade--;        
    }
    public void aumentarQuantidade()
    {
        this.quantidade++;
    }
}
class Usuario
{
    private String nome;
    private List<Livro> livros;

    public Usuario()
    {
        this.livros = new ArrayList<>();
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public String getNome()
    {
        return this.nome;
    }
    public void addLivro(Livro livro)
    {
        this.livros.add(livro);
    }
    public void removerLivro(Livro livro)
    {
        this.livros.remove(livro);
    }
    public void listLivros()
    {
        System.out.println("este usuario pegou os livros: ");
        for (Livro livro : livros)
        {
            System.out.println(livro.getNome());
        }
    }
}
class Emprestimo
{
    private Livro livro;
    private Usuario usuario;
    private int dataEmprestimo;

    public Emprestimo(Livro livro, Usuario usuario, int dataEmprestimo)
    {
        this.livro = livro;
        this.usuario = usuario;
        this.dataEmprestimo = dataEmprestimo;

        this.livro.diminuirQuantidade();
        this.usuario.addLivro(this.livro);

        int anoEmprestimo = this.dataEmprestimo%10000;
        int mesEmprestimo = (this.dataEmprestimo/10000)%100;
        int diaEmprestimo = (this.dataEmprestimo/10000)/100;

        System.out.println("emprestimo realizado no dia "+diaEmprestimo+" do mes "+mesEmprestimo+" do ano "+anoEmprestimo);
        System.out.println("Livro: "+this.livro.getNome());
        System.out.println("Emprestado para: "+this.usuario.getNome());
    }
    public void devolucao(int dataDevolucao)
    {
        this.livro.aumentarQuantidade();
        this.usuario.removerLivro(this.livro);

        int anoDevolucao = dataDevolucao%10000;
        int mesDevolucao = (dataDevolucao/10000)%100;
        int diaDevolucao = (dataDevolucao/10000)/100;
        
        System.out.println("livro: "+this.livro.getNome()+" emprestado para: "+this.usuario.getNome());
        System.out.println("devolvido no dia " +diaDevolucao+" do mes "+mesDevolucao+" do ano "+anoDevolucao);
    }
}
    */
    /*12: Projeto orientado a objetos 2
Implemente uma Main em Java que instancie pelo menos um objeto de cada uma das classes (Livro, Usuario, Emprestimo) e em seguida realiza um emprestimo e uma devolução.*/
/*12R: 
 *     public static void main(String[] args)
    {
        Livro livroA = new Livro();
        livroA.setNome("1984");
        livroA.setQuantidade(3);
        livroA.setAutor("George Orwell");

        Livro livroB = new Livro();
        livroB.setNome("Metamorfose");
        livroB.setAutor("Kafka");
        livroB.setQuantidade(4);

        Usuario bananilson = new Usuario();
        bananilson.setNome("Bananilson");
        
        Emprestimo emprestimo1 = new Emprestimo(livroA, bananilson, 18042025);
        bananilson.listLivros();
        System.out.println(livroA.getQuantidade());

        emprestimo1.devolucao(20042025);
        bananilson.listLivros();
        System.out.println(livroA.getQuantidade());
    }
 */
}
