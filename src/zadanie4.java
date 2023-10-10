import java.util.Scanner;

public class zadanie4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę dni pracy: ");
        int dniPracy = scanner.nextInt();

        scanner.close();

        if (dniPracy < 1) {
            System.out.println("Niepoprawna liczba dni. Musi być większa lub równa 1.");
        } else {
            double wyplata = obliczWyplate(dniPracy);

            System.out.println("Po " + dniPracy + " dniach pracy zarobisz: " + wyplata + " zł");
        }
    }

    public static double obliczWyplate(int dniPracy) {
        double wyplata = 0.01;

        for (int dzien = 2; dzien <= dniPracy; dzien++) {
            wyplata += wyplata;
        }

        return wyplata / 100;
    }
}
