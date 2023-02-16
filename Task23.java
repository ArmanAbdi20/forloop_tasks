package ForLoopTasks;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {


           /*  task-> girilen tam sayıya kadar olan sayıların karelerinin toplamını
         print eden code create ediniz.


        Girilen sayı=4
        Kareler toplamı=30
     */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bir tam sayı giriniz :");

        int tam= scan.nextInt();

        int toplam =0;

        for (int i = 1; i <=tam; i++) {
            toplam+=i*i;


        }

        System.out.println("girilen sayının karelerinin toplamı :" +toplam);























    }
}
