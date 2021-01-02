package tonacs.palabranull;

public class PalabraNull {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan");
        System.out.println("persona1 = " + persona1.obtenerNombre());
        Persona persona2 = persona1;
        System.out.println("persona 2 = " + persona2.obtenerNombre());
        persona1 = null;
        if (persona1 != null) {
            System.out.println("persona1 = " + persona1.obtenerNombre());

        }else{
            System.out.println("La variable persona 1 no apunta a ningún objeto");
        }

    }

}

class Persona {

    String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String obtenerNombre() {
        return this.nombre;
    }
}
