
public class EstudianteCipec
{
    private String nombreCompleto;
    private String matricula;
    private String carrera;
    private int edad;
    
    public EstudianteCipec()
    {
        this.nombreCompleto= "";
        this.matricula= "";
        this.carrera= "";
        this.edad= 0;        
    }
    
    public EstudianteCipec(String nombreCompleto)
    {
        this.nombreCompleto= nombreCompleto;
        this.matricula= "";
        this.carrera= "";
        this.edad= 0;        
    }
    
    public EstudianteCipec(String nombreCompleto, String carrera)
    {
        this.nombreCompleto= nombreCompleto;
        this.matricula= "";
        this.carrera= carrera;
        this.edad= 0;        
    }
    
    public void setNombreCompleto(String nombreCompleto)
    {
        this.nombreCompleto= nombreCompleto;
    }
    public String getNombreCompleto()
    {
        return this.nombreCompleto;
    }
    
    public void setMatricula(String matricula)
    {
        this.matricula= matricula;
    }
    public String getMatricula()
    {
        return this.matricula;
    }
    
    public void setCarrera(String carrera)
    {
        this.carrera= carrera;
    }
    public String getCarrera()
    {
        return this.carrera;
    }
    
    public void setEdad(int edad)
    {
        this.edad= edad;
    }
    public int getEdad()
    {
        return this.edad;
    }
    
}
