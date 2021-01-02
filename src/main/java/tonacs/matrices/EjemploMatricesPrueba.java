package tonacs.matrices;

public class EjemploMatricesPrueba {
    public static void main(String[] args) {
        //1.- Declaramos una matriz de int
        int edades[][];
        //2.- Instanciamos la matriz de int 
        edades=new int[3][2];
        //3.- Instanciar los valores de la matriz
        edades[0][0]=30;
        edades[0][1]=15;
        edades[1][0]=20;
        edades[1][1]=45;
        edades[2][0]=5;
        edades[2][1]=38;
        //4.- Imprimir
        System.out.println("Matriz enteros índice 0 0: " + edades[0][0]);
        System.out.println("Matriz enteros índice 0 1: " + edades[0][1]);
        System.out.println("Matriz enteros índice 1 0: " + edades[1][0]);
        System.out.println("Matriz enteros índice 1 1: " + edades[1][1]);
        System.out.println("Matriz enteros índice 2 0: " + edades[2][0]);
        System.out.println("Matriz enteros índice 2 1: " + edades[2][1]);
        
        //1.- Declarar e instanciar una matriz de objetos de tipo persona
        Persona personas[][]=new Persona[1][2];
        //2.- Inicializamos valores
        personas[0][0]=new Persona("Juan");
        personas[0][1]=new Persona("Pepe");
        
        //3.- Imprimimos valores
        System.out.println("Matriz persona índice 0 0: "+ personas[0][0]);
        System.out.println("Matriz persona índice 0 1: "+ personas[0][1]);
        
        //4.- Recorrer con arreglo
        for (int renglon = 0; renglon < personas.length; renglon++) {
            for (int columna = 0; columna < personas[renglon].length; columna++) {
                System.out.println("Matriz de personas en el índice: "+ renglon + " - "+ columna + " : "+ personas[renglon][columna]);
            }
        }
        
        
        
    }
}
