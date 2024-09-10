package laskin;

public class Laskin {

    private int tulos;  	// Muuttuja tulokselle

    public void nollaa() {  // Nollaa tulosmuuttuja
        tulos = 0;
    }

    public int annaTulos() {
        return tulos;
    }

    public void lisaa(int n) {
        tulos = tulos + n;
    }

    public void vahenna(int n) {
        tulos = tulos - n;
    }


    public void kerro(int n) {
        tulos = tulos * n;
    }

    public void jaa(int n) {
        if (n == 0) {
            throw new ArithmeticException("Nollalla ei voi jakaa");
        }
        tulos = tulos / n;
    }


    public void nelio(int n) {
        tulos = n * n;
    }

    public void neliojuuri(int n) {
        if (n < 0) throw new IllegalArgumentException("Negatiivisesta luvusta ei voida ottaa neliöjuurta.");
        tulos = (int) Math.sqrt(n);  // Assuming the result should be an integer
    }

    public void virtaON() {
        // Tähän voisi laittaa alkutoimet
        tulos = 0;
    }

    public void virtaOFF() {
        // Tähän voisi laittaa lopputoimet
    }

}
