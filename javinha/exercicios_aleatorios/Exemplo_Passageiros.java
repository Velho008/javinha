import java.util.ArrayList;
//OTIMO EXEMPLO PARA LISTAS E LOOPS
class Exemplo_Passageiros {

  public static int countPassengers(ArrayList<int[]> stops) {
    int res =0;
    for (int i = 0 ; i<stops.size() ; i++)
    {
        res += (stops.get(i))[0];
        res -= ((stops.get(i)[1]));
    }
    return res;
  }
}
