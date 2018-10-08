package clase3;

import java.util.Scanner;

public class producto {
   
    public final float IVA= 12; //Por ser constante se puede declarar pùblica
    private String nombre;
    private float precio;
    private int cantidad;
    
    public String getNombre()
    {
    return nombre;
    }
    float leerNumero(String mensaje, String error, Scanner teclado)
    {
        float valor;
        do 
        {
            System.out.println(mensaje);
            valor=teclado.nextFloat();
             if (valor<0)
            System.out.println(error);
        }while (valor<0);
       return valor;
    }
    void leerDatos(){
    
        Scanner teclado=new Scanner(System.in); // declaramos un objeto de la clase Scanner
        System.out.println ("Nombre: ");
        setNombre(teclado.next());
        precio = leerNumero(
                "Precio: ",
                "Error. El precio debe ser igual o mayor a 0",
                teclado);
        cantidad = (int)leerNumero(
                "Cantidad: ",
                "Error. La cantidad debe ser igual o mayor a 0",
                teclado);
    }
    
    float calcularDescuento(){ // creamos un método que calcule un descuento del 15% si la cantidad es igual a 12
        if (getCantidad()>12)
            return getPrecio()*0.15f;
        else
            return 0;    
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
            
    
}
