package javinha.coisas_aula.automoveis;

public class Automovel
{
    int ano;
    int potencia;
    int velocidade;
    String modelo;
    int capacidade;
    String fabricante;

    public void acelerar()
    {
        this.capacidade -=10;
        this.velocidade +=this.potencia;
        System.out.println("carro acelerando");
    }
    public void frear()
    {
        this.velocidade -=10;
        System.out.println("freando");
    }
    public void abastecer()
    {
        System.out.println("carro abastecido");
        this.capacidade +=10;
    }
}