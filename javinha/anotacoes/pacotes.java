import nada_dms.*; // o .* significa que deve puxar TUDO de nada_dms
//sempre minusculo

//olhar o arquivo Carrinho.java da pasta(pacote) nada_dms
//faz parte do pacote nada_dms, portanto pode usar classes e metodos que estão acessiveis em nada_dms (ver OO para entender melhor niveis de acesso)
// puxa a classe Carrinho do package nada_dms, que contem essa classe por conta do arquivo Carrinho.java que tem a classe Carrinho dentro

//um pacote agrupa arquivos, juntando suas classes e metodos

public class pacotes
{
    
    public static void main(String[] args)
    {
        Carrinho fusca = new Carrinho("Mercedes", "branca", 90);
        fusca.acelerar(90);
    }
}

// para criar um package, sempre colocar em uma nova pasta