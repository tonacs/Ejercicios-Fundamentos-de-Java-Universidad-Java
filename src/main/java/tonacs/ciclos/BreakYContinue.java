package tonacs.ciclos;

public class BreakYContinue {

    public static void main(String[] args) {
        inicio://Etiqueta del ciclo
        for (int i = 0; i < 10; i++) {
            //Imprimimos solo números pares
            if (i % 2 != 0) {
                continue inicio;
            }
            System.out.println("i = "+ i);
        }

    }
}
