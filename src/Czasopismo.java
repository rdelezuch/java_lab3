public class Czasopismo extends Pozycja{

    protected int nrWydania;

    public Czasopismo() {
        super();
        this.nrWydania = 0;
    }

    public Czasopismo(int nrWydania) {
        this.nrWydania = nrWydania;
    }

    public Czasopismo(String tytul, int nrporzadkowy, int stan, int nrWydania) {
        super(tytul, nrporzadkowy, stan);
        this.nrWydania = nrWydania;
    }

    @Override
    public String toString() {
        return "Czasopismo\n" +
                super.toString() +
                "\nNr wydania: " + nrWydania;
    }
}
