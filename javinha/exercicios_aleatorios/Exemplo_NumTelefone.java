public class Exemplo_NumTelefone
{ //OTIMO EXEMPLO PARA STRINGS E TYPECASTING
    public static String createPhoneNumber(int[] numbers) 
    {
        String res ="(";
        int fim = numbers.length;
      for(int i=0 ; i < fim ; i++)
      { 
        String caracter = String.valueOf(numbers[i]);
        res +=caracter;
        if (i==2)
        {
            res+=") ";
        }
        if (i==5)
        {
            res +='-';
        }
      }
      return res;
    }
    public static void main(String[] args)
    {
        System.out.println(createPhoneNumber(new int[] {1,2,3,4,5,6,7,8,9,0}));
    }
}