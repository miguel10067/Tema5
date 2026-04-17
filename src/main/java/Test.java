import static org.junit.jupiter.api.Assertions.*;

import com.MiguelCampos.tema4gradle.Edad;
import org.junit.jupiter.api.Test;

class EdadUtilsTest {

    @Test
    void testEdadNegativa() {
        assertThrows(IllegalArgumentException.class, () -> {
            Edad.clasificarEdad(-1);
        });
    }

    @Test
    void testCategoriasPrincipales() {

        assertEquals("Infancia", Edad.clasificarEdad(2));
        assertEquals("Niñez", Edad.clasificarEdad(9));
        assertEquals("Adolescencia", Edad.clasificarEdad(16));
        assertEquals("Juventud", Edad.clasificarEdad(20));
        assertEquals("Adultez", Edad.clasificarEdad(40));
        assertEquals("Vejez", Edad.clasificarEdad(70));
    }

    @Test
    void testCasosLimite() {

        assertEquals("Infancia", Edad.clasificarEdad(0));
        assertEquals("Adultez", Edad.clasificarEdad(59));
    }
}
