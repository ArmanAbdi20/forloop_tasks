package ForLoopTasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {


    //    5x5 lik  code crede ediniz




//        System.out.print("bir tam sayı giriniz :");
//        int boyut = scan.nextInt();
//
//        for (int carpan1 = 1; carpan1 <=boyut ; carpan1++) {
//            for (int carpan2 = 1; carpan2 <=boyut ; carpan2++) {
//                System.out.print((carpan1*carpan2) + "\t");
//
//            }
//            System.out.println();
//        }


   /*
        Task ->
        girilen boyuttta bir kare için
         Ekran Çıktısı
            Bir sayı giriniz: 7
            1 0 0 0 0 0 0
            0 1 0 0 0 0 0
            0 0 1 0 0 0 0
            0 0 0 1 0 0 0
            0 0 0 0 1 0 0
            0 0 0 0 0 1 0
            0 0 0 0 0 0 1


            Bir sayi giriniz: 5
            1 0 0 0 0
            0 1 0 0 0
            0 0 1 0 0
            0 0 0 1 0
            0 0 0 0 1

            şekli print eden code create ediniz
         */


        Scanner scan = new Scanner(System.in);


        System.out.println("bir tam sayı giriniz :");



        int boyut=scan.nextInt();

        for (int i = 1; i <=boyut ; i++) {//apt döngü
            for (int j = 1; j <=boyut ; j++) {//daire döngü
                if (i==j){
                    System.out.print("1  ");
                }else System.out.print("0  ");
            }
            System.out.println();
        }



        }





























    }

