
package tonacs.operadores;


public class OperadorTernario {
    public static void main(String[] args) {
        var resultado=(1>2)?"VERDADERO":"FALSOOO";
        System.out.println("resultado = " + resultado);
        
        
        var numero=7;
        var par=(numero % 2 ==0) ? "Número PAR": "Número Impar";
        System.out.println("par = " + par);
    }
    
}
