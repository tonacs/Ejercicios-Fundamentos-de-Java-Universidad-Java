package tonacs.sobrecargadeconstructores;

public class SobrecargaConstructores {
    public static void main(String[] args) {
        Persona persona1=new Persona("Juan",25);
        System.out.println(persona1);
        
        Empleado empleado1=new Empleado("PEPE", 90, 90000);
        System.out.println( empleado1);
    }
}
