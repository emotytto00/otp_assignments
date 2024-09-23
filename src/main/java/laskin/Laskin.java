package laskin;

public class Laskin {

    public void nollaa() {
    }

    public int lisaa(int a, int b) {
        return a + b;
    }

    public int vahenna(int a, int b) {
        return a - b;
    }

    public int kerro(int a, int b) {
        return a * b;
    }

    public int jaa(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Nollalla ei voi jakaa");
        }
        return a / b;
    }

    public int nelio(int n) {
        return n * n;
    }

    public int neliojuuri(int n) {
        if (n < 0) throw new IllegalArgumentException("Negatiivisesta luvusta ei voida ottaa neliöjuurta.");
        return (int) Math.sqrt(n);
    }

    public void virtaON() {
    }

    public void virtaOFF() {
    }
}
