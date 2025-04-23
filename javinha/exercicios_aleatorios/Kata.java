import java.util.List;
import java.util.ArrayList;
public class Kata
{
    public static void main(String[] args)
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
}
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
