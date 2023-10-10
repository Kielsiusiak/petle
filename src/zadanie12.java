import java.util.Scanner;

public class zadanie12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] salesData = new int[5];
        String[] shopNames = {"Sklep A", "Sklep B", "Sklep C", "Sklep D", "Sklep E"};

        for (int i = 0; i < salesData.length; i++) {
            System.out.print("Podaj dzisiejszą sprzedaż dla " + shopNames[i] + ": ");
            salesData[i] = scanner.nextInt();
        }

        System.out.println("\nWYKRES SŁUPKOWY Z POZIOMEM SPRZEDAŻY\n");

        for (int i = 0; i < salesData.length; i++) {
            System.out.print(shopNames[i] + ": ");
            for (int j = 0; j < salesData[i] / 100; j++) {
                System.out.print("#");
            }
            System.out.println();
        }

        scanner.close();
    }
}
