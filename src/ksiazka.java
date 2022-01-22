public class ksiazka extends Pozycja {

    protected String autor;

    public ksiazka() {
        super();
        this.autor = "Nieznany";
    }

    public ksiazka(String autor) {
        this.autor = autor;
    }

    public ksiazka(String tytul, int nrporzadkowy, int stan, String autor) {
        super(tytul, nrporzadkowy, stan);
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Książka\n" +
                super.toString() +
                "\nAutor: " + autor;
    }
}
