package clase1;

/**
 *
 * @author Asesor
 */
public class Clase1 {

    public static void main(String[] x) {
        // TODO code application logic here
        int nroHorasNivel1=21,nroNiveles=5;
        float precioNivel1=150000,precioNivel2,precioNivel3;
        String nombreCurso="Java",
                horario;
        // la variable toma el caracter correspondiente al codigo
        // ascii usado
        char codigo='J'; 
        boolean registradoMinisterioEducacion=true;
        
        precioNivel2=precioNivel1*1.25f;
        precioNivel3=precioNivel2*1.25f;
        float promedio=(precioNivel1+precioNivel2+precioNivel3)/3;
        float semanasDeClase=nroNiveles*nroHorasNivel1/4f;
        int valorPorHora=(int)(precioNivel1/nroNiveles);
        
        System.out.print("El curso de "+nombreCurso+"("+(int)codigo+") ");
        System.out.println("tiene "+nroNiveles+" niveles ");
        System.out.println("Cuesta "+precioNivel1+" Bs el nivel 1");
        System.out.println("el numero de horas es "+nroHorasNivel1);
        System.out.println("las semanas de clase son "+semanasDeClase);
    }
    
}
