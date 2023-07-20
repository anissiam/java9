import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plz enter the line ");
        String line = scanner.nextLine();

        String massage = "";
        while (true){
            if (line.contains("@")){
                massage ="Email";
            } else if (line.contains("://")) {
               massage = "URL";
            }else {
                System.out.println("normal text");
                break;
            }
            System.out.println(massage);

            line = scanner.nextLine();
        }
       /* System.out.println("Plz enter num");
        int  num = scanner.nextInt();
        while (num!=0){
            System.out.println("Plz enter new num");
            num = scanner.nextInt();;
        }
        */


        /*System.out.println("Plz enter num");
        int  num = scanner.nextInt();
        while (true){

            if (num==0){
                System.out.println("Zero");
                break;
            }
            System.out.println("Plz enter new num");
              num = scanner.nextInt();;
        }*/

        /*int i = 7;
        int fact = 1;

        while (i>1){
            fact = fact * i;
            i--;
        }
        System.out.println("fact is " + fact);*/

        /*int sum = 0;
        int i = 0;
        while (i<=100){
            sum += i;
            i++;
        }
        System.out.println("Sum =" + sum);
*/


        /*System.out.println("Plz enter the name");
        String name = scanner.nextLine();

        while (true){
            if (name.equalsIgnoreCase("stop")){
                System.out.println("App is stopped");
                break;
            }
            System.out.println("Plz enter new name");
            name = scanner.nextLine();
        }*/






//        System.out.println("Hello"); 0
//        System.out.println("Hello");1
//        System.out.println("Hello");2
//        System.out.println("Hello");3
//        System.out.println("Hello");4

        /*int i = 0;
        while (i<=4){
            System.out.println("Hello");
            i++;  // i = i+1
        }*/

        /*while (true){
            System.out.println("hello");  // infinity loop
        }*/


        /*int i = 0;
        while (i <= 100) {
            i++;
            if (i % 2 == 0 ) {
                System.out.println(i);
            }
        }*/

        /*int i = 0;
        while (i < 100) {
            i += 2; // i = i+2
            System.out.println(i);
        }*/


        /*int i = 0;
        while (i < 100) {
            System.out.println(i+1);
            i += 2; // i = i+2
        }
*/



    }
}
