package tonacs.estatico;

public class EjemploEstatico {
    public static void main(String[] args) {
        Persona persona1=new Persona("Juan");
        System.out.println(persona1);
        
        Persona persona2=new Persona("Carlos");
        System.out.println(persona2);
        
        Persona persona3=new Persona("Mr Niebla");
        System.out.println(persona3);
        
        System.out.println("Contador de Personas: "+ Persona.getContadorPersonas());
        
        
        
    }
}
