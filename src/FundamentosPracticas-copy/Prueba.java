

public class Prueba
{
    void main()
    {
        Pais x= new Pais();
        x.setNombre("Bolivia");
        x.setCapital("Sucre");
        x.setPoblacion(1200000);
        
        Pais y= new Pais("Mexico");
        
        Pais z= new Pais("Peru", "Lima");
        
        System.out.print("El primer pais registrado fue " + x.getNombre()  );
        
        
        Perro a= new Perro("chihuahua");
        a.setTamanho(0.10);
        a.setColor("cafe");
        
        ///////////////////////////////////////////
        
        EstudianteCipec est01= new EstudianteCipec("Elbert loza");
        est01.setCarrera("Sistemas Informaticos");
        
        EstudianteCipec est02= new EstudianteCipec();
        est02.setNombreCompleto("Milsen Rojas");
        est02.setMatricula("EC-2584");
        est02.setCarrera("Sistemas Informaticos");
        est02.setEdad(20);
        
        System.out.print("La estudiante del registro Nro. 2 es: "+ est02.getNombreCompleto());
        
        
        Computadora comp01= new Computadora();
        comp01.setRam("8 Gb. Kingston");
        comp01.setGeneracion(8);
        comp01.setPeso(3.5, "Kg");
        
        System.out.print("El peso de la computadora es : " + comp01.getPeso());
        
    }
}





