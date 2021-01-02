package tonacs.palabrafinal;

public  class ClaseFinal {
    //Variables marcadas como final
    public final int varNumero=10;
    
    //constantes en Java
    //Constantes se acostumbra nombrar con mayúsculas
    public static final int VAR_PRIMITIVO=15;
    
    public static final Persona VAR_PERSONA=new Persona();
    
    //Método final
    public final void  meotodoFinal(){
    }
}


//No es posible crear clases hijas de una 
//clase marcada como final
//class ClaseHija extends ClaseFinal