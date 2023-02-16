package ForLoopTasks;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {



        /*
        task-> girilen boyutta kare çarpım tablosu print eden code create ediniz
          Örnek Ekran çıktısı
       1  2  3  4  5
       2  4  6  8 10
       3  6  9 12 15
       4  8 12 16 20
       5 10 15 20 25

       5x5
         */



        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz :");

        int sayi = scan.nextInt();

        for (int carpan1 = 1; carpan1 <=sayi ; carpan1++) {
            for (int carpan2 = 1; carpan2 <= sayi ; carpan2++) {
                System.out.print((carpan1*carpan2)+"\t");

            }
            System.out.println();
        }








































    }
}
