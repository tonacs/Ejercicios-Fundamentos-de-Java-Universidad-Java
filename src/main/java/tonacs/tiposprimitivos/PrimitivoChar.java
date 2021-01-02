package tonacs.tiposprimitivos;


public class PrimitivoChar {
    public static void main(String[] args) {
         
            
            System.out.println("Bits en el tipo Char: "+ Character.SIZE);
            System.out.println("Bytes en el tipo Char: "+ Character.BYTES);
            System.out.println("Valor mínimo en el tipo Char: "+ Character.MIN_VALUE);
            System.out.println("Valor máximo en el tipo Char: "+ Character.MAX_VALUE);
            System.out.println("\n");
            
            //Comilla simple siempre que se use char
            char varChar='\u0021';
            System.out.println("varChar = " + varChar);
            
            var varCharDecimal=33;
            System.out.println("varCharDecimal = " + varCharDecimal);
            
            var varCharSimbolo='!';
            System.out.println("varCharSimbolo = " + varCharSimbolo);
            
            
    }
    
}
