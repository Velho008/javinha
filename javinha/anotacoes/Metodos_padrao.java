public class Metodos_padrao {
    public static void main(String[] args) {}
        //metodos são como funções especificas de classes, que os objetos recebem
        //dentre os tipos padrão de função (já existentes no java) existem:
        // personalizada (criada pelo usuario)
        // construtora
        // destrutora
        // acessora (get e set)
        //
        //CONSTRUTORA:
        // tem o mesmo nome da classe e não tem tipo de retorno (nem void)
        // pode fazer sobrecarga de construtores
        // é invocada quando o objeto é "construido" e geralmente define valores necessarios para a criação do objeto

        //DESTRUTORA:
        // perguntar pro prof

        //ACESSORAS (GET E SET):
        // ajuda a proteger dados internos, por meio do encapsulamento
        // em um banco de dados, um cpf geralmente será um dado privado, portanto não visivel para o resto do programa
        // para receber o valor do cpf, usa-se um metodo GET e para setar, um metodo set 

        //EXEMPLO:
        public class Produto
        {
            private String nome;
            private double preco;
        
            public Produto(String nome, double preco) //METODO CONSTRUTOR
            {
                this.nome = nome;
                this.preco = preco;
            }
        
            public String getNome() //GET
            {
                return nome;
            }
        
            public void setNome(String nome) //SET
            {
                this.nome = nome;
            }
        
            public double getPreco()
            {
                return preco;
            }
        
            public void setPreco(double preco)
            {
                if (preco >= 0)
                {
                    this.preco = preco;
                }
            }
        }
    
}
