package HerenciaRoldan;

public class Usuario extends Persona{
    public String correo;
    public String contrasena;

    public Usuario(String nombre, int edad, String sexo, String correo, String contrasena){
        super(nombre,edad,sexo);
        this.correo= correo;
        this.contrasena=contrasena;

    }
    public void informacionUsuario(){
        System.out.println(" mi sexo es "+ sexo + " mi correo es "+ correo + " y mi contraseña es "+ contrasena);

    }

}
