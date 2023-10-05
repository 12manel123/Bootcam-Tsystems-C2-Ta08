import java.util.Random;

public class Password {
    private int longitud;
    private String contraseña;

    public Password() {
        this.longitud = 8;
        this.contraseña = generarContraseñaAleatoria(longitud);
    }

    public Password(int longitud) {
        this.longitud = longitud;
        this.contraseña = generarContraseñaAleatoria(longitud);
    }

    private String generarContraseñaAleatoria(int longitud) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder contraseñaAleatoria = new StringBuilder();
        Random rand = new Random();

        for (int i = 0; i < longitud; i++) {
            int index = rand.nextInt(caracteres.length());
            contraseñaAleatoria.append(caracteres.charAt(index));
        }

        return contraseñaAleatoria.toString();
    }
    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
        this.contraseña = generarContraseñaAleatoria(longitud);
    }

    public String getContraseña() {
        return contraseña;
    }
}
