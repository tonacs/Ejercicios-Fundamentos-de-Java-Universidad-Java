package tonacs.clases;

public class PruebaPersonas {
    public static void main(String[] args) {
        //Creación de un objeto de tipo persona
        
        //Definición de la variable de tipo Persona
        Persona persona1;
        //Instanciando (creando) un objeto de la clase Persona
        persona1=new Persona();
        
        //Acccedemos al objeto persona, y llamamos al método desplegarNombres
        persona1.despelgarNombres();
        
        //Modificamos los valores de los atributos del objeto Persona
        persona1.nombre="Juan";
        persona1.apellido="Perez";
        
        //Volvemos a imprimir los valores
        System.out.println("\n");
        persona1.despelgarNombres();
        
        //Creando un segundo objeto de tipo Persona
        Persona persona2=new Persona();
        persona2.nombre="TTT";
        persona2.apellido="Rodriguez";
        
        //Volvemos a imprimir los valores
        System.out.println("\n");
        persona2.despelgarNombres();
        
    }
}
