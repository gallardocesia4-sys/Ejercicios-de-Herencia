package HerenciaLibro;

public class LibroDigital extends Libro{
    public String formato;
    public double tamanioMB;

    public LibroDigital(String titulo, String autor,int anio, String formato, double tamanioMB){
        super(titulo,autor, anio);
        this.formato= formato;
        this.tamanioMB=tamanioMB;

    }
    public void mostrarInfomacion(){
        System.out.println("El libro tiene un formato " + formato + " tiene un tamaño " + tamanioMB);
    }

}
