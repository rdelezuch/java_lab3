import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /* ćw 4 klasy */

        /* zad.1
            a) Stworzyć klasę Osoba z polami prywatnymi:
            - imie (String),
            - nazwisko (String),
            - indeks (Integer)

            b) stworzyc konstruktory, gettery i settery
            c) napisać metodę w klasie Osoba która zwróci informację o osobie,
         */

        /* zad.2
            a) Stworzyć klasę Student z polami prywatnymi
            - Osoba osoba,
            - WydzialEnum wydzial;
            b) stworzyć enum WydzialEnum (w nowym pliku) z kilkoma polami,
            c) stworzyc konstruktory, gettery i settery
            d) nadpisać metodę toString aby zwracała wszystkie elementy ładnie przedstawione :)
         */

        /* zad.3
            a) W klasie Main stworzyć 5 różnych studentów, (można za pomocą tego samego objektu)
            b) dodać studentów do Listy ArrayList,
            c) przeiterować listę za pomocą pętli forEach wywołując na każdym objekcie metodę toString() (w każdej iteracji);
         */

        List<Student> studenci = new ArrayList<>();

        studenci.add(new Student(new Osoba("Jan", "Kowalski", 12345), WydzialEnum.ETI));
        studenci.add(new Student(new Osoba("Artur", "Nowak", 54321), WydzialEnum.OIO));
        studenci.add(new Student(new Osoba("Joanna", "Abba", 56789), WydzialEnum.WiLIŚ));
        studenci.add(new Student(new Osoba("Janusz", "Tracz", 98765), WydzialEnum.WiLIŚ));
        studenci.add(new Student(new Osoba("Małgorzata", "Dębska", 10293), WydzialEnum.ETI));

        for (Student student: studenci)
        {
            System.out.println(student.toString() + "\n");
        }

    }
}
