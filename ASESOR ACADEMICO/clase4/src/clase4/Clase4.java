package clase4;

public class Clase4 {

    public static void main(String[] args) {
        int notas[];
        Año a=new Año(2017);
       
        System.out.println("Los meses son:");
        Mes x[]=a.getMeses();
        for (int i=0;i<x.length;i++)
            if (x[i]!=null)
                System.out.println(
                        x[i].getNombre()+" tiene "+
                        x[i].getDias()+" dias ");
    }
    
}
