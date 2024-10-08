public class DiscoCompacto extends Publicacion{
    
    private double tiempoReproduccion;

    public DiscoCompacto(String titulo, double precio, double tiempoReproduccion) {
        super(titulo, precio);
        this.tiempoReproduccion = tiempoReproduccion;
    }

    public double getTiempoReproduccion() {
        return tiempoReproduccion;
    }

    public void setTiempoReproduccion(double tiempoReproduccion) {
        this.tiempoReproduccion = tiempoReproduccion;
    }

    @Override
    public String obtenerInfo() {
        return "Info del libro: " + this.getTitulo();
    }


    

}
