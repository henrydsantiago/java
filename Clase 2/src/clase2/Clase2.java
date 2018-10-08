package clase2;

import java.util.Scanner;

public class Clase2 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        Empleado e1=new Empleado(),e2=new Empleado();
        Fecha f=new Fecha();
        
        e1.leerDatos();
        e2.leerDatos();
        
        System.out.println("Dia de nacimiento:");
        f.d=teclado.nextInt();
        System.out.println("mes de nacimiento:");
        f.m=teclado.nextInt();
        System.out.println("Año de nacimiento");
        f.a=teclado.nextInt();
        f.mostrarFecha();
        
        e1.fechaNac=f;
        e2.fechaNac=new Fecha();
        System.out.println("El empleado 1 nacio el ");
        e1.fechaNac.mostrarFecha();
        System.out.println("El empleado 2 nacio el ");
        e2.fechaNac.mostrarFecha();
        // Scanner no tiene metodos para leer char
        
        
        System.out.println("El nombre es "+e1.nombre);
        System.out.println("El caracter leido fue "+e1.sexo);
    }    
}
