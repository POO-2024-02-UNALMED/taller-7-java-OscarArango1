package comunicacion;

public class Tesis extends Escrito {

    private String idea;
    private static String[] argumentos;
    private String conclusion;
    private String referencias;
    private String interpretacion;

    //Constructor
    public Tesis(String origen, String titulo, String autor, int paginas, String idea, String conclusion,
            String referencias, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.idea = idea;
        this.conclusion = conclusion;
        this.referencias = referencias;
        this.interpretacion = interpretacion;
    }

    //Métodos
    public int palabrasTotales(int par){
        return getPaginas() * par * 5;
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
                this.idea + "\n" +
                argumentos.length + "\n" +
                this.conclusion + "\n" +
                this.referencias;
}
 
    //Gets y Sets
    public String getIdea() {
        return idea;
    }
    public void setIdea(String idea) {
        this.idea = idea;
    }
    public String[] getArgumentos() {
        return argumentos;
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