import java.util.Scanner;
public class Test
{
    public static void main(String[] args)
    {
        float area,altura,largura,perimetro;
        Scanner scanner = new Scanner(System.in);
        try
        {
            System.out.println("digite a largura");
            largura = scanner.nextFloat();

            System.out.println("digite a altura");
            altura = scanner.nextFloat();

            area = altura * largura;
            perimetro = altura*2 + largura*2;
            System.out.println("Area do retangulo: " + area);
            System.out.println("perimetro do retangulo: " + perimetro);
        } catch(IOException erro) 
        {
            System.out.println("Houve um erro na entrada de dados" + erro.toString());
        } catch (NumberFormatException erro) 
        {
            System.out.println("Houve erro na conversão, digite apenas caracteres numericos" + erro.toString());
        }
    }

}
