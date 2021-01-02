
package tonacs.sentenciasdecontrol;

public class SentenciaSwitch {
    public static void main(String[] args) {
        var numero=0;
        var numeroTexto="Numero desconocido";
        switch(numero){
            case 1:
                numeroTexto="numero uno";
                break;
            case 2:
                 numeroTexto="numero DOS";
                break;
            case 3:
                 numeroTexto="numero TRES";
                break;
            default:
                numeroTexto="NUMERO DESCONOCIDO";
                
        }
        System.out.println("Numero texto: "+ numeroTexto + " para el numero proporcionado "+ numero);
    }
}
