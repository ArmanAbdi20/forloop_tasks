package ForLoopTasks;

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        
        
        /*
		 Task -> girilen  String'in tersini(reverse String) print eden code create ediniz
		 */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bir cümle giriniz :");
        String str = scan.nextLine();


        for (int i = str.length()-1; i >= 0 ; i--) {
            System.out.print("isminizin tersi :"+ str.charAt(i));
        }

        for (int i =0; i <= str.length()-1; i++){                     //2. çözümü
            System.out.print(str.charAt(str.length()-1-i));
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
