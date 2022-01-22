public class Pozycja {

    protected String tytul;
    protected int nrporzadkowy, stan;

    public Pozycja() {
        this.tytul = "";
        this.nrporzadkowy = 0;
        this.stan = 0;
    }

    public Pozycja(String tytul, int nrporzadkowy, int stan) {
        this.tytul = tytul;
        this.nrporzadkowy = nrporzadkowy;
        this.stan = stan;
    }

    protected void wypozycz()
    {
        if (stan == 0)
        {
            System.out.println("Brak pozycji na stanie");
        }
        else
        {
            this.stan = this.stan - 1;
        }
    }

    protected void wypozycz(int x)
    {
        if (stan == 0)
        {
            System.out.println("Brak pozycji na stanie");
        }
        else
        {
            if (this.stan-x <= 0)
            {
                System.out.println("Nie można wypożyczyć takiej ilości");
            }
            else
            {
                this.stan = this.stan - x;
            }
        }
    }

    protected int stan()
    {
        return  this.stan;
    }

    @Override
    public String toString() {
        return "Nr porządkowy: " + nrporzadkowy +
                "\nStan: " + stan +
                "\nTytuł: " + tytul;
    }
}
