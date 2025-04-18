public class Kata
{

}
    class Apartamento
    {
        private int area;
        private int quartos;
        private int andar;
        private int vagasDeGaragem;
        private double valorDeCompra;
        private boolean temVaranda;
        
        public int getArea()
        {
            return area;
        }
        public void setArea(int area)
        {
            this.area = area;
        }
        public int getQuartos()
        {
            return quartos;
        }
        public void setQuartos(int quartos)
        {
            this.quartos=quartos;
        }
        public int getAndar() 
        {
            return andar;
        }
        public void setAndar(int andar) 
        {
            this.andar = andar;
        }
        public int getVagasDeGaragem() 
        {
            return vagasDeGaragem;
        }
        public void setVagasDeGaragem(int vagasDeGaragem) 
        {
            this.vagasDeGaragem = vagasDeGaragem;
        }
        public double getValorDeCompra() 
        {
            return valorDeCompra;
        }
        public void setValorDeCompra(double valorDeCompra) 
        {
            this.valorDeCompra = valorDeCompra;
        }
        public boolean isTemVaranda() //eu resolvi trocar get por is, por ser booleano, pesquisei e vi que o correto é assim.
        {
            return temVaranda;
        }
        public void setTemVaranda(boolean temVaranda) 
        {
            this.temVaranda = temVaranda;
        }
    }
    