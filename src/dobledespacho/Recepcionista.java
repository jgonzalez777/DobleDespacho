package dobledespacho;

public class Recepcionista implements VisitadorPersona{
    
    public void recibir(Persona persona){
        System.out.println("Estoy contento de que nos visite...");
        persona.aceptar(this);
    }

    @Override
    public void visitar(Mujer mujer) {
        System.out.println("Bienvenida Madame");
        System.out.println("Es un palcer atendera bella Dama");
    }

    @Override
    public void visitar(Hombre hombre) {
        System.out.println("Bienvenido my Lord");
        System.out.println("Es un palcer atendera apreciable caballero");
    }
    
    public void agradecerVisita(){
        System.out.println("Agradezco su visita apreciable persona.");
    }

    @Override
    public void visitar(Extraterreste extraterrestre) {
        System.out.println("Bienvenido mi navegante espacial");
        System.out.println("Es un palcer atenderle visitante de las estrellas");
    }
    
    
    
    
}
