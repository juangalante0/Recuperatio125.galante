
package navesespaciales;

import java.util.ArrayList;
import java.util.List;


public class Agencia {
    
    private List<Nave> naves;
    
    public Agencia(){
        naves = new ArrayList<>();
    }
    
    public void agregarNave(Nave nave){
        if (nave != null){
            if (naves.contains(nave)){
                throw new NaveRepetidaException();
            }
            naves.add(nave);
        } else {
            throw new NullPointerException();
        }
    }
    
    public void mostrarNaves(){
        for (Nave nave : naves){
            System.out.println(nave);
        }
    }
    
    public void iniciarExploracion(){
       for(Nave nave : naves){
           if(nave instanceof Explorable explorable){
                explorable.explorar();
           } else {
           System.out.println("Los cruceros estelares no pueden iniciar una exploracion");}
       }
    }
}
