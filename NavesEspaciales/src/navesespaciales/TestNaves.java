
package navesespaciales;


public class TestNaves {

  
    public static void main(String[] args) {
        
        Agencia agencia = new Agencia();
        
        CruceroEstelar crucero1 = new CruceroEstelar(10, "Apollo50", 15, "1998");
        CruceroEstelar crucero2 = new CruceroEstelar(5, "Apollo51", 10, "2001");
        Carguero carguero1 = new Carguero(5, "Apollo52", 10, "2005");
        Carguero carguero2 = new Carguero(7, "Apollo53", 9, "2007");
        NaveExploracion nave1 = new NaveExploracion(TipoMision.INVESTIGACION, "Apollo54", 8, "2010");
        NaveExploracion nave2 = new NaveExploracion(TipoMision.CONTACTO, "Apollo55", 5, "2015");
        CruceroEstelar crucero3 = new CruceroEstelar(6, "Apollo50", 8, "1998");
        
        try{
            agencia.agregarNave(crucero1);
            agencia.agregarNave(crucero2);
            agencia.agregarNave(carguero1);
            agencia.agregarNave(carguero2);
            agencia.agregarNave(nave1);
            agencia.agregarNave(nave2);
            agencia.agregarNave(crucero3);
        }catch (NaveRepetidaException ex){
            System.out.println(ex.getMessage());
        }
        
        System.out.println("---------------------------");
        
        agencia.mostrarNaves();
        
        System.out.println("-----------------------------");
        
        agencia.iniciarExploracion();

    }
    
}
