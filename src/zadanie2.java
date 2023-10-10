import java.util.Scanner;

public class zadanie2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nadaj prędkość pojazdu (w km/h): ");
        int predkosc = scanner.nextInt();

        System.out.print("Nadaj czas podróży (w godzinach): ");
        int czas = scanner.nextInt();

        scanner.close();

        if (predkosc <= 0 || czas < 1) {
            System.out.println("Nadane dane są niepoprawne. Prędkość musi być większa od 0, a czas podróży musi być co najmniej 1.");
        } else {
            System.out.println("Godzina Przebyta odległość");
            System.out.println("-----------");

            int odleglosc = 0;
            for (int godzina = 1; godzina <= czas; godzina++) {
                odleglosc += predkosc;
                System.out.println(godzina + " " + odleglosc);
            }
        }
    }
}
