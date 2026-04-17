
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

    class PiedraPapelTijeraTest {

        @Test
        void testJugadasErroneas() {
            assertThrows(IllegalArgumentException.class, () -> Jugar.jugar("PIEDRA", "HOLA"));
        }
        @Test
        void testEmpate() {
            assertEquals("EMPATE", Jugar.jugar("PIEDRA", "PIEDRA"));
        }

        @Test
        void testVictoriasJugador1() {
            assertAll(
                    () -> assertEquals("GANA JUGADOR 1", Jugar.jugar("PIEDRA", "TIJERA")),
                    () -> assertEquals("GANA JUGADOR 1", Jugar.jugar("TIJERA", "PAPEL")),
                    () -> assertEquals("GANA JUGADOR 1", Jugar.jugar("PAPEL", "PIEDRA"))
            );
        }

        @Test
        void testVictoriaJugador2() {
            assertEquals("GANA JUGADOR 2", Jugar.jugar("TIJERA", "PIEDRA"));
        }
    }

