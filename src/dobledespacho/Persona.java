package dobledespacho;

public abstract class Persona {
    
    public void saludar(){
        System.out.println("Hola a todos soy una persona que viene a merendar");
    }
    
    public abstract void aceptar(VisitadorPersona visitador);
    
    public void despedirse(){
        System.out.println("Hasta pronto ha sido un placer merendar en este Restaurante tan apropiado");
    }    
    
    public void pedir(){
        System.out.println("Deseo ordenar!!!");
    }
}
