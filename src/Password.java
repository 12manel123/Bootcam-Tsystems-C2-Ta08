import java.util.Random;

public class Password {
    private int longitud;
    private String contrase�a;

    public Password() {
        this.longitud = 8;
        this.contrase�a = generarContrase�aAleatoria(longitud);
    }

    public Password(int longitud) {
        this.longitud = longitud;
        this.contrase�a = generarContrase�aAleatoria(longitud);
    }

    private String generarContrase�aAleatoria(int longitud) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder contrase�aAleatoria = new StringBuilder();
        Random rand = new Random();

        for (int i = 0; i < longitud; i++) {
            int index = rand.nextInt(caracteres.length());
            contrase�aAleatoria.append(caracteres.charAt(index));
        }

        return contrase�aAleatoria.toString();
    }
    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
        this.contrase�a = generarContrase�aAleatoria(longitud);
    }

    public String getContrase�a() {
        return contrase�a;
    }
}
