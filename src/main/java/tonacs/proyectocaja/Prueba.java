package tonacs.proyectocaja;
public class Prueba {
    public static void main(String[] args) {
        //Creamos una instancia de la clase Caja
        Caja caja=new Caja(3,2,6);
        //Accedemos al método de volúmen para obetener el cálculo
        int volumen=caja.volumen();
        System.out.println("volumen = " + volumen);
    }
}
