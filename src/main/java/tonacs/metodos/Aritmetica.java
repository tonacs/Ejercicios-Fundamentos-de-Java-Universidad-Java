package tonacs.metodos;

public class Aritmetica {

    int a = 0;
    int b = 0;
    //Constructor debe de llamarse igual al nombre de la clase

//    public Aritmetica(){
//        System.out.println("Ejecutando constructor vacío");
//    }
    public Aritmetica(int a, int b) {
        this.a = b;
        this.b = b;
    }

    //Firma del método:
    //Modificador de acceso, el tipo de regreso, el nombre del método, argumentos separdos por coma.
    public int sumar() {
        return this.a + this.b;

    }

    public int restar() {
        return this.a - this.b;
    }

    public int multiplicar() {
        return this.a * this.b;

    }
    public int dividir(){
        return this.a/this.b;
    }
}
