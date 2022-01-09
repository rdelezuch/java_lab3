import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 2 klasy */
        /* zad.1
            a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
            klasa ma się znajdować w osobnym pliku Student.java
            b) stworzyć 3 objekty klasy student i wstawić je do tablicy
            c) wyświetlić dane z tablicy, użyć pętli for lub forEach
            d) dane powinny być estetycznie przedstawione
         */

        Student[] studenci = new Student[3];

        Student student1 = new Student();

        student1.imie = "Robert";
        student1.nazwisko = "Deleżuch";
        student1.nrIndeksu = 56106;
        student1.aktywny = true;

        studenci[0] = student1;

        Student student2 = new Student();

        student2.imie = "Jan";
        student2.nazwisko = "Kowalski";
        student2.nrIndeksu = 49507;
        student2.aktywny = false;

        studenci[1] = student2;

        Student student3 = new Student();

        student3.imie = "Iga";
        student3.nazwisko = "Pajak";
        student3.nrIndeksu = 60234;
        student3.aktywny = true;

        studenci[2] = student3;

        for (Student el : studenci)
        {
            System.out.println("\nImię: " + el.imie);
            System.out.println("Nazwisko: " + el.nazwisko);
            System.out.println("Nr indeksu: " + el.nrIndeksu);
            System.out.println("Czy aktywny: " + el.aktywny);
        }
    }
}