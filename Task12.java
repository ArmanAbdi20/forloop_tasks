package ForLoopTasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {

         /*
        Task -> girilen 5 sayının 10 ile 20 arası hariç diğerlerinin
        toplamının print eden code create ediniz
         */

        Scanner scan = new Scanner(System.in);

        int toplam = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Lütfen " + i + " . sayıyı giriniz :");
            int sayi = scan.nextInt();
            if (sayi<=10 || sayi>=20) {
                toplam+=sayi;
            }
        }
        System.out.println("Girilen sayılardan 10 ile 20 arası hariç olanların toplamı :" + toplam);































    }
}
