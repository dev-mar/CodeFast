
public class Computadora
{
    private String procesador;
    private String ram;
    private String almacenamiento;
    private int generacion;
    private String tarjetaMadre;
    private String tarjetaGrafica;
    private String garantia;
    
    private double peso;
    private String unidadPeso;
    
    public Computadora()
    {
        this.procesador= "";
        this.ram="";
        this.almacenamiento= "";
        this.generacion= 0;
        this.tarjetaMadre= "";
        this.tarjetaGrafica= "";
        this.garantia= "";
    }
    
    public Computadora(String procesador, String ram, String almacenamiento)
    {
        this.procesador= procesador;
        this.ram= ram;
        this.almacenamiento= almacenamiento;
        this.generacion= 0;
        this.tarjetaMadre= "";
        this.tarjetaGrafica= "";
        this.garantia= "";
    }
    
    public void setProcesador(String procesador)
    {
        this.procesador= procesador;
    }
    public String getProcesador()
    {
        return this.procesador;
    }
    
    public void setRam(String ram)
    {
        this.ram= ram;
    }
    public String getRam()
    {
        return this.ram;
    }
    
    public void setAlmacenamiento(String almacenamiento)
    {
        this.almacenamiento= almacenamiento;
    }
    public String getAlmacenamiento()
    {
        return this.almacenamiento;
    }
    
    public void setTarjetaMadre(String tarjetaMadre)
    {
        this.tarjetaMadre= tarjetaMadre;
    }
    public String getTarjetaMadre()
    {
        return this.tarjetaMadre;
    }
    
    public void setTarjetaGrafica(String tarjetaGrafica)
    {
        this.tarjetaGrafica= tarjetaGrafica;
    }
    public String getTarjetaGrafica()
    {
        return this.tarjetaGrafica;
    }
    
    public void setGarantia(String garantia)
    {
        this.garantia= garantia;
    }
    public String getGarantia()
    {
        return this.garantia;
    }
    
    public void setGeneracion(int generacion)
    {
        this.generacion= generacion;
    }
    public int getGeneracion()
    {
        return this.generacion;
    }
    
    /**
     * @double @peso:
     * Se debe ingresar en unidad numerica el peso de la computadora.
     * @String @unidad:
     * Se debe registrar la unidad del peso @Ej: @Kg.
     */
    public void setPeso(double peso, String unidad)
    {
        this.peso= peso;
        this.unidadPeso= unidad;
    }
    public String getPeso()
    {
        return this.peso + " " + this.unidadPeso;
    }
    
}
