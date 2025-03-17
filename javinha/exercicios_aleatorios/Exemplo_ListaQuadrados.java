import java.util.Arrays;
//BOM EXEMPLO PRA VER LISTAS COM INT
public class Exemplo_ListaQuadrados
{
  public static void main(String[] args)
  {
    squareDigits(3212);
  }
    public static void squareDigits(int n)
    {
        int tamanho = String.valueOf(n).length();
        int[] digitos = new int[tamanho];

        for (int i=tamanho-1 ; i>=0 ; i--)
        {
            digitos[i] = (n%10)*(n%10);
            n/=10;
            System.out.println(Arrays.toString(digitos));
        }
    }
}
