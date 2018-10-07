import java.util.*;
import javax.swing.*;

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
    private ArrayList<Marino> marinos;
    private ArrayList<Marino> pilotos;
    
    final JPanel panel = new JPanel();
    /**
     * Constructor for objects of class Flota
     */
    public Flota()
    {
        maquinas = new ArrayList<Maquina>();
        marinos = new ArrayList<Marino>();
    }

    public void alNorte()
    {        
        for(Maquina machine : maquinas){
            /*
            if(machine.getPosiciones()[0] <= 100){
                machine.setLatitud(machine.getPosiciones()[0]+10);
            }
            else{
                JOptionPane.showMessageDialog(panel,"BatallaNavalExcepcion");
            }*/
            
            try{
                machine.setLatitud(machine.getPosiciones()[0]+10);
            }
            catch(BatallaNavalException e){
                JOptionPane.showMessageDialog(panel,"BatallaNavalExcepcion");
            }                         
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
            if(machine.esDebil()){
                numeroMaquinasDebiles++;
            }             
        
        }
        return numeroMaquinasDebiles;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public boolean esBuenAtaque(int longitud,int latitud)
    {
        for(Maquina machine: maquinas){
            if(machine.getPosiciones()[0] == latitud && machine.getPosiciones()[1] == longitud){
                return false;
            }
        }
        return true;
    }
    
    /**
     * retorna todos los pilotos de la flota.
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public ArrayList<Marino> pilotos()
    {
        for(Maquina machine: maquinas){            
            if(machine instanceof Avion){
                pilotos.add(machine.getPiloto());
            }
            else if(machine instanceof PortaAvion){
                ArrayList<Marino> new_ar = machine.getPilotos();
                ArrayList<Marino> new_array = machine.getMarino();                
                for(Marino mn: new_ar){
                    if(marinos.contains(mn) && new_array.contains(mn) && !(pilotos.contains(mn))){
                        pilotos.add(mn);
                    }
                    else{
                        throw new  BatallaNavalException();
                    }
                }
                
            }
        }
        return pilotos;
    }

}
