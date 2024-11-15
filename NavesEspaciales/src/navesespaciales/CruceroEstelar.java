
package navesespaciales;


public class CruceroEstelar extends Nave {
    
    private int cantidadPasajeros;

    public CruceroEstelar(int cantidadPasajeros, String nombre, int capacidadTripulacion, String anioLanzamiento) {
        super(nombre, capacidadTripulacion, anioLanzamiento);
        this.cantidadPasajeros = cantidadPasajeros;
    }

    @Override
    public String toString() {
        return super.toString() + "CruceroEstelar{" + "cantidadPasajeros=" + cantidadPasajeros + '}';
    }
    
}
