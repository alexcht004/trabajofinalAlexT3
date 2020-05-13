package numero1;

public class Directivos extends Personas{
	int sueldo;
	String rendimiento ;
	String cargo;
    public void darSueldo(){
    	
    	sueldo = 3550;
    }
    public void darCargo(){
    	
    	cargo = " visepresidente ";
    }
    public void mostrarDatos(){
    	
    	System.out.println (""+sueldo);
    	System.out.println (""+cargo);
    }
    
}