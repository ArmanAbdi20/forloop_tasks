package ForLoopTasks;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {


        	/*
		Task-> girilen bir String'deki rakam sayısını print eden code create ediniz
		 */


        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen içinde sayı olan bir metin giriniz :");

        String aa = scan.nextLine();

        int sayac = 0;

        for (int i = 0; i < aa.length() ; i++) {
            if (aa.charAt(i)>='0' && aa.charAt(i) <='9') {
                sayac++;
            }
            
        }
        System.out.println("rakam sayısı :" + sayac);


    }
}
