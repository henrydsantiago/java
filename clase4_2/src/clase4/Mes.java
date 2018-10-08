package clase4;


public class Mes {
    private String nombre;
    private int dias;
    
    public Mes() /*este es el constructor por defecto. Es decir cuando no pase parámetros.*/
    {           /*si no se coloca este constructor darìa error en la clase año por que no tendrìa asignado el llamado sin parametros*/
        nombre="Diciembre";
        dias=31;
    }
   
   
    public Mes(String nombre,int dias) /*Este es el constructor de la clase mes*/
    {
        this.nombre=nombre; /* el "this." diferencia al parametro del atributo*/
        this.dias=dias;
    }

    
    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public int getDias() {
        return dias;
    }

    
    public void setDias(int dias) {
        this.dias = dias;
    }
}
