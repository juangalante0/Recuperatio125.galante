
package navesespaciales;

import java.util.Objects;


public class Nave {
    
    private String nombre;
    private int capacidadTripulacion;
    private String anioLanzamiento;

    public Nave(String nombre, int capacidadTripulacion, String anioLanzamiento) {
        this.nombre = nombre;
        this.capacidadTripulacion = capacidadTripulacion;
        this.anioLanzamiento = anioLanzamiento;
    }
    
    
    @Override
    public boolean equals(Object o){
        if(o == this){
        return true;
        }
        if(o == null || !(o instanceof Nave nave)){
            return false;
        }
        Nave otraNave = (Nave) o;
        return nombre.equals(otraNave.nombre) && anioLanzamiento.equals(otraNave.anioLanzamiento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, anioLanzamiento);
    }

    @Override
    public String toString() {
        return "Nave{" + "nombre=" + nombre + ", capacidadTripulacion=" + capacidadTripulacion + ", anioLanzamiento=" + anioLanzamiento + '}';
    }
    
    
}
