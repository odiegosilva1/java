public class Carta{
    private String naipe;
    private int valor;
    private char simbolo;
    
    //Metodo Construtor
    public Carta(String naipe, int valor, char simbolo){
        this.naipe = naipe;
        this.valor = valor;
        this.simbolo = simbolo;
    
    }
    
    public String getnaipe(){
        return naipe;
    
    }
    
    public void setnaipe(String naipe){
        this.naipe = naipe;
    }

}