package laskinTest;

import laskin.Laskin;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

// Tässä käytetään ParameterizedTest -annotaatiota
// Parametriparit taulukossa (comma separated values)

public class NelioTest {

	private Laskin laskin = new Laskin();

	@ParameterizedTest(name = "Luvun {0} neliö on {1}")
	@CsvSource({ "0, 0", "1, 1", "2, 4", "4, 16", "5, 25", "6, 36" })
	public void testNelio(int luku, int odotettuTulos) {
		int tulos = laskin.nelio(luku);  // Käytetään metodin palauttamaa tulosta suoraan
		assertEquals(odotettuTulos, tulos, "Neliöön korotus ei nyt kyllä skulaa");
	}
}
