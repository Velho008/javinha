import java.util.Scanner; // importa o scanner
public class recebendo_inputs //8
{
    public static void main(String[] args)
    {
        int idade;
        String nome; //inicializa sem valor
        Scanner input = new Scanner(System.in);
        // cria um objeto da classe scanner, que vai ler as entradas do usuario
        System.out.println("digite sua idade: ");//pede para que a idade seja informada
        idade = input.nextInt(); // idade vai receber o proximo inteiro digitado
        System.out.println("digite seu nome: ");//pede para que o nome seja informado
        input.nextLine(); //consome o \n que seria o input, por conta do enter na entrada acima
        nome = input.nextLine(); //recebe o nome digitado
        System.out.println("seu nome é: "+nome+" e sua idade é: "+idade); // por fim printa as infos recebidas
        input.close(); //fecha o scanner e impede que memoria seja vazada
    }
}