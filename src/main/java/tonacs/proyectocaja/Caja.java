package tonacs.proyectocaja;

public class Caja {
    int ancho;
    int alto;
    int profundo;
    
    public Caja(){
        
    }
    public Caja(int ancho, int alto, int profundo){
        this.ancho=ancho;
        this.alto=alto;
        this.profundo=profundo;
    }
    public int volumen(){
        return this.alto*this.ancho*this.profundo;
    }
}
