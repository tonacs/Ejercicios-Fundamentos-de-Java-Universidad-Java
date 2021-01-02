package tonacs.arreglos;

public class EjemploArreglos {
    public static void main(String[] args) {
        //1.- Declarar una variable de tipo arreglo, un arreglo de int
        int edades[];
        //2.- Instanciar el arreglo de int
        edades=new int[3];
        //3.- Inicializar los valores de los elementos del arreglo
        edades[0]=30;
        edades[1]=15;
        edades[2]=20;
        //4.- Imprimir valores del arreglo
        System.out.println("Arreglo de enteros índice 0: "+ edades[0]);
        System.out.println("Arreglo de enteros índice 1: "+ edades[1]);
        System.out.println("Arreglo de enteros índice 2: "+ edades[2]);
        
        //1.- Declarar e instanciar un arreglo de tipo Object
        Persona personas[]=new Persona[4];
        //2.- Inicializar los valores del arreglo
        personas[0]=new Persona("Juan");
        personas[2]=new Persona("Pedro");
        
        System.out.println("Arreglo personas en el índice 0: "+ personas[0]);
        System.out.println("Arreglo personas en el índice 1: "+ personas[1]);
        System.out.println("Arreglo personas en el índice 2: "+ personas[2]);
        System.out.println("Arreglo personas en el índice 3: "+ personas[3]);
        
        
        //Arreglo utilizando notación simplificada
        String nombres[]={"SSSS","Carlos","ookokok"};
        //Imprimir los elementos de un arreglo
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Arreglo String índice: "+ i + " : "+ nombres[i]);
        }
        
        
        
        
        
    }
}
