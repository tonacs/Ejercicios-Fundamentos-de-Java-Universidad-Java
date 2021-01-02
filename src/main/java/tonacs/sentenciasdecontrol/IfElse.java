
package tonacs.sentenciasdecontrol;

public class IfElse {
    public static void main(String[] args) {
        var condicion=false;
       if(condicion){
           System.out.println("Condición verdadera");
       } else{
           System.out.println("Condición FALSA");
       }
       var numero=2;
       if(numero==1){
           System.out.println("Número UNO");
       }else if(numero==2){
           System.out.println("Número DOS");
       }
       else{
           System.out.println("Valor desconocido");
       }
    }
}
