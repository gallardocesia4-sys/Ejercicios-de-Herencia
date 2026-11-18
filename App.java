import HerenciaRoldan.Usuario;

public class App{
    public static void main(String[] args) {
        
        Usuario usuario= new Usuario("Jamaica Fernandez", 25, "Femenino", "ChuvacaLaVaca@gmail.com"," Bolillo123");

        usuario.saludar();
        usuario.informacionUsuario();
        
    }
}