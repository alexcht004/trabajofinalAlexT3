package numero1;

public class Registro extends Usuarios{
	int fechaInicio;
	int fechaSalida;
	int id;
    public void darFechaSalida(){
    	
    	fechaSalida = 2022;
    }
    public void darId(){
    	
    	id = 234872759;
    }
    public void mostrarDatos(){
    	
    	System.out.println (""+id);
    	System.out.println (""+fechaSalida);
    }
    
}