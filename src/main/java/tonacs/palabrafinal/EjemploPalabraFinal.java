package tonacs.palabrafinal;

public class EjemploPalabraFinal {
    public static void main(String[] args) {
        //Modificar un atributo marcado como final, no es posible modificarlo
        //ClaseFinal.VAR_PRIMITIVO=20;
        
        //Modificar referencia de un atributo de un tipo object,no se puede
        //no puede asignar una nueva referencia pero si puede acceder y modificar
        //al estado del objeto que está apuntando
        //ClaseFinal.VAR_PERSONA=new Persona();
        
        ClaseFinal.VAR_PERSONA.setNombre("Juan Perez");
        System.out.println(ClaseFinal.VAR_PERSONA.getNombre());
        
        ClaseFinal.VAR_PERSONA.setNombre("Carlos");
        System.out.println(ClaseFinal.VAR_PERSONA.getNombre());
        
        
        
    }
}
