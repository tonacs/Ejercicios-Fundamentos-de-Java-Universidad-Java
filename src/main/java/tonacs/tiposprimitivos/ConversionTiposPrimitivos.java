package tonacs.tiposprimitivos;


import java.util.Scanner;


public class ConversionTiposPrimitivos {
    //Convertir un String a un tipo int
    
    public static void main(String[] args) {
        
        
       int edad=Integer.parseInt("10"); 
        System.out.println("edad = " + edad);
        
        double valorPI=Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);
        
        char c="hola".charAt(0);
        System.out.println("c = " + c);
        
        var scanner=new Scanner(System.in);
        System.out.println("Escriba una edad \n");
        edad=Integer.parseInt(scanner.nextLine());
        System.out.println("scanner = " + edad);
        System.out.println("\n");
        char caracter=scanner.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
        
        //Conversión de Entero a String
        String edadTexto=String.valueOf(25);
        System.out.println("edadTexto = " + edadTexto);
        
        //Conversión entre tipos
        //Casting
        short s=10;
        byte b=(byte)s;
        System.out.println("b = " + b);
        
    }
    
    
}
