import java.util.Scanner;

 public class zadanie5 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         System.out.print("Proszę podać łańcuch tekstu: ");
         String tekst = scanner.nextLine();

         System.out.print("Proszę podać znak, którego wystąpienia chcesz zliczyć: ");
         char znak = scanner.next().charAt(0);

         scanner.close();

         int liczbaWystapien = zliczZnak(tekst, znak);

         System.out.println("liczba znakow '" + znak + "' w tekście: " + liczbaWystapien);
     }

     public static int zliczZnak(String tekst, char znak) {
         int licznik = 0;

         for (int i = 0; i < tekst.length(); i++) {
             if (tekst.charAt(i) == znak) {
                 licznik++;
             }
         }

         return licznik;
     }
 }
