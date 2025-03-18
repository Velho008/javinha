public class casting // 4
{
    // casting em java é trocar tipos de variaveis:

    // de num com virgula para num inteiro e vice-versa:
    float dindin = 50.922f; // float 
    short dindinInt = (short)dindin; // nova variavel agr do tipo short
    short dinheiro = 50; // short
    float dineros = (float)dinheiro; // nova variavel do tipo float


    // de string pra numero e vice-versa:
    String Entrada = "50"; // string
    int numEntrada = Integer.parseInt(Entrada); //nova variavel do tipo int
    float floatentrada = Float.parseFloat(Entrada); //nova variavel do tipo float
    String voltaDaEntrada = String.valueOf(numEntrada); //nova variavel agr do tipo String
}