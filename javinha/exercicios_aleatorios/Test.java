import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("joao");
        nomes.add("mauro");
        nomes.add("cid");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
    }
}