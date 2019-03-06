package MD;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String str = "FECHCHPGCHFD";
        String[] array = str.split("(?<=\\G.{2})"); // ab cd ef

        for (int i = 0; i < array.length; i++) {
            char pierwsze = array[i].charAt(0);
            char drugie = array[i].charAt(1);
            int x1 = 0, x2 = 0, licznik1 = 0, licznik2 = 0, suma = 0, dupa;

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

            System.out.println(x1+x2);

        }
    }
}





//            if(pierwsze == 'A') {
//                x1 = 0;
//            }
//             if(pierwsze == 'B') {
//                x1 = 1;
//            }
//             if(pierwsze == 'C') {
//                x1 = 2;
//            }
//             if(pierwsze == 'D') {
//                x1 = 3;
//            }
//             if(pierwsze == 'E') {
//                x1 = 4;
//            }
//             if(pierwsze == 'F') {
//                x1 = 5;
//            }
//             if(pierwsze == 'G') {
//                x1 = 6;
//            }
//             if(pierwsze == 'H') {
//                x1 = 7;
//            }
//             if(pierwsze == 'I') {
//                x1 = 8;
//            }
//             if(pierwsze == 'J') {
//                x1 = 9;
//            }
//             if(pierwsze == 'K') {
//                x1 = 10;
//            }
//             if(pierwsze == 'L') {
//                x1 = 11;
//            }
//             if(pierwsze == 'M') {
//                x1 = 12;
//            }
//             if(pierwsze == 'N') {
//                x1 = 13;
//            }
//             if(pierwsze == 'O') {
//                x1 = 14;
//            }
//             if(pierwsze == 'P') {
//                x1 = 15;
//            }


//        for(int i=0; i<array.length; i++){
//            char pierwsze= array.
//            int x;
//            for(int j=0; j<sign.length; j++){
//                if(sign[j]== 'A'){
//                    x= 0;
//                }
//                if(sign[j]== 'A'){
//                    x= 0;
//                }
//                if(sign[j]== 'A'){
//                    x= 0;
//                }
//                if(sign[j]== 'A'){
//                    x= 0;
//                }
//                if(sign[j]== 'A'){
//                    x= 0;
//                }
//                if(sign[j]== 'A'){
//                    x= 0;
//                }
//                if(sign[j]== 'A'){
//                    x= 0;
//                }
//                if(sign[j]== 'A'){
//                    x= 0;
//                }
//                if(sign[j]== 'A'){
//                    x= 0;
//                }
//                if(sign[j]== 'A'){
//                    x= 0;
//                }
//                if(sign[j]== 'A'){
//                    x= 0;
//                }
//                if(sign[j]== 'A'){
//                    x= 0;
//                }
//                if(sign[j]== 'A'){
//                    x= 0;
//                }
//                if(sign[j]== 'A'){
//                    x= 0;
//                }
//                if(sign[j]== 'A'){
//                    x= 0;
//                }
//                if(sign[j]== 'A'){
//                    x= 0;
//                }
//                if(sign[j]== 'A'){
//                    x= 0;
//                }
//                if(sign[j]== 'A'){
//                    x= 0;
//                }


