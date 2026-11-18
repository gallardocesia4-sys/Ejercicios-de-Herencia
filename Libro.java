package HerenciaLibro;

public class Libro {
    public String titulo;
    public String autor;
    public int anio;

    public Libro(String titulo, String autor, int anio ){
        this.titulo=titulo;
        this.autor=autor;
        this.anio=anio;

    }
    public void mostrarInfo(){
        System.out.println("El libro de llama " + titulo + "del año " + anio + " el autor es " + autor );
    }

}
