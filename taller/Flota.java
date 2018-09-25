import java.util.*;
/**
 * Write a description of class Flota here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Flota
{
    // instance variables - replace the example below with your own
    private ArrayList<Maquina> maquinas;

    /**
     * Constructor for objects of class Flota
     */
    public Flota()
    {
        maquinas = new ArrayList<Maquina>();
    }

    public void alNorte()
    {
        for(Maquina machine : maquinas){
            machine.setLatitud(machine.getPosiciones()[0]+10);
        }
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public ArrayList<Maquina> seranDestruidas(int  longitud, int latitud)
    {
        ArrayList<Maquina>  destruccion= new ArrayList<Maquina>();
        for(Maquina machine: maquinas){
            if(machine.getPosiciones()[1] == longitud && 
            machine.getPosiciones()[0] == latitud){
                destruccion.add(machine);
            }  
        }
        return destruccion;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int maquinasDebiles()
    {
        int numeroMaquinasDebiles = 0;
        for(Maquina machine: maquinas){
            if(machine instanceof PortaAviones){
                //revisar si es un barco debil
                if(machine.numPersonas() < 5)numeroMaquinasDebiles++;
                //if(machine.avionDebil())numeroMaquinasDebiles++;
            }
            
            
            // if (machine.numPersonas()<5) numeroMaquinasDebiles++; 
            // else if(machine instanceof Avion){
                // if (machine.numPersonas()==1) numeroMaquinasDebiles++;
            // }
        
            // else if(machine instanceof PortaAviones){
                // // if(machine)
            
            
     
        //}
        return numeroMaquinasDebiles;
    }
}
}
