package ForLoopTasks;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {



          /*
        task-> girilen boyutta aşağıdaki şekli  print eden code create ediniz
          Örnek Ekran çıktısı
      *
      * *
      * * *
      * * * *

         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir tam sayı giriniz :");
        int sayi = scan.nextInt();


        for (int i = 0; i < sayi; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(" * ");
            } System.out.println();


        }





























    }
}
