package numero1;

public class main {
    public static void main(String[] args) {
        //OBJETO
        Concursante concursante = new Concursante();
        
        
        
        
        Datos datos = new Datos();
        Directivos directivos = new Directivos();
        Dueño dueño = new Dueño();

        Personal personal = new Personal();
        Personas personas = new Personas();
        Usuarios usuarios = new Usuarios();
        Registro registro = new Registro();

        //OBJETO EQUIPACIONES
        UsuarioVip usuarioVip = new UsuarioVip();
        
       

      
        //MOSTRAR METODOS
        usuarioVip.darFechaSalida();
        usuarioVip.cambiarCategoria();
        usuarioVip.mostrarDatos();

    }
}