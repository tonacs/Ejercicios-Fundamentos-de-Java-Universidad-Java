package tonacs.disenoclases;
public class Ventas {
    public static void main(String[] args) {
        Producto producto1=new Producto("Camisa",50);
        Producto producto2=new Producto("Pantalón",100);
        
        //Objeto de tipo Orden
        Orden orden1=new Orden();
        //Agregamos los productos al objeto orden
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        
        //Imprimir la orden
        orden1.mostrarOrden();
    }
}
