package numero1;

public class Datos {
	String nombre;
	int ip ;
	String direccion;
    public void darIp(){
    	
    	ip = 24943937;
    }
    public void darDireccion(){
    	
    	direccion = " España ";
    }
    public void mostrarDatos(){
    	
    	System.out.println (""+direccion);
    	System.out.println (""+ip);
    }
    
}