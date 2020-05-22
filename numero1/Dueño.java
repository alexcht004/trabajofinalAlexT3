package numero1;

public class Dueño extends Personas {
	int fechaInicio;
	int fechaSalida ;
	String apodo;
    public void cambiarFechaSalida(){
    	
    	fechaSalida = 2029;
    }
    public void darApodo(){
    	
    	apodo = " bueno ";
    }
    public void mostrarDatos(){
    	
    	System.out.println (""+fechaSalida);
    	System.out.println (""+apodo);
    }
}