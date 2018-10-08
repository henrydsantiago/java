package clase3;


public class Clase3 {

    
    public static void main(String[] args) {
        producto p1=new producto();
        producto p2=new producto();
        producto p3=new producto();
        
        p1.leerDatos();
        p2.leerDatos();

        p1.getNombre();
        
        System.out.println("El producto "+p1.getNombre()+" tiene un descuento de Bs.F,"+ p1.calcularDescuento());
        System.out.println("El producto "+p2.getNombre()+" tiene un descuento de Bs.F,"+ p2.calcularDescuento());

        if (p1.calcularDescuento()>p2.calcularDescuento()) // Primera manera de hacer la comparación
            System.out.println(p1.getNombre()+" tiene mayor descuento");
        else
            System.out.println(p1.getNombre()+" Tiene el mismo descuento "+p2.getNombre());
        
        System.out.println("El mayor "+(p1.calcularDescuento()>p2.calcularDescuento()? //Segunda manera de hacer la comparación
                                  p1.getNombre():p2.getNombre()));
        
        
                
        
    }
    
}
