
    import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    class PasswordTest {

        @Test
        void testPocosNumeros() {
            assertEquals(1, Validador.evaluarPassword("111"));
        }

        @Test
        void testLetras() {
            assertEquals(2, Validador.evaluarPassword("miguel"));
        }

        @Test
        void testLetrasYNumeros() {
            assertEquals(4, Validador.evaluarPassword("Miguel1234"));
        }

        @Test
        void testConTodosLosCriterios() {
            assertEquals(5, Validador.evaluarPassword("P@rg7ds13"));
        }

        @Test
        void testCasoNulo() {
            assertEquals(0, Validador.evaluarPassword(null));
        }
    }




