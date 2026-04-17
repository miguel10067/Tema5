public class Validador {
    public static int evaluarPassword(String password) {
        if (password == null) return 0;

        int puntos = 0;

        if (password.length() >= 8) puntos++;
        if (password.matches(".*[A-Z].*")) puntos++;
        if (password.matches(".*[a-z].*")) puntos++;
        if (password.matches(".*[0-9].*")) puntos++;
        if (password.matches(".*[^a-zA-Z0-9].*")) puntos++;

        return puntos;
    }
    public static String obtenerCategoria(int puntos) {
        if (puntos <= 2) return "DEBIL";
        if (puntos <= 4) return "MEDIA";
        return "FUERTE";
    }
}
