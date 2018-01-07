package dobledespacho;

public class Hombre extends Persona{

    @Override
    public void aceptar(VisitadorPersona visitador) {
        visitador.visitar(this);
    }
    
    public void saludarMano(){
        System.out.println("Strechhhhh");
    }  
}
