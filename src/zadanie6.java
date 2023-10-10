import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class zadanie6 {
       public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

             System.out.println("====================");
             System.out.println("   LICZNIK WYSTĄPIEŃ ZNAKU W PLIKU");
              System.out.println("================-=");

            System.out.print("Podaj nazwę pliku: ");
        String nazwaPliku = scanner.nextLine();

           System.out.print("Podaj znak, którego wystąpienia chcesz zliczyć: ");
            char znak = scanner.next().charAt(0);

            scanner.close();

            int liczbaWystapien = zliczWystapienia(nazwaPliku, znak);

              System.out.println("\nLiczba wystąpień znaku '" + znak + "' w pliku '" + nazwaPliku + "': " + liczbaWystapien);
    }

    public static int zliczWystapienia(String nazwaPliku, char znak) {
                int licznik = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(nazwaPliku))) {
                int znakCzytany;
            while ((znakCzytany = reader.read()) != -1) {
                   char znakZPliku = (char) znakCzytany;
                  if (znakZPliku == znak) {
                    licznik++;
                }
            }
        } catch (IOException e) {
               System.err.println("Wystąpił błąd podczas odczytu pliku.");
               e.printStackTrace();
        }

            return licznik;
    }
}
