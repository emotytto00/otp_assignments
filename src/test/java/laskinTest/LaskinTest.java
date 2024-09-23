package laskinTest;

import laskin.Laskin;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/*
 * JUnit 5
 */
public class LaskinTest {

    private Laskin laskin;

    @BeforeEach
    public void clearCalculator() {
        laskin = new Laskin();
    }

    @Test
    public void testLisaa() {
        int tulos = laskin.lisaa(1, 2);
        assertEquals(3, tulos, "Lukujen 1 ja 2 summa väärin");
    }

    @Test
    public void testVahenna() {
        int tulos = laskin.vahenna(10, 2);
        assertEquals(8, tulos, "Lukujen 10 ja 2 erotus väärin");
    }

    @Test
    @DisplayName("Testaa jakolasku 8 / 2")
    public void testJaa() {
        int tulos = laskin.jaa(8, 2);
        assertEquals(4, tulos, "Jakolasku 8/2 väärin");
    }

    @Test
    @DisplayName("Testaa nollallajako")
    public void testJaaNollalla() {
        ArithmeticException poikkeus = assertThrows(ArithmeticException.class, () -> laskin.jaa(8, 0));
        assertEquals("Nollalla ei voi jakaa", poikkeus.getMessage());
    }

    @Test
    public void testKerro() {
        int tulos = laskin.kerro(5, 3);
        assertEquals(15, tulos, "Lukujen 5 ja 3 tulo väärin");
    }

    @Test
    public void testNelio() {
        int tulos = laskin.nelio(4);
        assertEquals(16, tulos, "Luvun 4 neliö väärin");
    }

    @Test
    public void testNeliojuuri() {
        int tulos = laskin.neliojuuri(16);
        assertEquals(4, tulos, "Luvun 16 neliöjuuri väärin");
    }

    @Test
    public void testNeliojuuriNegatiivinen() {
        IllegalArgumentException poikkeus = assertThrows(IllegalArgumentException.class, () -> laskin.neliojuuri(-1));
        assertEquals("Negatiivisesta luvusta ei voida ottaa neliöjuurta.", poikkeus.getMessage());
    }
}
