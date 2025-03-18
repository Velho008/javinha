public class Test
{
    public static int century(int number)
    {
        int coiso =0;
        if (number%100 >0)
        {
            coiso =1;
        }
        return (number/100)+coiso;
    }
    public static void main(String[] args)
    {
        System.out.println(century(1705));
    }
}
