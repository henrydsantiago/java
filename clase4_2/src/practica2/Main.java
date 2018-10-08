
package practica2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Alumno> alumnos  = new ArrayList();
        Scanner teclado = new Scanner(System.in);
        int i = 0;
        do{
            Alumno a = new Alumno();
            System.out.println("Indique el nombre del alumno: ");
            a.setNombre(teclado.next());
             System.out.println("Indique la nota de "+a.getNombre()+ ": " );
            a.setNota(teclado.nextFloat());
            
            if (alumnos.contains(a))
            {
                System.out.println("El alumno ya está en la lista");
            }
            else
            {
                alumnos.add(a);
                System.out.println(a.getNombre() + "fue agregado exitosamente");
                i++;
            }

        }while (i<=2);
        for (Alumno p: alumnos)
            System.out.println("El nombre es "+p.getNombre()+ " y su nota es " + p.getNota());
    }
}
