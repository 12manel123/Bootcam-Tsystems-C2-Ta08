public class MainApp {
    public static void main(String[] args) {
        //Ex1
        Persona persona1 = new Persona();
        persona1.setNombre("Manel");
        persona1.setEdad(21);
        persona1.setSexo('M');
        persona1.setPeso(102.5);
        persona1.setAltura(1.81);

        Persona persona2 = new Persona("Carla", 24, 'F');

        System.out.println("Persona 1:");
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Edad: " + persona1.getEdad());
        System.out.println("Sexo: " + persona1.getSexo());
        System.out.println("Peso: " + persona1.getPeso());
        System.out.println("Altura: " + persona1.getAltura());

        System.out.println("\nPersona 2:");
        System.out.println("Nombre: " + persona2.getNombre());
        System.out.println("Edad: " + persona2.getEdad());
        System.out.println("Sexo: " + persona2.getSexo());

      //Ex2
        Password password1 = new Password();
        System.out.println("\nContrase�a 1: " + password1.getContrase�a());

        Password password2 = new Password(10);
        System.out.println("Contrase�a 2: " + password2.getContrase�a());

      //Ex3
        Electrodomestico electrodomestico1 = new Electrodomestico();
        electrodomestico1.setColor("rojo");
        electrodomestico1.setConsumoEnergetico('A');
        electrodomestico1.setPeso(15.0);
        electrodomestico1.setPrecioBase(600.0);

        Electrodomestico electrodomestico2 = new Electrodomestico(400.0, 4.0);

        System.out.println("\nElectrodom�stico 1:");
        System.out.println("Color: " + electrodomestico1.getColor());
        System.out.println("Consumo energetico: " + electrodomestico1.getConsumoEnergetico());
        System.out.println("Peso: " + electrodomestico1.getPeso());
        System.out.println("Precio base: " + electrodomestico1.getPrecioBase());

        System.out.println("\nElectrodom�stico 2:");
        System.out.println("Color: " + electrodomestico2.getColor());
        System.out.println("Consumo energetico: " + electrodomestico2.getConsumoEnergetico());
        System.out.println("Peso: " + electrodomestico2.getPeso());
        System.out.println("Precio base: " + electrodomestico2.getPrecioBase());

      //Ex4
        Serie serie1 = new Serie();
        serie1.setTitulo("Good Doctor");
        serie1.setCreador("Elliot");
        serie1.setGenero("Doctores");

        Serie serie2 = new Serie("House", "House Dylan");

        System.out.println("\nSerie 1:");
        System.out.println("T�tulo: " + serie1.getTitulo());
        System.out.println("Creador: " + serie1.getCreador());
        System.out.println("G�nero: " + serie1.getGenero());

        System.out.println("\nSerie 2:");
        System.out.println("T�tulo: " + serie2.getTitulo());
        System.out.println("Creador: " + serie2.getCreador());
        System.out.println("G�nero: " + serie2.getGenero());
    }
}
