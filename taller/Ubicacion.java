
/**
 * Write a description of class Ubicacion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ubicacion
{
    // instance variables - replace the example below with your own
    private int longitud;
    private int latitud;
    
    /**
     * Constructor for objects of class Ubicacion
     */
    public Ubicacion()
    {
        // initialise instance variables
        longitud = 0;
        latitud = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int[] getPos()
    {
        int[] posiciones= new int[2];
        posiciones[0] = this.latitud;
        posiciones[1] = this.longitud;
        return posiciones;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setLatitud(int y)
    {
        this.latitud = y;
    }


}
