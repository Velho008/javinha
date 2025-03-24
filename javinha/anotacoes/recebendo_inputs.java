import java.util.Scanner; // importa o scanner
public class recebendo_inputs
{
    public static void main(String[] args)
    {
        int idade;
        String nome;
        Scanner input = new Scanner(System.in);
        // cria um objeto da classe scanner, que vai ler as entradas do usuario
        System.out.println("digite sua idade: ");
        idade = input.nextInt(); // idade vai receber o proximo inteiro digitado
        System.out.println("digite seu nome: ");
        nome = input.nextLine();
        System.out.println("seu nome é: "+nome+" e sua idade é: "+idade);
    }
}