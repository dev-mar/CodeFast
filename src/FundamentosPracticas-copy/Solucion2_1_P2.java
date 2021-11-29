
public class Solucion2_1_P2
{
    String correo, nombre, direccion;
    boolean respA, respB, respC, respD, respE;
    //int respA;
    String[] correoSeparado;    
        
    void main1()
    {
        System.out.print("\nIngrese correo electrónico: ");
        correo= MyVector.leer.next();
        correoSeparado= correo.split("@");
        nombre= correoSeparado[0];
        
        respA= verificarA(correo);
        
        if(respA == true)
        {
            direccion= correoSeparado[1];
            respB= verificarB(direccion);
        }
        else
        {
            respB= false;
        }
            
        respC= verificarC(nombre);
        respD= verificarD(nombre);
        respE= verificarE(nombre);        
        
        if( respA == true && respC == true && respD == true && respE == true && respB == true)        
        {
            System.out.print("\nEl correo es verdadero y fue registrado");
        }
        else
        {
            System.out.print("\nERROR: El correo debe ser un correo real.");
        }
    }
    
    /*int verificarA(String dato)
    {
       int resp;
       resp= MyString.contarCaracterEnPalabra('@', dato);
       return resp;
    }*/
    
    boolean verificarA(String dato)
    {
        boolean resp;
        int ca= MyString.contarCaracterEnPalabra('@', dato);
        
        if( ca == 1)
        {
            resp= true;
        }
        else
        {
            resp= false;
        }
        return resp;
    }
    
    boolean verificarB(String dato)
    {
        boolean resp;
        int cp, ct1, ct2= 0;
        String texto1, texto2;
        String[] datoSeparado;
        cp= MyString.contarCaracterEnPalabra('.', dato);
        
        if(cp==1)
        {
            datoSeparado= dato.split("\\.");
            texto1= datoSeparado[0];
            ct1= texto1.length();
            
            if(datoSeparado.length > 1)
            {
                texto2= datoSeparado[1];            
                ct2= texto2.length();
            }
            
            if( ct1 > 0 && ct2 > 0)
            {            
                resp= true;
            }
            else
            {
                resp= false;
            }
        }
        else
        {
            resp= false;
        }
        
        return resp;
    }    
    
    boolean verificarC(String dato)
    {
        int ccv=0, cci= 0;
        boolean resp;
        char k;
        
        for(int p=0; p< dato.length(); p++)
        {
            k= dato.charAt(p);
            if(MyString.esLetra(k) || MyString.esNumero(k) || k=='.' || k=='_')
            {
                ccv++;
            }
            else
            {
                cci++;
            }
            
        }
        
        if(cci > 0)
        {
            resp= false;
        }
        else
        {
            resp= true;
        }
        
        return resp;
    }
    
    boolean verificarD(String dato)
    {
        int cc;
        boolean resp;
        cc= dato.length();
        
        if(cc > 1)
        {
            resp= true;
        }
        else
        {
            resp= false;
        }
        
        return resp;
    }
    
    boolean verificarE(String dato)
    {
        boolean resp;
        char k;
        k= dato.charAt(0);
        if( MyString.esNumero(k) || k == '.')
        {
            resp= false;
        }
        else
        {
            resp= true;
        }
        
        return resp;
    }
}
