
package clase4;

public class Año {
    private Mes meses[];
    private int año;
    
    public Mes[] getMeses()
    {
        return meses;
    }
    public Año(int n)
    {
        año=n;
        meses=new Mes[12];
        meses[0]=new Mes();
        meses[0].setNombre("Enero");
        meses[0].setDias(31);
        meses[1]=new Mes("Febrero",28);
        meses[10]=new Mes("Noviembre",30);
        Mes m=new Mes("Marzo",31);
        meses[2]=m;
    }
}
