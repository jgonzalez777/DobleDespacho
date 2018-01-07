package dobledespacho;

public class Extraterreste extends Persona{

    @Override
    public void aceptar(VisitadorPersona visitador) {
        visitador.visitar(this);
    }
    
    
    
}
