import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class zadanie3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj prędkość pojazdu (w km/h): ");
        int predkosc = scanner.nextInt();

        System.out.print("Podaj czas podróży (w godzinach): ");
        int czasPodrozy = scanner.nextInt();

        System.out.print("Podaj nazwę pliku do zapisu: ");
        String nazwaPliku = scanner.next();

        scanner.close();

        if (predkosc <= 0 || czasPodrozy < 1) {
            System.out.println("Podane dane są niepoprawne. Prędkość musi być większa od 0, a czas podróży musi być co najmniej 1.");
        } else {
            try (FileWriter writer = new FileWriter(nazwaPliku)) {
                writer.write("Czas Odległość\n");
                writer.write("------------\n");

                int odleglosc = 0;
                for (int godzina = 1; godzina <= czasPodrozy; godzina++) {
                    odleglosc += predkosc;
                    writer.write(godzina + " " + odleglosc + "\n");
                }

                System.out.println("Dane zostały zapisane do pliku '" + nazwaPliku + "'.");
            } catch (IOException e) {
                System.out.println("Wystąpił błąd podczas zapisu do pliku.");
                e.printStackTrace();
            }
        }
    }
}
