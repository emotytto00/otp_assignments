package laskin;

public class Main {

    public static void main(String[] args) {
        Laskin laskin = new Laskin();

        laskin.virtaON();
        System.out.println("...Virta päälle...");

        int tulos = laskin.lisaa(500, 500);
        System.out.println("Lisää 500    = " + tulos);

        tulos = laskin.lisaa(200, 200);
        System.out.println("Lisää 200    = " + tulos);

        tulos = laskin.vahenna(100, 50);
        System.out.println("Vähennä 100  = " + tulos);

        tulos = laskin.jaa(40, 2);
        System.out.println("Jaa 2:lla    = " + tulos);

        tulos = laskin.kerro(10, 10);
        System.out.println("Kerro 10:llä = " + tulos);

        System.out.println("...Nollataan...");
        laskin.nollaa();

        tulos = laskin.lisaa(500, 0);
        System.out.println("Lisää 500    = " + tulos);

        laskin.virtaOFF();
        System.out.println("...Katkaistaan virta...");
    }
}
