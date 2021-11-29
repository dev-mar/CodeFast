import java.util.Scanner;


public class MyVector
{
    public static Scanner leer= new Scanner(System.in);
    
    public static String[] llenarVector(String[] vector)
    {
        for(int pos=0; pos < vector.length; pos++)
        {
            System.out.print("Ingrese elemento: ");
            vector[pos]= leer.nextLine(); 
        }
        return vector;
    }
    
    public static void mostrarVector(String[] vector)
    {
        for(int pos=0; pos < vector.length; pos++)
        {
            System.out.print("\n" + vector[pos]);            
        }
    }
    
    public static boolean encontrarXenVector(String[] vector, String x)
    {
        boolean resp= false;
        for(int pos=0; pos < vector.length; pos++)
        {
            if(x.equals(vector[pos]))
            {
                resp=true;
            }
        }
        return resp;
    }
    
    
    public static int encontrarPosicionXenVector(String[] vector, String x)
    {
        int resp= -1;
        for(int pos=0; pos < vector.length; pos++)
        {
            if(x.equals(vector[pos]))
            {
                resp= pos;
            }
        }
        return resp;
    }
    
    /**
     * @return: El elemento de retorno es un String
     * correspondiente a un elemento del vector String[] vector,
     * retorna "null" en caso de no existir el elemento
     */
    public static String encontrarElementoXenVector(String[] vector,int p)
    {
        String resp= "null";
            
        if(p >=0 && p < vector.length)
        {
              resp= vector[p];
        }
        
        return resp;
    }
    
    
    
}






