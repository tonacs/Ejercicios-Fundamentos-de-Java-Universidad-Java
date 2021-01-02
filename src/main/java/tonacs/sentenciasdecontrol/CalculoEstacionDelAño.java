package tonacs.sentenciasdecontrol;

import java.util.Scanner;

public class CalculoEstacionDelAño {

    public static void main(String[] args) {
        var Scanner = new Scanner(System.in);
        System.out.println("Ingrese el mes del año");
        var mes = Scanner.nextInt();//Mes del año

        String estacion = null;
        if (mes == 1 || mes == 2 || mes == 12) {
            estacion = "Invierno";
        } else if (mes == 3 || mes == 4 || mes == 4) {
            estacion = "Primavera";
        } else if (mes == 6 || mes == 7 || mes == 8) {
            estacion = "Verano";
        } else if (mes == 9 || mes == 10 || mes == 11) {
            estacion = "Otoño";
        } else {
            estacion = "MES INCORRECTO";
        }

        System.out.println("Estación: " + estacion + " para el mes: " + mes);
    }
}
