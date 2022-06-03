package danieljuarez_lab7p2;

public class Cancion {
    
    public String TituloCancion;
    public Double Duracion;
    public Album Referencia;

    public Cancion() {
    }
    
    public Cancion(String TituloCancion, Double Duracion, Album Referencia) {
        this.TituloCancion = TituloCancion;
        this.Duracion = Duracion;
        this.Referencia = Referencia;
    }

    public String getTituloCancion() {
        return TituloCancion;
    }

    public void setTituloCancion(String TituloCancion) {
        this.TituloCancion = TituloCancion;
    }

    public Double getDuracion() {
        return Duracion;
    }

    public void setDuracion(Double Duracion) {
        this.Duracion = Duracion;
    }

    public Album getReferencia() {
        return Referencia;
    }

    public void setReferencia(Album Referencia) {
        this.Referencia = Referencia;
    }

    @Override
    public String toString() {
        return "Cancion: " + TituloCancion;
    }
    
}
