import java.util.Scanner;

public class zadanie7 {
             public static void main(String[] args) {
               Scanner scanner = new Scanner(System.in);

                 System.out.print("Podaj liczbę pięter w hotelu: ");
            int liczbaPieter = scanner.nextInt();

           if (liczbaPieter < 1) {
                System.out.println("Niepoprawna liczba pięter. Musi być co najmniej 1.");
               return;
        }

        int lacznaLiczbaPokoi = 0;
                  int lacznaLiczbaZajetychPokoi = 0;

               int pietro = 1;
               while (pietro <= liczbaPieter) {
            System.out.print("Podaj liczbę pokoi na piętrze " + pietro + ": ");
               int liczbaPokoi = scanner.nextInt();

            if (liczbaPokoi < 10) {
                  System.out.println("Niepoprawna liczba pokoi na piętrze. Musi być co najmniej 10.");
                return;
               }

            System.out.print("Podaj liczbę zajętych pokoi na piętrze " + pietro + ": ");
                   int liczbaZajetychPokoi = scanner.nextInt();

               lacznaLiczbaPokoi += liczbaPokoi;
                    lacznaLiczbaZajetychPokoi += liczbaZajetychPokoi;

            pietro++;
        }

        double poziomOblozenia = (double) lacznaLiczbaZajetychPokoi / lacznaLiczbaPokoi;

                 System.out.println("Łączna liczba pokoi w hotelu: " + lacznaLiczbaPokoi);
                System.out.println("Liczba zajętych pokoi: " + lacznaLiczbaZajetychPokoi);
            System.out.println("Liczba wolnych pokoi: " + (lacznaLiczbaPokoi - lacznaLiczbaZajetychPokoi));
           System.out.println("Poziom obłożenia hotelu: " + (poziomOblozenia * 100) + "%");

        scanner.close();
    }
}
