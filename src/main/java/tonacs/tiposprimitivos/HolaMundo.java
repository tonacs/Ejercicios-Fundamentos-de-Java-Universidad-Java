package tonacs.tiposprimitivos;


import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {
        //Tipos primitivos enteros
        //byte,short,int,long
        byte byteVar = 127;
        System.out.println("byteVar = " + byteVar);
        System.out.println("bits en el tipo byte " + Byte.SIZE);
        System.out.println("Bytes en el tipo Integer" + Byte.BYTES);
        System.out.println("Valor máximo tipo byte: " + Byte.MAX_VALUE);
        System.out.println("Valor máximo tipo byte: " + Byte.MIN_VALUE);
        
        System.out.println("\n");
        
        short shortVar=32767;
        System.out.println("shortVar = " + shortVar);
        System.out.println("bits en el tipo Short " + Short.SIZE);
        System.out.println("Bytes en el tipo Integer " + Short.BYTES);
        System.out.println("Valor máximo tipo Short: " + Short.MAX_VALUE);
        System.out.println("Valor máximo tipo Short: " + Short.MIN_VALUE);
        
        System.out.println("\n");
        int intVar=5000;
        System.out.println("intVar = " + intVar);
         System.out.println("bits en el tipo Integer " + Integer.SIZE);
        System.out.println("Bytes en el tipo Integer " + Integer.BYTES);
        System.out.println("Valor máximo tipo Integer: " + Integer.MAX_VALUE);
        System.out.println("Valor máximo tipo Integer: " + Integer.MIN_VALUE);
        
        System.out.println("\n");
        long LongVar=9223372036854775807L;
        System.out.println("LongVar = " + LongVar);
          System.out.println("bits en el tipo Integer " + Long.SIZE);
        System.out.println("Bytes en el tipo Integer " + Long.BYTES);
        System.out.println("Valor máximo tipo Integer: " + Long.MAX_VALUE);
        System.out.println("Valor máximo tipo Integer: " + Long.MIN_VALUE);
        
        
        
        
        
        

    }

}
