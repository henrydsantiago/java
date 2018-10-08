package clase4;

public class Año {
    private Mes meses[];
    private int año;
    
    public Mes[] getMeses()
    {
    return meses;
    }
    
    public Año(int n) /*Esto es el constructor de la clase año*/
    {
        año = n;
       
        meses=new Mes[12]; /*aquí creo el arreglo*/
        meses[0]=new Mes(); /*aquí instancio un objeto en cada posición del arreglo*/
        meses[0].setNombre("Enero"); /*le asigna valores a los atributos del objeto*/
        meses[0].setDias(31); /*le asigna valores a los atributos del objeto*/
        
        meses[1]=new Mes("Febrero",28); /*otra forma de inicializar #2*/
        
        Mes m=new Mes("Marzo",31); /*otra forma de inicializar #3. Es inicializado con un objeto mes válido*/
        meses[2]=m;
        meses[3] = new Mes ("Abril",30);
        meses[4] = new Mes ("Mayo",31);
        //meses[5] = new Mes ("Junio",30);
        meses[6] = new Mes ("Julio",31);
        meses[7] = new Mes ("Agosto",31);
        //meses[8] = new Mes ("Septiembre",30);
        meses[9] = new Mes ("Octubre",31);
        meses[10] = new Mes ("Noviembre",30);
        meses[11] = new Mes ("Diciembre",31);
       
    }        
}
