package tonacs.estatico;

public class Persona {
    private int idPersona;//Se asocia con un objeto
    private String nombre;//Se asocia con un objeto
    private static int contadorPersonas;//Se asocia con la clase y no con los objetos
    
    public Persona(String nombre){
        this.idPersona=++contadorPersonas;
        this.nombre=nombre;
    }
    public int getIdPersona(){
        return this.idPersona;
    }
    
//    public void setIdPersona(int idPersona){
//        this.idPersona=idPersona;
//    }
    
    public String getNombre(){
        return this.nombre=nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public static int getContadorPersonas(){
        return contadorPersonas;
    }
    
    @Override
    public String toString(){
        return "idPersona: "+ this.idPersona+ " , nombre: "+ this.nombre + ", contadorPersonas: "+ contadorPersonas;
    }
}
