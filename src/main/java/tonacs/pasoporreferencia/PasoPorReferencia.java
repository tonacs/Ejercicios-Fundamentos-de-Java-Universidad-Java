package tonacs.pasoporreferencia;
public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona=new Persona();
        persona.cambiarNombre("Juan");
        System.out.println("Valor nombre = " +  persona.obtenerNombre());
        
        mmodificarPersona(persona);
        System.out.println("Valor de nombre MODIFICADO "+ persona.obtenerNombre());
    }

    private static void mmodificarPersona(Persona personaArg) {
        personaArg.cambiarNombre("Calors");
        
    }
}
