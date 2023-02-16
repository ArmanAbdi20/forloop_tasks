package ForLoopTasks;

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {

        //task -> verilen bir tam sayinin rakamlari toplamini print eden code create ediniz


        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen bir tam sayı giriniz :");
        int tam = scan.nextInt();

        int rakToplami = 0;

        for (int i = tam ; i > 0; i=i/10) {  // sayıdan başlayıp her tekrarda basamak sayısı azalan döngü
            rakToplami+=i%10;

        }
        System.out.println("rakamlar toplamı :"+ rakToplami);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
