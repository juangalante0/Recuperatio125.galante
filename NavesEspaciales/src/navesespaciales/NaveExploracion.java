
package navesespaciales;


public class NaveExploracion extends Nave implements Explorable {
    
    private TipoMision tipoMision;

    public NaveExploracion(TipoMision tipoMision, String nombre, int capacidadTripulacion, String anioLanzamiento) {
        super(nombre, capacidadTripulacion, anioLanzamiento);
        this.tipoMision = tipoMision;
    }

    @Override
    public void explorar() {
        
        System.out.println("Nave de exploracion explorando");
    }

    @Override
    public String toString() {
        return super.toString() + "NaveExploracion{" + "tipoMision=" + tipoMision + '}';
    }
    
    
    
    
    
    
    
}
