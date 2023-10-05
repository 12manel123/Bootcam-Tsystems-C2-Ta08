public class Electrodomestico {
    protected final static String COLOR_DEFAULT = "blanco";
    protected final static char CONSUMO_ENERGETICO_DEFAULT = 'F';
    protected final static double PRECIO_BASE_DEFAULT = 100;
    protected final static double PESO_DEFAULT = 5;

    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private double peso;

    public Electrodomestico() {
        this(PRECIO_BASE_DEFAULT, COLOR_DEFAULT, CONSUMO_ENERGETICO_DEFAULT, PESO_DEFAULT);
    }

    public Electrodomestico(double precioBase, double peso) {
        this(precioBase, COLOR_DEFAULT, CONSUMO_ENERGETICO_DEFAULT, peso);
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        setColor(color);
        setConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        String colorLower = color.toLowerCase();
        if (colorLower.equals("blanco") || colorLower.equals("negro") || colorLower.equals("rojo")
                || colorLower.equals("azul") || colorLower.equals("gris")) {
            this.color = colorLower;
        } else {
            this.color = COLOR_DEFAULT;
        }
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        if (consumoEnergetico >= 'A' && consumoEnergetico <= 'F') {
            this.consumoEnergetico = consumoEnergetico;
        } else {
            this.consumoEnergetico = CONSUMO_ENERGETICO_DEFAULT;
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
