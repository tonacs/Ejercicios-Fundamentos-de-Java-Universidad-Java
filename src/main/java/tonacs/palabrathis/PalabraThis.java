package tonacs.palabrathis;

public class PalabraThis {
    public static void main(String[] args) {
        Persona persona=new Persona("Juan");
    }
}

class Persona{
    String nombre;
    Persona(String nombre){
        this.nombre=nombre;//This apunta a un objeto de tipo Persona
        System.out.println("Impresión del operador this dentro de la clase Persona: "+ this);//This apunta a 
        //un objeto de tipo persona en este momento
        Imprimir imprimir=new Imprimir();
        imprimir.imprimir(this);//This contiene una referencia al objeto Persona
        
    }
}

class Imprimir{
    public void imprimir(Persona p){
        System.out.println("Impresión del argumento persona: "+ p);//Valor del objeto persona
        System.out.println("Impresión del objeto actual: "+ this);//This apunta a un objeto de tipo Imprimir en este 
        //momento
        
    }
}
