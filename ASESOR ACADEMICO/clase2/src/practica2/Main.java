
package practica2;

import clase2.Fecha;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Fecha f5=new Fecha(); // declaracion e instanciacion
        Fecha f1; // declaracion
        
        f1=new Fecha(); // instanciacion
        System.out.println("hola "+f5);
        System.out.println("hola "+f1);
        System.out.println("hola "+new Fecha());
    }
    
}
