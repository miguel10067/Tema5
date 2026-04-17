public class Jugar {
        public static String jugar(String jugador1, String jugador2) {
            String j1 = (jugador1 != null) ? jugador1.toUpperCase() : "";
            String j2 = (jugador2 != null) ? jugador2.toUpperCase() : "";
            if (!esValida(j1) || !esValida(j2)) {
                throw new IllegalArgumentException("Jugada no válida");
            }
            if (j1.equals(j2)) {
                return "EMPATE";
            }

            if ((j1.equals("PIEDRA") && j2.equals("TIJERA")) ||
                    (j1.equals("TIJERA") && j2.equals("PAPEL")) ||
                    (j1.equals("PAPEL") && j2.equals("PIEDRA"))) {
                return "GANADOR JUGADOR 1";
            } else {
                return "GANADOR JUGADOR 2";
            }
        }

        private static boolean esValida(String jugada) {
            return jugada.equals("PIEDRA") || jugada.equals("PAPEL") || jugada.equals("TIJERA");
        }
    }

