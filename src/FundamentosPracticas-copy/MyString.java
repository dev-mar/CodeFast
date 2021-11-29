
public class MyString//Clase tipo ayuda
{
    public static char[] vocales= {'a','e','i','o','u'};
    public static char[] numeros= {'0','1','2','3','4','5','6','7','8','9'};
    
    public static String letrasm= "abcdefghijklmnopqrstuvwxyz";// letras.charAt(10)
    public static String letrasM= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    
    ////////////////////////////Metodo Add////////////////////////
    public static String quitarCaracteresIguales(String texto)
    {
        String tn="";
        char k;
        while( texto.length() > 0 )
        {
            k= texto.charAt(0);
            tn= tn + k;
            texto= quitarCaracter(texto, k);
        }      
        
        return tn;
    }
    
    public static String quitarCaracter(String texto, char caracter)
    {
        String nt="";
        char k;
        
        for(int i=0; i< texto.length(); i++)
        {
            k= texto.charAt(i);
            if(k != caracter)
            {
                nt= nt + k;
            }
        }
        
        return nt;
    }
    ////////////////////////////////////////////////////////////
    
    public static boolean esEspacio(char c)
    {
        boolean resp= true;
        if(c != ' ')
        {
            resp= false;
        }
        return resp;
    }
    
    public static boolean esEspacio(String c)
    {
        boolean resp= true;
        if(c != " ")
        {
            resp= false;
        }
        return resp;
    }
    
    public static boolean esVocal(char c)
    {
        boolean resp= false;
        
        for(int p=0; p<5; p++)
        {
            if(c == vocales[p])
            {
                resp= true;
            }        
        }
        return resp;
    }
    
    public static boolean esVocal(String c)
    {
        boolean resp= false;
        
        if(c == "a" || c == "e" || c == "i" || c == "o" || c == "u")
        {
            resp= true;
        }        
        
        return resp;
    }
    
    public static boolean esNumero(char c)
    {
        boolean resp= false;
        
        for(int p=0; p<10; p++)
        {
            if(c == numeros[p])
            {
                resp= true;
            }        
        }
        return resp;
    }
    
    public static boolean esNumero(String c)//8
    {
        char valor= c.charAt(0);
        
        return esNumero(valor);
    }
    
    public static boolean esLetraMinuscula(char c)
    {
        boolean resp= false;
        
        for(int i=0; i< letrasm.length(); i++)
        {
            if(c == letrasm.charAt(i))
            {
                resp=true;
            }
        }
        
        return resp;
    }
    
     public static boolean esLetraMinuscula(String c)
    {
        char valor= c.charAt(0) ;
        
        return esLetra(valor);
    }
    
    public static boolean esLetraMayuscula(char c)
    {
        boolean resp= false;
        
        for(int i=0; i< letrasM.length(); i++)
        {
            if(c == letrasM.charAt(i))
            {
                resp=true;
            }
        }
        
        return resp;
    }
    
     public static boolean esLetraMayuscula(String c)
    {
        char valor= c.charAt(0) ;
        
        return esLetraMayuscula(valor);
    }
    
    public static boolean esLetra(char c)
    {
        boolean resp= false;
        
        if(esLetraMinuscula(c) || esLetraMayuscula(c))
        {
            resp=true;
        }
        return resp;
    }
    
    public static boolean esLetra(String c)
    {
        boolean resp= false;
        
        if(esLetraMinuscula(c) || esLetraMayuscula(c))
        {
            resp=true;
        }
        return resp;
    }
    
    public static boolean caracterEnPalabra(char x, String palabra)
    {
        boolean resp=false;
        
        for(int i=0; i < palabra.length(); i++)
        {
            if(x == palabra.charAt(i))
            {
                resp= true;
            }
        }        
        
        return resp;
    }
    
    
    public static int contarCaracterEnPalabra(char x, String palabra)
    {
        int cont=0;
        
        for(int i=0; i < palabra.length(); i++)
        {
            if(x == palabra.charAt(i))
            {
                cont++;
            }
        }        
        
        return cont;
    }
    
    public static boolean igualesSintacticamente(String txt1, String txt2)
    {
        boolean resp= false;
        
        if(txt1.equals(txt2))
        {
            resp=true;
        }
        
        return resp;
    }
    
    public static boolean igualesSemanticamente(String txt1, String txt2)
    {
        boolean resp= false;
        
        if(txt1.equalsIgnoreCase(txt2))
        {
            resp=true;
        }
        
        return resp;
    }
    
    /**
     * @Metodo: devuelve un valor numerico que indica cuantas palabras tiene el texto ingresado. (oracion).
     */
    public static int cantidadPalabras(String oracion)
    {
        int cp=0;
        char k;
        
        for(int i=0; i< oracion.length() ; i++)
        {
            k= oracion.charAt(i);
            
            if( esEspacio(k) )
            {
                cp++;
            }
        }        
        
        return (cp + 1);
    }
    
    public static boolean tieneNumero(String palabra)
    {
        boolean resp=false;
        char k;
        
        for(int i=0; i< palabra.length() ; i++)
        {
            k= palabra.charAt(i);
            
            if( esNumero(k) )
            {
                resp=true;
            }
        }        
        
        return resp;
    }
    
    public static int cantidadVocales(String palabra)
    {
        int cv=0;
        char k;
        
        for(int i=0; i< palabra.length() ; i++)
        {
            k= palabra.charAt(i);
            
            if( esVocal(k) )
            {
                cv++;
            }
        }        
        
        return cv;
    }
    
    public static int cantidadVocalesSinRep(String palabra)
    {
        String np;
        int cv;
        
        np= quitarCaracteresIguales(palabra);
        cv= cantidadVocales(np);
        
        return cv;
    }
    
    public static String invertirTexto(String texto)
    {
        String ti="";
        char k;
        
        for(int i= texto.length()-1; i>=0; i--)
        {
            k= texto.charAt(i);
            ti= ti + k;
        }
        
        return ti;
    }
    
    public static boolean esPalindromo(String texto)
    {
        boolean resp=false;
        String ti= invertirTexto(texto);
        
        if(igualesSemanticamente(texto, ti))
        {
            resp=true;
        }
        
        return resp;
    }
    
    public static String remplazarCaracterXporY(String palabra, char x ,char y)
    {
        String np="";
        char k;
        
        for(int i=0; i < palabra.length(); i++)
        {
            k= palabra.charAt(i);
            if( k == x )
            {
                np= np + y;
            }
            else
            {
                np = np + k;
            }
        }
        
        return np;
    }
    
    public static String remplazarCaracterXporY(String palabra, char x ,String y)
    {
        String np="";
        char k;
        
        for(int i=0; i < palabra.length(); i++)
        {
            k= palabra.charAt(i);
            if( k == x )
            {
                np= np + y;
            }
            else
            {
                np = np + k;
            }
        }
        
        return np;
    }
    
    
    public static char[] separarPorCaracteres(String texto)
    {
        char[] vt= new char[texto.length()];
        
        for(int p=0; p< texto.length() ; p++)
        {
            vt[p]= texto.charAt(p);
        }
        
        return vt;
    }
    
    public static String[] separarPorCaracteresEnString(String texto)
    {
        String[] vt= new String[texto.length()];
        
        for(int p=0; p< texto.length() ; p++)
        {
            vt[p]= "" + texto.charAt(p);
        }
        
        return vt;
    }
    
    public static String convertirVectorAString(String[] vector)
    {
        String resp="";
        
        for(int p=0; p< vector.length; p++)
        {
            resp= resp + vector[p];
        }
        
        return resp;
    }
}







