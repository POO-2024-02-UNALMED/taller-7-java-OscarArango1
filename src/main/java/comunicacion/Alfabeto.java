package comunicacion;

public class Alfabeto extends Pictograma {

    private static String[] letras;
    private String interpretacion;

    // Constructor
    public Alfabeto(String origen, String[] letras, String interpretacion) {
        super(origen);
        Alfabeto.letras = letras;
        this.interpretacion = interpretacion;
    }

    // Método interpretacion
    @Override
    public String interpretacion() {
        return this.interpretacion;
    }

    // Método toString para retornar el alfabeto separando por comas
    @Override
    public String toString() {
        StringBuilder mensaje = new StringBuilder();
        for (int i = 0; i < Alfabeto.letras.length; i++) {
            mensaje.append(Alfabeto.letras[i]);
            if (i != Alfabeto.letras.length - 1) {
                mensaje.append(", ");
            }
        }
        return mensaje.toString();
    }

    // Método cantidadLetras
    public int cantidadLetras() {
        return Alfabeto.letras.length;
    }

    // Getters y Setters
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
