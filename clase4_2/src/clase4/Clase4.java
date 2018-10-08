package clase4;

public class Clase4 {
   
    public static void main(String[] args) {
      int notas[];
      Año a = new Año(2017);

      for (int i=0;i<a.getMeses().length;i++)
          if (a.getMeses()[i] == null)
               {
                   System.out.println("No disponible");
                }
           else
                {
                   System.out.println(a.getMeses()[i].getNombre()+" "+a.getMeses()[i].getDias());
                }
              
           
      
         
      
    }
    
}
