package comunicacion;

public class Tesis extends Escrito {

    private String idea;
    private static String[] argumentos;
    private String conclusion;
    private String referencias;
    private String interpretacion;

    // Constructor
    public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, 
                 String conclusion, String referencias, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.idea = idea;
        Tesis.argumentos = argumentos;
        this.conclusion = conclusion;
        this.referencias = referencias;
        this.interpretacion = interpretacion;
    }

    // Implementación de palabrasTotales con factor = 5
    @Override
    public int palabrasTotales(int palabrasPagina) {
        return getPaginas() * palabrasPagina * 5;
    }

    // Método interpretacion
    @Override
    public String interpretacion() {
        return this.interpretacion;
    }

    // Método toString
    @Override
    public String toString() {
        return this.getOrigen() + "\n" +
               this.getTitulo() + "\n" +
               this.getAutor() + "\n" +
               this.getPaginas() + "\n" +
               this.idea + "\n" +
               Tesis.argumentos.length + "\n" +
               this.conclusion + "\n" +
               this.referencias;
    }

    // Getters y Setters
    public String getIdea() {
        return idea;
    }

    public void setIdea(String idea) {
        this.idea = idea;
    }

    public String[] getArgumentos() {
        return Tesis.argumentos;
    }

    public void setArgumentos(String[] argumentos) {
        Tesis.argumentos = argumentos;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public String getReferencias() {
        return referencias;
    }

    public void setReferencias(String referencias) {
        this.referencias = referencias;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }
}
