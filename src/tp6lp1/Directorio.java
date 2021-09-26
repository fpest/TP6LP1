package tp6lp1;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import javax.swing.JOptionPane;
import tp6lp1.vistas.MenuPrincipal;


public class Directorio {

private Map<Long,Cliente> directorio;

    

    public Directorio() {
        directorio = new HashMap<>();
    }

    public Map<Long, Cliente> getDirectorio() {
        return directorio;
    }

    public void setDirectorio(Map<Long, Cliente> directorio) {
        this.directorio = directorio;
    }

 
    
    public void agregarCliente(Cliente cliente, long numeroTelefono){
        
         for (Map.Entry<Long,Cliente> e: MenuPrincipal.getDirectorio().getDirectorio().entrySet()) {
                Cliente cliLista = e.getValue();
            if (cliente.equals(cliLista)){
            JOptionPane.showMessageDialog(null, "El DNI ingresado ya existe en la base. Se agregará un nuevo teléfono al mismo cliente.");
            }
         }
        
        if (!directorio.containsKey((Long) numeroTelefono)){
            this.directorio.put(numeroTelefono, cliente);
            JOptionPane.showMessageDialog(null, "Se agregó correctamente el cliente en el directorio.");
        }else{
            JOptionPane.showMessageDialog(null, "El teléfono ingresado ya existe en la base. No se pudo agregar el cliente.");
            }
    }
    
    
    

       
    
    

   
   public Cliente buscarCliente(long numeroTelefono){
          
        Set <Long> numerosTelefono = directorio.keySet();
        Iterator it = numerosTelefono.iterator();
            while (it.hasNext()){
            long numeroTelefonoIterator = (long)it.next();
            
            if (numeroTelefono==numeroTelefonoIterator){
                Cliente cliente = directorio.get(numeroTelefono);
                System.out.println("Telefono: " + numeroTelefono + " Cliente: " + cliente);
                return cliente;
            }
            }
        return null;
  }
   
   
   
}