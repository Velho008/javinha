/* public class Kata
{
    public static int[] countPositivesSumNegatives(int[] input)
    {
        if (input == null || input.length == 0)
        {
            return new int[] {};
        }
        int positives = 0;
        int negatives = 0;
        for (int i=0; i < input.length ;i++)
        {
            if (input[i] > 0)
            {
                positives++;
            }else
            {
                negatives += input[i];
            }
        }
        return new int[] {positives,negatives};
    }
    public static void main(String[] args)
    {
    }

} */
public class Kata
{
    public static int[] countPositivesSumNegatives(int[] input)
    {
        if (input == null || input.length ==0) return new int[] {};
        int positivos = 0,negativos =0;
        for (int i : input) //aqui ele é como um for i in L loop em python
        {
            if (i>0) positivos ++;
            if (i<0) negativos -=i;
        }
        return new int[] {positivos,negativos};
    }
/*     public static int[] main(String[] args)
    {
        if (args == null || args.length ==0) return new int[] {};
        int positivos = 0, negativos = 0;
        int[] L = Integer.parseInt(args);
        for (int i: L)
        {
            if (i>0)positivos++;
            if (i<0)negativos-=i;

        }

    } */

}

