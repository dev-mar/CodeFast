//Codificador de textos
import java.util.Scanner;
public class Sytem01
{
    Scanner leer= new Scanner(System.in);
    
    void main()
    {
        String texto, txtCod;
        
        System.out.print("Ingrese un texto para codificar.: ");
        texto= leer.nextLine();
        
        txtCod= Seguridad.codificar(texto);
        
        System.out.println("Tu texto se ve asi:\n" + txtCod);
        
    }
}
