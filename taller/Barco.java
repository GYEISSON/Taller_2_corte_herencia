import java.util.*;
/**
 * Write a description of class Barco here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Barco extends Maquina implements AutoDestruirse 
{
    protected ArrayList<Marino> marinos;
    
    
    /**
     * Constructor for objects of class Barco
     */
    public Barco()
    {
        // initialise instance variables
        marinos = new ArrayList<Marino>();
        setMarinos();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    protected void setMarinos()
    {
        cantidadPersonas = marinos.size();
    }
    public boolean esDebil(){return true;}

    public void informe(){}
    
    public void destruir(){}
}
