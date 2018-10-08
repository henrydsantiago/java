
package clase4;

public class Mes {
    private String nombre;
    private int dias;

    public Mes()
    {
        nombre="Diciembre";
        dias=31;
    }
    public Mes(String nombre,int dias)
    {
        this.nombre=nombre;
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
