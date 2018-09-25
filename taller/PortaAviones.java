import java.util.*;
/**
 * Write a description of class PortaAviones here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PortaAviones extends Barco
{
    // instance variables - replace the example below with your own
    private int x;
    private ArrayList<Avion> aviones;
    
    /**
     * Constructor for objects of class PortaAviones
     */
    public PortaAviones()
    {
        aviones = new ArrayList<Avion>();                                                                                  
        setMarinos();
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public boolean avionDebil()
    {
        for(Avion av: aviones){
            portaAvionDebil = (av.haycoPiloto())? true: false;
        }
        return portaAvionDebil;
    }
}
