import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestCalificacion {
    @ParameterizedTest
    @ValueSource(ints = {0, 2, 4})
    void testSuspensos(int nota) {
        assertEquals("SUSPENSO", Calificacion.calificacion(nota));
    }
    @Test
    void testNotasNoValidas() {
        assertThrows(IllegalArgumentException.class, () -> Calificacion.calificacion(-1));
        assertThrows(IllegalArgumentException.class, () -> Calificacion.calificacion(11));
    }
    @Test
    void testNotas() {
        assertAll(
                () -> assertEquals("SUFICIENTE", Calificacion.calificacion(5)),
                () -> assertEquals("BIEN", Calificacion.calificacion(6)),
                () -> assertEquals("NOTABLE", Calificacion.calificacion(7)),
                () -> assertEquals("SOBRESALIENTE", Calificacion.calificacion(10))
        );
    }
}
