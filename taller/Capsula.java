import java.util.*;
/**
 * Capsulas submarinas.
 */
public class Capsula extends Maquina implements AutoDestruirse
{
    private ArrayList<Capsula> otrasCapsulas;

    /**
     * Constructor for objects of class Capsula
     */
    public Capsula()
    {
        otrasCapsulas = new ArrayList<Capsula>();        
    }
    
    public boolean esDebil(){return true;}
    
    public void informe(){}
    
    public void destruir(){}
}
