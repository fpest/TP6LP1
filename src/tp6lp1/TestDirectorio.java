package tp6lp1;

public class TestDirectorio {

    public static void main(String[] args) {

        Ciudad ciudad1 = new Ciudad("San Luis");
        Ciudad ciudad2 = new Ciudad("Villa Mercedes");

        

        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();

        cliente1.setApellido("Perez");
        cliente1.setNombre("Juan");
        cliente1.setDni(22333444);
        cliente1.setCiudad(ciudad1);
        cliente1.setDireccion("Tomas Jofre 444");

        cliente2.setApellido("Fernandez");
        cliente2.setNombre("Ignacio");
        cliente2.setDni(55666777);
        cliente2.setCiudad(ciudad2);
        cliente2.setDireccion("Pedernera 444");

        Directorio directorio = new Directorio();

        directorio.agregarCliente(cliente1, 2664999);
        directorio.agregarCliente(cliente2, 2664999);

        System.out.println("Cliente buscado es: " + directorio.buscarCliente((long) 2664999));
        System.out.println("Cliente buscado es: " + directorio.buscarCliente((long) 2665888));

    }

}
