package dobledespacho;

public interface VisitadorPersona {
    
    void visitar(Mujer mujer);
    
    void visitar(Hombre hombre);
    
    void visitar(Extraterreste extraterrestre);
    
}
