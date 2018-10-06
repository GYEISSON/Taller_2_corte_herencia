import java.util.*;
/**
 * Clase nodriza que tiene capsulas.
 */
public class Nodriza extends Maquina implements AutoDestruirse
{
    private ArrayList<Capsula> capsulas;
    /**
     * Constructor for objects of class Nodrisa
     */
    public Nodriza()
    {
        capsulas = new ArrayList<Capsula>();
    }    
    public boolean esDebil(){return true;}
    
    public void informe(){}
    
    public void destruir(){}
}
