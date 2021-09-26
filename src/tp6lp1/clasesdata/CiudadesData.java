package tp6lp1.clasesdata;


import java.util.ArrayList;
import javax.swing.JOptionPane;
import tp6lp1.Ciudad;


public class CiudadesData {

    private ArrayList<Ciudad> listaDeCiudades = new ArrayList<>();

    public ArrayList<Ciudad> obtenerCiudades(){
        //  Estas Ciudades las agregamos sólo para tener algunas precargadas 
        //  ya que el ejercicio no lo pide como Clase.
        
        if (!this.listaDeCiudades.contains(new Ciudad("San Luis"))){
            this.agregarCiudad(new Ciudad("San Luis"));
            this.agregarCiudad(new Ciudad("Villa Mercedes"));
            this.agregarCiudad(new Ciudad("Juan Kolay"));
            this.agregarCiudad(new Ciudad("El Volcan"));
        };
        return listaDeCiudades;
    }
    
    public void agregarCiudad(Ciudad ciudad){
        
        if (!this.listaDeCiudades.contains(ciudad)){
            this.listaDeCiudades.add(ciudad);
            // Este if es para que cuando se agreguen las 4 primera ciudades del constructor
            // no lance el dialogo.
            if (this.listaDeCiudades.size()>4){
                JOptionPane.showMessageDialog(null, "Ciudad ingresada correctamente.");}
        }else{
                JOptionPane.showMessageDialog(null, "Esta Ciudad ya estaba registrada.");}

    }
    }
    
    
    
    

