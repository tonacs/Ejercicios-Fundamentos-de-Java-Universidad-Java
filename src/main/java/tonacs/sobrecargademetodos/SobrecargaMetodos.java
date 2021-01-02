package tonacs.sobrecargademetodos;

public class SobrecargaMetodos {

    public static void main(String[] args) {
        System.out.println("Resultado1: " + Operaciones.sumar(3, 4));
        System.out.println("Resultado 2\t : " + Operaciones.sumar(3.0, 4));
        System.out.println("Resultado 3\t : "+ Operaciones.sumar(3, 4L));

    }

}
