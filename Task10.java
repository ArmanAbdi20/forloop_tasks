package ForLoopTasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {


  /* task ->
        girilen bir ifadenin istenen harf sayısını print eden code create ediniz

        input : selam javaCAN'lar
        output : a sayısı :3
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen bir cümle giriniz : ");

        String str = scan.nextLine();

        System.out.print("hangi harfin sayısını istersiniz : " );

        char harf = scan.next().charAt(0);

        int harfSayısı = 0;

        for(int i =0; i<=str.length()-1; i++) {
            if (str.charAt(i) == harf) {
                harfSayısı++;
            }
        }
        System.out.println("girilen cümledeki " +harf+ " harfi sayısı " + harfSayısı + " adettir.");





    }
}
