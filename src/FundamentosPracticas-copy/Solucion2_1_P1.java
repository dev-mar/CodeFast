

public class Solucion2_1_P1
{
    void main1()
    {
        String nombreC, pnom, snom, app, apm;
        
        System.out.print("\nIngrese nombre completo: ");
        nombreC= MyVector.leer.nextLine();
        
        String[] nomSeparado= nombreC.split(" ");
        
        if(MyString.cantidadPalabras(nombreC) == 4)
        {
            pnom= nomSeparado[0];
            snom= nomSeparado[1];
            app= nomSeparado[2];
            apm= nomSeparado[3];
            System.out.print("\nNombre: " + pnom + " " + snom);
            System.out.print("\nApellido paterno: " + app);
            System.out.print("\nApellido materno: " + apm);            
        }
        
        if(MyString.cantidadPalabras(nombreC) == 3)
        {
            pnom= nomSeparado[0];
            app= nomSeparado[1];
            apm= nomSeparado[2];            
            System.out.print("\nNombre: " + pnom );
            System.out.print("\nApellido paterno: " + app);
            System.out.print("\nApellido materno: " + apm);            
        }
        
        if(MyString.cantidadPalabras(nombreC) == 2)
        {
            pnom= nomSeparado[0];
            app= nomSeparado[1];
            System.out.print("\nNombre: " + pnom );
            System.out.print("\nApellido: " + app);         
        }
    }
    
    void main2()
    {
        int cp;
        String nombreC;
        
        System.out.print("\nIngrese nombre completo: ");
        nombreC= MyVector.leer.nextLine();
        cp= MyString.cantidadPalabras(nombreC);
        
        String[] nomSeparado= nombreC.split(" ");
        
        
        if(cp == 4)
        {
            System.out.print("\nNombre: " + nomSeparado[0] + " " + nomSeparado[1]);
            System.out.print("\nApellido paterno: " + nomSeparado[2]);
            System.out.print("\nApellido materno: " + nomSeparado[3]);            
        }
        else
        {
            System.out.print("\nNombre: " + nomSeparado[0] );
            if(cp == 3)
            {
                System.out.print("\nApellido paterno: " + nomSeparado[1]);
                System.out.print("\nApellido materno: " + nomSeparado[2]);            
            }
            else
            {            
                if(cp == 2)
                {
                    System.out.print("\nApellido: " + nomSeparado[1]);         
                }
                else
                {
                    System.out.print("\nERROR: Nombre no definido.");
                }
            }
        }
    }
}
