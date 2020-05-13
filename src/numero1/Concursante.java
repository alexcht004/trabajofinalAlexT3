package numero1;

public class Concursante extends Personas {
	String apodo;
	int nivel ;
	int puntos;
    public void darApodo(){
    	
    	apodo = "king";
    }
    public void darPuntos(){
    	
    	puntos = 35;
    }
    public void mostrarDatos(){
    	
    	System.out.println (""+puntos);
    	System.out.println (""+apodo);
    }
    
}