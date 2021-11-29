
public class Pais
{
    //Atributos
    private String nombre;
    private String capital;
    private int poblacion;
        
    //Constructores
    public Pais()
    {
        this.nombre= "";
        this.capital= "";
        this.poblacion= 0;
    }
    
    public Pais(String nombre)
    {
        this.nombre= nombre;
        this.capital= "";
        this.poblacion= 0;
    }
    
    public Pais(String nombre, String capital)
    {
        this.nombre= nombre;
        this.capital= capital;
        this.poblacion= 0;
    }
    //metodos
    /**
     *@setNombre
     *Permite modificar el contenido del nombre para el pais.
     *@String @nombre
     *El parametro debe ser un nombre de tipo cadena.
     */
    public void setNombre(String nombre)
    {
        this.nombre= nombre;
    }
    
    public void setCapital(String capital)
    {
        this.capital= capital;
    }
    
    public void setPoblacion(int poblacion)
    {
        this.poblacion= poblacion;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    
    public String getCapital()
    {
        return this.capital;
    }
    
    public int getPoblacion()
    {
        return this.poblacion;
    }
}
