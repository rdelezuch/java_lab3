import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 3 klasy */

        /*  zad.1 - Najpierw należy uzupełnić kod w klasie Punkt.java,
            a) stworzyć objekt punktA typu Punkt,
            w konstruktorze zainicjować zmienną pX --> np. new Punkt(7), wykonać metodę punktA.toString();
            b) następnie ponownie wywopać konstruktor inicjalizujący wszystkie pola z klasy
            --> np. punkt = new Punkt(1, 2, 3);, wykonać metodę punktA.toString();
            c) nadpisać wartości pól z objektu punktA za pomocą setterów i
            ponownie wywołać metodę toString();
            d) wypisać wartości pól (za pomocą getterów),
            e) wywołać metody suma i róznica (obie wersje) z klasy punkt
        */

        Punkt p1 = new Punkt(7);
        System.out.println(p1.toString());

        Punkt p2 = new Punkt(1, 2,3);
        System.out.println(p2.toString());

        p2.setpX(4);
        p2.setpY(5);
        p2.setpZ(6);

        System.out.println(p2.toString());

        System.out.printf("x = %d, y = %d, z = %d\n", p2.getpX(), p2.getpY(), p2.getpZ());

        System.out.printf("Suma: %d\n", p2.suma());
        System.out.printf("Różnica 1: %d\n", p2.roznica());
        System.out.printf("Różnica 2: %d\n", p2.roznica(1,2,3));
    }
}
