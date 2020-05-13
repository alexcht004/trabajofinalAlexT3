package numero1;

public class UsuarioVip extends Usuarios{
	int fechaInicio;
	int fechaSalida ;
	String categoria;
    public void darFechaSalida(){
    	
    	fechaSalida = 2029;
    }
    public void cambiarCategoria(){
    	
    	categoria = " bueno ";
    }
    public void mostrarDatos(){
    	
    	System.out.println (""+fechaSalida);
    	System.out.println (""+categoria);
    }
}