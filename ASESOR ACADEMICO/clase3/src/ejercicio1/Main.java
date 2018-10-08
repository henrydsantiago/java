package ejercicio1;

public class Main {

    public static void main(String[] args) {
        Producto p1=new Producto(),
                 p2=new Producto();
        
        p2.leerDatos();
        p1.leerDatos();
        
        System.out.println("El producto "+
                p1.getNombre()+" tiene un descuento de "+
                p1.calcularDescuento()+" Bs");
        
        if (p1.calcularDescuento()>p2.calcularDescuento())
            System.out.println(p1.getNombre()+" tiene mayor descuento");
        else
            if (p1.calcularDescuento()<p2.calcularDescuento())
                System.out.println(p2.getNombre()+" tiene mayor descuento");
            else
                System.out.println(p1.getNombre()+" Tiene el mismo descuento "+
                        p2.getNombre());
        
        System.out.print("El mayor  "+
                (p1.calcularDescuento()>p2.calcularDescuento()?
                        p1.getNombre():p2.getNombre()));
                
    }
    
}
