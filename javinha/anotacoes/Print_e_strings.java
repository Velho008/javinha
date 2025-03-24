public class Print_e_strings
{
    //informações sobre o println e o printf
    public static void main (String[] args) 
    {
        // sequencias de escape:
        System.out.println("nova linha\nviu");
        System.out.println("vou dar um\tespacinho");
        System.out.println("vou deixar o texto entre aspas: \"aspas\"");
        System.out.println("printar uma barra invertida \\");
        // printf, quase um fstring de python
        System.out.printf("%s %s","separei","hihi");
    }

}