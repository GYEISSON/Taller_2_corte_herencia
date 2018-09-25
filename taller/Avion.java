
/**
 * Write a description of class Avion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Avion extends Maquina
{
    // instance variables - replace the example below with your own
    private String placa;
    private boolean enAire;
    private Marino piloto;
    private Marino coPiloto;
    private boolean hayCoPiloto;
    /**
     * Constructor for objects of class Avion
     */
    public Avion(String placa, Marino piloto)
    {
        this.placa = placa;
        enAire = false;
        this.piloto = piloto;
        hayCoPiloto = false;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setCopiloto(Marino coPiloto)
    {
        this.coPiloto = coPiloto;
        this.hayCoPiloto = true;
        setMarinos();
    }
    
    public boolean haycoPiloto(){ return hayCoPiloto;}
    
    private void setMarinos(){
        if(hayCoPiloto) cantidadPersonas = 2;
        else cantidadPersonas =1;
    }
    
    public Marino getPiloto(){
        return this.piloto;
    }
}
