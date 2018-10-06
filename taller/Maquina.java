
/**
 * Write a description of class Maquina here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class   Maquina
{
    // instance variables - replace the example below with your own
    protected int cantidadPersonas;
    private Ubicacion  posiciones;
    protected boolean portaAvionDebil;

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
    
    protected int numPersonas(){
        return cantidadPersonas;
    }
    
    public abstract boolean esDebil();
    
}
