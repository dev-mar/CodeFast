
public class MyNumber
{
   public static int elementoMayor(int[] vector)
   {
       int resp= vector[0];
       
       for(int p= 1; p < vector.length; p++ )
       {
           if(vector[p] < resp)
           {
               resp= vector[p];
            }
        }
       
       return resp;
   }   
    
   public static int cantidadDigitos(int numero)
   {
       int cd=0;
       
       while(numero > 0)
       {
           numero= numero / 10 ;
           cd++;
       }       
       return cd;       
    }    
    
    public static int elMenor(int a, int b)
   {
       int resp;
       
       if( a < b)
       {
           resp= a;
       }
       else
       {
           resp= b;
       }
       
       return resp;
   }   
   
}
