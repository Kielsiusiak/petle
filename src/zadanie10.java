import java.util.Scanner;

public class zadanie10 {
         public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);

           int userInput;
           int maximum = Integer.MIN_VALUE;
             int minimum = Integer.MAX_VALUE;

           System.out.println("Wprowadzaj liczby całkowite. Wpisz -99, aby zakończyć.");

           for (;;) {
            System.out.print("Podaj liczbę: ");
            userInput = scanner.nextInt();

            if (userInput == -99) {
                break;
            }

               if (userInput > maximum) {
                maximum = userInput;
            }

               if (userInput < minimum) {
                minimum = userInput;
            }
        }

              if (maximum == Integer.MIN_VALUE && minimum == Integer.MAX_VALUE) {
            System.out.println("Nie wprowadzono żadnych liczb.");
           } else {
            System.out.println("Największa wprowadzona liczba: " + maximum);
            System.out.println("Najmniejsza wprowadzona liczba: " + minimum);
            }

        scanner.close();
    }
}
