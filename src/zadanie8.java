import java.util.Scanner;

     public class zadanie8 {
         public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);

               System.out.print("Podaj liczbę lat: ");
           int liczbaLat = scanner.nextInt();

           if (liczbaLat <= 0) {
                System.out.println("Podana liczba lat jest niepoprawna. Musi być większa od 0.");
                return;
          }

             double sumaOpadow = 0;

           for (int rok = 1; rok <= liczbaLat; rok++) {
                System.out.println("Rok " + rok + ":");

                double sumaOpadowWRoku = 0;

                 for (int miesiac = 1; miesiac <= 12; miesiac++) {
                    System.out.print("Podaj ilość opadów (cm) w miesiącu " + miesiac + ": ");
                   double opadyMiesiac = scanner.nextDouble();

                   if (opadyMiesiac < 0) {
                       System.out.println("Niepoprawna ilość opadów. Musi być nieujemna.");
                        return;
                   }

                    sumaOpadowWRoku += opadyMiesiac;
            }

                 sumaOpadow += sumaOpadowWRoku;
                double sredniPoziomOpadowWRoku = sumaOpadowWRoku / 12;
                System.out.println("Średni poziom opadów w roku " + rok + ": " + sredniPoziomOpadowWRoku + " cm\n");
              }


           double sredniPoziomOpadow = sumaOpadow / (liczbaLat * 12);
              System.out.println("Średni poziom opadów z okresu " + liczbaLat + " lat: " + sredniPoziomOpadow + " cm");

             scanner.close();
        }
}
