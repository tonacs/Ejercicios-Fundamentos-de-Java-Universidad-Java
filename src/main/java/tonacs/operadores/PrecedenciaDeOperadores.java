package tonacs.operadores;


public class PrecedenciaDeOperadores {
    public static void main(String[] args) {
        var x=5;
        var y=10;
        var z=++x + y--;//x=6,y=10
        System.out.println("X = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        
        //Procedencia de Operadores
        //Operadores unarios-máxima prioridad
        //() 
        //* / %
        //+ - 
        
    }
}
