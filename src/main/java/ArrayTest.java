import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayTest {
    @Test
    void testArrayVacio() {
        int[] datos = {};
        assertEquals(0, ArrayUtils.contarPositivos(datos), "Un array vacío debe devolver 0");
    }

    @Test
    void testArrayNegativo() {
        int[] datos = {-1, -10, -5};
        assertEquals(0, ArrayUtils.contarPositivos(datos), "Si todos son negativos el resultado es 0");
    }

    @Test
    void testArrayMixto() {

        int[] datos = {1, -2, 0, 5, -10, 10};
        assertEquals(3, ArrayUtils.contarPositivos(datos), "Tiene que contar 3 positivos (1, 5, 10)");
    }
}
