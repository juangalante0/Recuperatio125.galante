
package navesespaciales;


public class Carguero extends Nave implements Explorable {
    
    private static final int CAP_CAR_MIN = 1;
    private static final int CAP_CAR_MAX = 10;
    private int capacidadCarga;

    public Carguero(int capacidadCarga, String nombre, int capacidadTripulacion, String anioLanzamiento) {
        super(nombre, capacidadTripulacion, anioLanzamiento);
        validarCapacidadCarga(capacidadCarga);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void explorar() {
        System.out.println("Carguero Explorando");
    }
    
    private void validarCapacidadCarga(int capacidad){
        if(capacidad < CAP_CAR_MIN || capacidad > CAP_CAR_MAX){
            throw new RuntimeException("La capacidad maxima es 10 y la minima 1");
        }
        
    }

    @Override
    public String toString() {
        return super.toString() + "Carguero{" + "capacidadCarga=" + capacidadCarga + '}';
    }
    
    

   
    
    
    

    
}
