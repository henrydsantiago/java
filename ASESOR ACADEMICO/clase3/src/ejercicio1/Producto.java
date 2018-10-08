
package ejercicio1;

import java.util.Scanner;

public class Producto {
    // las constantes se declaran publicas porque no pueden ser modificadas
    public final float IVA=12;
    private String nombre;
    private float precio;
    private int cantidad;
    
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    float leerNumero(String mensaje,String error,Scanner teclado)
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
    void leerDatos()
    {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Nombre:");
        setNombre(teclado.next());
        precio=leerNumero(
                "Precio:",
                "Error. El precio debe ser mayor a 0",
                teclado);
        cantidad=(int)leerNumero(
                "Cantidad:",
                "Debe colocar cantidad mayor a 0",
                teclado);
    }
    float calcularDescuento()            
    {
        if (getCantidad()>=12)
            return getPrecio()*0.15f;
        else
            return 0;
    }
}
