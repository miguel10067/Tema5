import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class BisiestoTest {
    @Test
        void testEsBisiesto() {
            assertAll(
                    () -> assertEquals(Bisiesto.esBisiesto(2024), true, "2024 es bisiesto"),
                    () -> assertFalse(Bisiesto.esBisiesto(1900), "1900 No es bisiesto"),
                    () -> assertTrue(Bisiesto.esBisiesto(2000), "2000 es bisiesto"),
                    () -> assertFalse(Bisiesto.esBisiesto(2023), "2023 No es bisiesto")
            );
        }
    }

