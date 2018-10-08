
package clase2;

import java.util.Scanner;

public class Empleado {
    String nombre;
    int edad;
    float sueldo;
    char sexo;
    Fecha fechaNac;
    
    void leerDatos()
    {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Sexo (M o F):");
        sexo=teclado.next().charAt(0);
        System.out.println("Sueldo:");
        sueldo=teclado.nextFloat();
        System.out.println("Nombre:");
        teclado.nextLine();// elimina el Enter
        nombre=teclado.nextLine();
        System.out.println("Edad:");
        edad=teclado.nextInt();
    }
}
