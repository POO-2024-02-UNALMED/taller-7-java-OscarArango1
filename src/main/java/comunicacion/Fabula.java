package comunicacion;

public class Fabula extends Escrito {

    private String ensenanzas;
    private String interpretacion;

    //Constructor
    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanzas, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.ensenanzas = ensenanzas;
        this.interpretacion = interpretacion;
    }

    //Métodos
    public int palabrasTotales(int par){
        return getPaginas() * par * 1;
    }
    public String interpretacion(){
        return this.interpretacion;
    }
    @Override
    public String toString() {
        return this.getOrigen() + "\n" +
               this.getTitulo() + "\n" +
               this.getAutor() + "\n" +
               this.getPaginas() + "\n" +
               this.ensenanzas;
    }
    //Gets y Sets
    public String getEnsenanzas() {
        return ensenanzas;
    }
    public void setEnsenanzas(String ensenanzas) {
        this.ensenanzas = ensenanzas;
    }
    public String getInterpretacion() {
        return interpretacion;
    }
    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }  
}