public class OO //5 
{
    // todo arquivo java contem uma classe com o nome do arquivo
    //CLASSE --> quase um tipo, como por exemplo, carros(classe), todo carro tem os mesmo tipos de atributos e comportamentos, mas que mudam de um carro (objeto) para o outro
    //OBJETO --> uma coisa de uma determinada classe, um carro da classe carros por exemplo
    //ATRIBUTO --> uma variavel intrinsecamente ligada à uma classe, o quão cheio o tanque de um carro está, por exemplo
    //METODO --> uma função ligada à uma classe, acelerar um carro ou encher seu tanque
    public static void main(String[] args)
    {
        Carro mycar = new Carro("BMW","preto",97); //variavel(objeto) do tipo(classe) Carro é criado
        mycar.acelerar(50);

    }
}
class Carro //a classe tambem representa um tipo
{
    String modelo,cor; //atributos cor e modelo
    int tanque; //atributo tanque

    public Carro(String modelo, String cor, int tanque) //TEM O MESMO NOME DA CLASSE, É UM METODO CONSTRUTOR (sempre que um novo objeto carro for criado, vai invocar esse metodo)
    {
        this.modelo = modelo; //o atributo modelo do objeto criado vai receber o modelo informado ao ser criado
        this.cor = cor; //o atributo cor recebe a cor informada
        this.tanque = tanque;
        System.out.println("um novo carro do modelo: " + this.modelo + " foi criado, sua cor é: " + this.cor + " e seu tanque está em: " + this.tanque + "%"); 
    }
    //criando metodos: 

    //PRIMEIRO vem seu tipo de acesso, que pode ser: public, protected, sem modificador ou private
    //(acessivel de qualquer lugar),(acessivel dentro da mesma classe, mesmo pacote ou subclasse),(acessivel dentro da mesma classe ou pacote),(acessivel apenas dentro da mesma classe)
    //SEGUNDO vem o que ele retorna, que pode ser: um tipo primitivo, um objeto, um array, uma coleção(List,Map,Set), null ou void
    //(ver variaveis.java),(objeto definido pelo usuario),(var[]),(),(quando ele retorna um objeto),(quando não retorna nada)
    public void acelerar(int sec)//por não ter return, é void
    {
        System.out.println("o carro do modelo: '"+this.modelo+"' acelerou durante "+sec+" segundos");
    }

}