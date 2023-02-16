package ForLoopTasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {


     // girilen sayının faktoriyelini print eden code creat ediniz. //INTERVIEW SORUSU

// falan faktoriyel = 1 den falana kadar tam sayıların çarpımı

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz :");

        int sayi = scan.nextInt();
        int fac = 1;

        for (int i = 1; i <= sayi; i++) {
            fac*=i;
        }
        System.out.println("girilen sayının faktoriyeli :" + fac );





























    }
}
