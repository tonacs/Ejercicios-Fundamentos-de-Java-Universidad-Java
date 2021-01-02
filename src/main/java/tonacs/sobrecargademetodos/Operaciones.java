package tonacs.sobrecargademetodos;

public class Operaciones {
    //Método sumar
    
    public static int sumar(int a, int b){
        System.out.println("Método sumar con los argumentos de tipo entero (int,int)");
        return a+b;
    }
    
    //Sobrecarga del método sumar
    public static double sumar(double a, double b){
        System.out.println("Método sumar con argumentos de tipo double (double,double)");
        return a+b;
    }
    public static double sumar(int a, double b){
        System.out.println("Método sumar con argumentos int y double");
        return a+b;
    }
     public static double sumar( double b,int a){
        System.out.println("Método sumar con argumentos DOUBLE E INT");
        return a+b;
    }
}
