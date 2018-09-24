
/**
 * Write a description of class Maquina here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Maquina
{
    // instance variables - replace the example below with your own
    protected int cantidadPersonas;
    private Ubicacion  posiciones;
    protected boolean portaAvionDebil;
    //protected ArrayList<Marino> marinos;
    /**
     * Constructor for objects of class Maquina
     */
    public Maquina()
    {
        // initialise instance variables
        cantidadPersonas = 0;
        posiciones = new Ubicacion();
        portaAvionDebil=false;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int[] getPosiciones()
    {
        return posiciones.getPos();
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setLatitud(int latitud)
    {
        posiciones.setLatitud(latitud);
    }
    
    public int numPersonas(){
        return cantidadPersonas;
    }
}
