package laskinTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import laskin.Laskin;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ExtraTest {

    private static Laskin laskin = new Laskin();

    @BeforeAll
    public static void testVirtaON() {
        System.out.println("@BeforeAll Virta ON (ennen ensimmäistä testiä)");
        laskin.virtaON();
    }

    @AfterAll
    public static void testVirtaOFF() {
        System.out.println("@AfterAll Virta OFF (kaikki testit ajettu).");
        laskin.virtaOFF();
        laskin = null;
    }

    @BeforeEach
    public void testNollaa() {
        System.out.println("  Nollaa laskin.");
        laskin.nollaa();
        // Koska laskin ei enää säilytä tilaa, nollauksen tarkastusta ei tarvita
    }

    @Test
    public void testNelio2() {
        int tulos = laskin.nelio(2);
        assertEquals(4, tulos, "Luvun 2 Neliöön korotus väärin");
    }

    @Test
    public void testNelio4() {
        int tulos = laskin.nelio(4);
        assertEquals(16, tulos, "Luvun 4 neliöön korotus väärin");
    }

    @Test
    public void testNelio5() {
        int tulos = laskin.nelio(5);
        assertEquals(25, tulos, "Luvun 5 neliöön korotus väärin");
    }

    @Test
    public void testNeliojuuri2() {
        int tulos = laskin.neliojuuri(2);
        assertEquals((int) Math.sqrt(2), tulos, "Neliöjuuri 2 ei toimi oikein");
    }

    @Test
    @DisplayName("Testaa negatiivinen neliöjuuri")
    public void testNeliojuuriNegat() {
        IllegalArgumentException poikkeus = assertThrows(IllegalArgumentException.class, () -> laskin.neliojuuri(-1));
        assertEquals("Negatiivisesta luvusta ei voida ottaa neliöjuurta.", poikkeus.getMessage());
    }
}
