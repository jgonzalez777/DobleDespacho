package dobledespacho;

public class Camarero implements VisitadorPersona{

    public void servir(Persona persona){
        System.out.println("Sean bienvenidos, en seguida tomaré su órden");
        persona.aceptar(this);
    }

    @Override
    public void visitar(Mujer mujer) {
        System.out.println("Le ofrezco un postre Madame");
        System.out.println("Aquí tiene una rosa bella dama");
        mujer.saludarBeso();
    }

    @Override
    public void visitar(Hombre hombre) {
        System.out.println("Leo ofrezco un chmpagne my lord");
        System.out.println("Aqui tiene un puro, mi estimado señor");
    }   
    
    public void recoger(){
        System.out.println("Con su permiso, levantaré la Mesa");
    }

    @Override
    public void visitar(Extraterreste extraterrestre) {
        System.out.println("Le ofrezco un salamie interestelar");
        System.out.println("Aqui tiene un canguro para su tercer boca");
    }
}
