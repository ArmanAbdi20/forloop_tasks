package ForLoopTasks;

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {


         /*
           TASK  :
           Bir String içindeki tüm karakterleri en fazla bir kez print eden  create ediniz.
           Test Data:
           input: "aabbcccccddddaaa"
           output: abcd
        */


        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bir metin giriniz :");

        String data = scan.nextLine();


        String bos ="";

        for (int i= 0; i <data.length()-1 ; i++) {
            if (!bos.contains(data.substring(i, i+1))) {
                bos +=data.substring(i, i+1);
            }

        }
        System.out.println("metindeki harfler :" + bos);




























    }
}
