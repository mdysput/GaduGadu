package MD;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String str = scanner.nextLine();
        String[] array = str.split("(?<=\\G.{2})"); // ab cd ef

        for (int i = 0; i < array.length; i++) {
            char pierwsze = array[i].charAt(0);
            char drugie = array[i].charAt(1);
            int x1 = 0, x2 = 0, licznik1 = 0, licznik2 = 0, suma = 0;

            for (char ch = 'A'; ch <= 'P'; ch++) {
                if (pierwsze == ch) {
                    x1 = licznik1;
                    break;
                }
                licznik1++;
            }

            for (char ch = 'A'; ch <= 'P'; ch++) {
                if (drugie == ch) {
                    x2 = 16 * licznik2;
                    break;
                }
                licznik2++;

            }
            suma = x1 + x2;
            char digit = (char) suma;
            System.out.print(digit);

        }
    }
}



