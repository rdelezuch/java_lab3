import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /* ćw 5 Dziedziczenie */

        /* zad.1 Proszę wybrać dowolny temat budowania struktur klas np. samochody, dom, biblioteka, nauka, zabawki, kosmetyki, biuro podróży ... .
                 Będziemy budować podobną strukturę kodu jak w przykładzie 5,
            a) Proszę stworzyć układ klas dziedziczących po sobie,
            b) proszę użyć pól i metod protected jak i private,
            c) proszę stworzyć konstruktory, metody: toString(), settery i gettery,
            d) proszę używać super do wywołania konstruktorów i metod z klas nadrzędnych
            (można wygenerować je --> prawy przycisk myszki --> generate --> settery, gettery, ...),
            e) w klasie Main proszę stworzyć objekty podobnie jak w przykładzie 5,
            oraz stworzyć listę typu najbardziej generycznego np. List<Budynek>
         */

        Pozycja pozycja = new Pozycja();
        System.out.println(pozycja.toString());
        System.out.println("\nPróba wypożyczenia");
        pozycja.wypozycz();
        System.out.println("Stan: " + pozycja.stan() + "\n");

        Pozycja pozycja1 = new Pozycja("Nieznane historie", 1, 20);
        System.out.println(pozycja1.toString());
        System.out.println("\nPróba wypożyczenia");
        pozycja1.wypozycz();
        System.out.println("Stan: " + pozycja1.stan() + "\n");

        ksiazka ksiazka = new ksiazka("Fajna książka", 2, 10,"Michał Szpak");
        System.out.println(ksiazka.toString());
        System.out.println("\nPróba wypożyczenia");
        ksiazka.wypozycz(11);
        System.out.println("Stan: " + ksiazka.stan() + "\n");

        Czasopismo czasopismo = new Czasopismo("Komputer Świat", 3, 15, 12);
        System.out.println(czasopismo.toString());
        System.out.println("\nPróba wypożyczenia");
        czasopismo.wypozycz(14);
        System.out.println("Stan: " + czasopismo.stan() + "\n");

        List<Pozycja> listaPozycji = new ArrayList<>();
        listaPozycji.add(pozycja);
        listaPozycji.add(pozycja1);
        listaPozycji.add(ksiazka);
        listaPozycji.add(czasopismo);
        System.out.println("\n" + listaPozycji);
    }
}
