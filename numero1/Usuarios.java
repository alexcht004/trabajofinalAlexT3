package numero1;

public class Usuarios extends Personas {
	String apodo;
	int nivel ;
	String usuarioVip;
	
	
    public void darApodo(){
    	
    	apodo = "king";
    }
    public void canbiarNivel(){
    	
    	nivel = 4;
    }
    public void mostrarDatos(){
    	
    	System.out.println (""+nivel);
    	System.out.println (""+apodo);
    }
}