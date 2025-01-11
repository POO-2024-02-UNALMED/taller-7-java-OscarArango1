package comunicacion;

public class Alfabeto extends Pictograma {

    private static String[] letras;
    private String interpretacion;

    //Constructor
    public Alfabeto(String origen, String[] letras, String interpretacion) {
        super(origen);
        Alfabeto.letras = letras;
        this.interpretacion = interpretacion;
    }

    //Métodos
    public int cantidadLetras(){
        return Alfabeto.letras.length;
    }
    public String interpretacion(){
        return this.interpretacion;
    }
    @Override
    public String toString(){
        return "A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z";
    }

    //Gets y Sets
    public String[] getLetras() {
        return letras;
    }
    public void setLetras(String[] letras) {
        Alfabeto.letras = letras;
    }
    public String getInterpretacion() {
        return interpretacion;
    }
    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }    
}