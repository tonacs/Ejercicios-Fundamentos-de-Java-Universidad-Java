package tonacs.ciclos;

public class CicloWHileDoWHile {

    public static void main(String[] args) {
        var contador = 0;
//        while (contador < 3) {
//            System.out.println("Ciclo infinito While" + contador);
//            contador++;
//
//        }
        do{
            System.out.println("Ciclo infinito While" + contador);
            contador++;
        }while(contador < 3);
    }
}
