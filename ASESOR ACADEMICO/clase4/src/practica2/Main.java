package practica2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Alumno> alumnos=new ArrayList();
        Scanner teclado=new Scanner(System.in);
        int i=1;
        
        do
        {
            i++;
            Alumno a=new Alumno();
            System.out.println("Nombre:");
            a.setNombre(teclado.next());
            System.out.println("Nota:");
            a.setNota(teclado.nextFloat());
            if (alumnos.contains(a))
                System.out.println("Ya esta en la lista");
            else
                alumnos.add(a);            
        }while (i<=3);
        for (Alumno p:alumnos)
            System.out.println("El nombre es "+p.getNombre());
    }
    
}
