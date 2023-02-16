package ForLoopTasks;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {


/*
        task-> Girilen sayının asal olmasını kontrol eden code create ediniz.
     */

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz :");

        int asal = scan.nextInt();

        int bolenSayisi = 0;

        for (int i = 2; i <= asal; i++) {
            if (asal%i == 0) {
                bolenSayisi++;

            }

        }

            if (bolenSayisi == 0) {
                System.out.println("Seçtiğiniz sayı asaldır.");
            } else {
                System.out.println("Seçtiğiniz sayı asal değildir.");            }
























    }
}
