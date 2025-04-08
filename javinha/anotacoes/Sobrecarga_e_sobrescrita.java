
public class Sobrecarga_e_sobrescrita
{
// SOBRECARGA
// a sobrecaga acontece quando um metodo tem varias "versoes" com nomes iguais para entradas diferentes
// exemplo:
    public int area(int base, int altura)
    {
        return base*altura;
    }
    public double area(double base, double altura) //função area sendo sobrecarregada, variando a função a depender do tipo de entrada
    {
        return base*altura;
    }
    // sobrecarga tambem pode ser usada para fazer um cadastro generico, sem dados, ou, caso tenha dados, um cadastro completo
// SOBRESCRITA
// a sobrescrita ocorre quando um metodo é reescrito quando herdado por uma classe filho
// exemplo:
class Animal {
    public void emitirSom() {
        System.out.println("Som genérico de bixo");
    }
}

class Cachorro extends Animal {
    @Override //indica uma sobrescrita
    public void emitirSom() { // o metodo original é sobreescrito, recebendo agora essa nova função
        System.out.println("au au au");
    }
}

    public static void main (String args)
    {

    }

}
// sobrecarga de metodo e de operador
// usar o exemplo do aluno