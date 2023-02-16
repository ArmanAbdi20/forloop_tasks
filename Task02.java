package ForLoopTasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {




         /* task-> interview question
        girilen ifadenin polindrome olmasını kontrol eden code create ediniz...
        plindrome:her iki yönde okundugunda eşit olan ifadeler :ece, ada etc.

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz :");

        String poli = scan.nextLine();

        int poliUzunluk = poli.length();

        int i, bas, son, orta;
        bas = 0;
        son = poliUzunluk -1;
        orta = ( bas + son ) /2;

        for (i = bas; i <= orta; i++) {
            if (poli.charAt(bas) == poli.charAt(son)) {
                bas++;
                son--;
            }
            else
                break;

        }
            if (i == orta+1) {
                System.out.println("girdiğiniz kelime \" Polindrom \" ");
            }else
                System.out.println("girdiğiniz kelime \" Polindrom Değil\" ");



















































    }
}
