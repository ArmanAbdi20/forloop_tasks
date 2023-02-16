package ForLoopTasks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

// task : girilen iki sayı arasındaki çift sayıları print eden cod creat ediniz



        System.out.println("Lütfen bir tam sayı giriniz :");

        int sayi1= scan.nextInt();


        System.out.println("Lütfen bir tam sayı daha giriniz :");
        int sayi2 = scan.nextInt();

        if (sayi1>sayi2) {
            for (int i = sayi2; i < sayi1 ; i++) {
                if (i%2==0) {
                    System.out.println(i);
                }

            }
        } else {
            for (int i = sayi1; i <sayi2 ; i++) {
                if (i%2==0) {
                    System.out.println(i);
                }

            }


        }



        for (int i =(sayi1<sayi2 ? sayi1 : sayi2); i <=(sayi1>sayi2 ? sayi1 : sayi2) ; i++) {
            System.out.print(i%2==0 ? i+" " : "");
        }



















    }
}
