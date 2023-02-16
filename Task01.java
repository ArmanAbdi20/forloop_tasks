package ForLoopTasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {



        /*
       Interview Question

               Girilen  100’den kucuk bir tamsayi için
               1’den baslayarak girilen sayiya kadar tum sayilari
       		- Sayi 3’un kati ise sayi yerine “Java”
       		- Sayi 5’in kati ise sayi yerine “CAN'dır”
       		- Sayi hem 3’un hem 5’in kati ise sayi yerine “JavaCAN” print eden code create ediniz

*/

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz :");

        int tamSayi = scan.nextInt();

        if (tamSayi > 0 && tamSayi < 100) {
            for (int i = 1; i <= tamSayi; i++) {
                if (tamSayi % 15 == 0) {
                    System.out.println("JavaCAN");
                } else if (tamSayi % 5 == 0 && tamSayi % 15 != 0) {
                    System.out.println("CAN'dır");
                } else if (tamSayi % 3 == 0 && tamSayi % 15 != 0) {
                    System.out.println("Java");
                } else System.out.print("Lütfen 0 ile 100 arası bir sayı giriniz!!");
            }


        }
    }
}