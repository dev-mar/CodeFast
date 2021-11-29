

public class PruebaMyVector
{
   String[] nombres= new String[5];
   String[] direcciones= new String[2];
   String elem;
   int p;
   
   void main()
   {
       System.out.print("\nRegistro de nombres:\n");
       nombres= MyVector.llenarVector(nombres);
       
       System.out.print("\nIngrese elemento a buscar:\n");
       elem= MyVector.leer.nextLine();
       System.out.print("\nEl elemento esta en la posicion: ");
       System.out.print(MyVector.encontrarPosicionXenVector(nombres, elem));
       
       System.out.print("\nIngrese posicion del elemto a buscar:\n");
       p= MyVector.leer.nextInt();
       System.out.print("\nEl elemento de esa posicion es: ");
       
    }
}
