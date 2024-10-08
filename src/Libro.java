public class Libro extends Publicacion {
    
    private int numeroPaginas;

    public Libro(String titulo, double precio, int numeroPaginas) {
        super(titulo, precio);
        this.numeroPaginas = numeroPaginas;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String obtenerInfo() {
        return "Info del libro: " + this.getTitulo();
    }

    


}
