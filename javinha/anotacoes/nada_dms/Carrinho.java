package nada_dms; //adiciona o arquivo para o pacote "nada_dms" (mesmo nome da pasta)

public class Carrinho {
    
        String modelo,cor; 
        int tanque; 

        public Carrinho(String modelo, String cor, int tanque) 
        {
            this.modelo = modelo; 
            this.cor = cor; 
            this.tanque = tanque;
            System.out.println("um novo carro do modelo: " + this.modelo + " foi criado, sua cor é: " + this.cor + " e seu tanque está em: " + this.tanque + "%"); 
        }
        public void acelerar(int sec)
        {
            System.out.println("o carro do modelo: '"+this.modelo+"' acelerou durante "+sec+" segundos");
        }
    }