public class zadanie11 {
       public static void main(String[] args) {
           System.out.println("Przeliczanie temperatury z °C na °F");
           System.out.println("--------------");
            System.out.printf("%-6s %s%n", "°C", "°F");

           for (int c = 0; c <= 20; c++) {
               double f = konwersjaCNaF(c);
                System.out.printf("%-4d   %6.2f%n", c, f);
           }
         }

         public static double konwersjaCNaF(int celsius) {
             return (celsius * 9.0 / 5.0) + 32;
    }
}
