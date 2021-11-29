
public class Perro
{
    //atributos
    private String raza;
    private String color;
    private double tamanho;
    
    //constructores.
    public Perro()
    {
        this.raza= "";
        this.color= "";
        this.tamanho= 0;
    }
    
     public Perro(String raza)
    {
        this.raza= raza;
        this.color= "";
        this.tamanho= 0;
    }
    
    //metodos
    public void setRaza(String raza)
    {
        this.raza= raza;
    }
    public String getRaza()
    {
        return this.raza;
    }
    
    public void setColor(String color)
    {
        this.color= color;
    }
    public String getColor()
    {
        return this.color;
    }
    
    public void setTamanho(double tamanho)
    {
        this.tamanho= tamanho;
    }
    public double getTamanho()
    {
        return this.tamanho;
    }
    
    
}
