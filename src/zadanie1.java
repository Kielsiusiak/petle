import java.util.Scanner;

public class zadanie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą: ");

        int liczba = scanner.nextInt();
        scanner.close();

        if (liczba <= 0) {
            System.out.println("Podana liczba jest niewłaściwa.");
        } else {
            int suma = obliczSume(liczba);
            System.out.println("Suma liczb od 1 do " + liczba + " wynosi: " + suma);
        }
    }

    public static int obliczSume(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }
}
