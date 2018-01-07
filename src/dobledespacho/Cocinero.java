package dobledespacho;

public class Cocinero implements VisitadorPersona{

    @Override
    public void visitar(Mujer mujer) {
        System.out.println("Cocinar fresas con crema");
    }

    @Override
    public void visitar(Hombre hombre) {
        System.out.println("Cocinar carnitas");
    }

    @Override
    public void visitar(Extraterreste extraterrestre) {
        System.out.println("Cocinar cesos de chivo");
    }
    
    
    
}
