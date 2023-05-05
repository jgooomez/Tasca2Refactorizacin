package Modulo3;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Divisible3Test {

    @Test
    void testCompruebaDivisiblePor3_2() {Divisible3 d1 = new Divisible3();
        boolean resultadoActual = d1.compruebaDivisiblePor3("2");
        boolean resultadoEsperado = true;
        assertNotEquals(resultadoEsperado, resultadoActual);
    }
    @Test
    void testCompruebaDivisiblePor3_6() {Divisible3 d1 = new Divisible3();
        boolean resultadoActual = d1.compruebaDivisiblePor3("6");
        boolean resultadoEsperado = true;
        assertEquals(resultadoEsperado, resultadoActual);
    }
    @Test
    void testCompruebaDivisiblePor3_4() {Divisible3 d1 = new Divisible3();
        boolean resultadoActual = d1.compruebaDivisiblePor3("4");
        boolean resultadoEsperado = true;
        assertNotEquals(resultadoEsperado, resultadoActual);
    }

}