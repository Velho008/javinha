import java.util.Scanner;
public class Switch //mais otimizado que varios if else
{
    public static void main (String[] args)
    {
        Scanner inputs = new Scanner(System.in);

        System.out.println("digite um numero: ");
        int a = inputs.nextInt();
        System.out.println("digite outro numero: ");
        int b = inputs.nextInt();

        int expressao = b*a*10;

        switch (expressao) //expressão deve ser int, char, String ou enum
        {
            case 0:
                System.out.println("vc digitou algum 0 não foi!");
                break;
            case 30:  // expressão == 30
                System.out.println("igual a trinta!");
                break; //impede que seja comparado nos outros casos
            case 50: // expressão == 50
                System.out.println("igual a 50!!!");
                break; //impede que seja comparado nos outros casos
            case 100: //expressão == 100
                System.out.println("igual a cem!!!");
                break; //impede que seja comparado nos outros casos
            default: // executado caso nenhum dos casos seja verdadeiro
                System.out.println("não deu nem 30 nem 50 nem 100");
        }
        inputs.close();
    }

}
