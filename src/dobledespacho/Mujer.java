package dobledespacho;

public class Mujer extends Persona{

    @Override
    public void aceptar(VisitadorPersona visitador) {
        visitador.visitar(this);
    }
    
    public void saludarBeso(){
        System.out.println("muakkk");
    }
}
