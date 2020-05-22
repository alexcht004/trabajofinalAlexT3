package numero1;
public class Personal extends Personas {
	int fechaInicio;
	int fechaSalida ;
	String contrato;
    public void cambiarFechaSalida(){
    	
    	fechaSalida = 2029;
    }
    public void darContrato(){
    	
    	contrato = " bueno ";
    }
    public void mostrarDatos(){
    	
    	System.out.println (""+fechaSalida);
    	System.out.println (""+contrato);
    }
    
}