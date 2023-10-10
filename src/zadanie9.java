import java.util.Scanner;

public class zadanie9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int poczatkowaLiczba;
        double sredniPrzyrostProcent;
        int liczbaDniRozmnazania;

        do {
            System.out.print("Podaj początkową liczbę organizmów (co najmniej 2): ");
            poczatkowaLiczba = scanner.nextInt();

            if (poczatkowaLiczba < 2) {
                System.out.println("Niepoprawna początkowa liczba organizmów. Musi być co najmniej 2.");
            }
        } while (poczatkowaLiczba < 2);

        do {
            System.out.print("Podaj średni dzienny przyrost populacji (w procentach, większy lub równy 0): ");
            sredniPrzyrostProcent = scanner.nextDouble();

            if (sredniPrzyrostProcent < 0) {
                System.out.println("Niepoprawny średni dzienny przyrost populacji. Musi być większy lub równy 0.");
            }
        } while (sredniPrzyrostProcent < 0);

        do {
            System.out.print("Podaj liczbę dni rozmnażania (co najmniej 1): ");
            liczbaDniRozmnazania = scanner.nextInt();

            if (liczbaDniRozmnazania < 1) {
                System.out.println("Niepoprawna liczba dni rozmnażania. Musi być co najmniej 1.");
            }
        } while (liczbaDniRozmnazania < 1);

        double populacja = poczatkowaLiczba;

        for (int dzien = 1; dzien <= liczbaDniRozmnazania; dzien++) {
            System.out.println("Dzień " + dzien + ": " + (int) populacja + " organizmów");
            populacja += populacja * (sredniPrzyrostProcent / 100);
        }

        scanner.close();
    }
}
