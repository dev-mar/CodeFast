

public class Seguridad
{
    public static String[] vocalC= {"a","e","i","o","u"};
    public static String[] vocalS= {"04","03","01","00","02"};
    
    public static String[] simbolC= {"@"," ","-",".",",",";","!"};
    public static String[] simbolS= {"ñar","ñsp","ñgi","ñpt","ñco","ñpc","ñad"};
    
    public static String[] numeroC= {"1","2","3","4","5","6","7","8","9","0"};
    public static String[] numeroS= {"+u","*d","+t","*q","+n","*s","+i","*o","+v","*c"};
    
    public static String[] vt;
    
    
    public static String codificar(String texto)
    {
        String tcodi="";
        vt= MyString.separarPorCaracteresEnString(texto);
        
        vt= remplazar(vt, numeroC, numeroS);//remplaza los numeros
        vt= remplazar(vt, vocalC, vocalS);//remplaza vocales
        vt= remplazar(vt, simbolC, simbolS);//remplasa simbolos
        
        tcodi= MyString.convertirVectorAString(vt);
        return tcodi;
    }
    
    public static String[] remplazar(String[] vOriginal, String[] vComparar, String[] vRemplazar )
    {
        String elemento;
        for(int p=0; p < vOriginal.length; p++)
        {
            elemento= vOriginal[p];
            for(int i=0; i<vComparar.length; i++ )
            {
                if(elemento.equals(vComparar[i]))
                {
                    vOriginal[p]= vRemplazar[i];
                }
            }            
        }
        return vOriginal;
    }
    
    
    
    
    /*public static String codificar(String texto)
    {
        String resp= texto;       
        
        for(int p=0; p< 5; p++)
        {
            resp= MyString.remplazarCaracterXporY(resp, vocalC[p], vocalS[p]);
        }
        
        return resp;
    }*/
    
    
    
    ///La primera forma de codificar que hicimos
    /*public static String codificar(String texto)
    {
        String resp="";
        char[] txtSep= MyString.separarPorCaracteres(texto);
        char k;
        
        for(int p=0; p< texto.length(); p++)
        {
            k= txtSep[p];
            if( MyString.esVocal(k))
            {
                for(int pv=0; pv<5; pv++)
                {
                    if( k == vocalC[pv])
                    {
                        resp= resp + vocalS[pv];
                    } 
                }
            }
            else
            {
                resp= resp + k;
            }
        }
        
        return resp;
    }*/
}
