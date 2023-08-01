package basics;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*for (int i = 5 ;i >0 ; i--) {
            for (int j = 0; j<i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/


        /*for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <=10 ; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
            System.out.println("======================");
        }
*/
        /*for (int i = 0; i <5 ; i++) {
            if (i==3){
                continue;
            }
            System.out.println(i);
        }*/
        /*for (;;){
            System.out.println("Enter any num");
            int num = scanner.nextInt();
            if (num==0){
                System.out.println("not valid");
                continue;
            }
        }*/


        /*System.out.println("Enter the num");
        int num = scanner.nextInt();
        int fact = 1;
        for (int i = num; i > 1; i--) {
            fact *= i;
        }
        System.out.println(fact);*/

        /*int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i%2==0){
                sum += i;
            }

        }
        System.out.println("Sum is " + sum);*/

        /*for (int i = 1; i < 10; i++) {
            if (i!=9){
                System.out.print("1/" + i  + "+ ");
            }else {
                System.out.print("1/" + i );
            }
        }*/


        //Print month
       /* for (int i = 0; i <4 ; i++) {
            System.out.println("Week" + (i + 1));
            for (int j = 0; j < 7; j++) {
                System.out.print("day " + (j + 1) + "  ");
            }
            System.out.println();
        }*/
            /*
            *
            * *
            * **
            * ****
            * *****
            */
        /*for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

       /* System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");
        System.out.println("*****");
*/
        /*for (int i = 0; i < 5; i++) {
            System.out.println("*****");
        }*/

        /*for (int i = 0; i <5 ; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");

            }
            System.out.println();
        }*/

        // اخراج الرقم الاكبر والاصغر ل 5 ارقام
        /*int max = 0;
        int min = 0;
        int num;
        for (int i = 0; i <5 ; i++) {
            System.out.println("Plz enter the num ");
            num = scanner.nextInt();
            if (i==0){
                min = num;
            }
            if (max<num){
                max = num;
            }

            if (min>num){
                min = num;
            }

        }
        System.out.println("Max is " + max);
        System.out.println("Min is " + min);*/


        // ادخال اسماء والتوقف عند stop
        /*for (;;){
            System.out.println("Plz enter the word");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("stop")){
                System.out.println("Stopped");
                break;
            }
        }*/


        // ادخال ارقام ومعرفة الزوجي والفردي
        /*for (;;){
            System.out.println("Plz enter the num");
            int i = scanner.nextInt();
            if (i ==0){
                System.out.println(" Zero");
            }else if (i%2!=0){
                System.out.println(i  + " is Odd");
            }else {
                System.out.println(i  + " is Even");
            }
        }*/


        /*int i = 0;
        while (i<=100){
            i++;
            if (i%2==0){
                System.out.println(i);
            }
        }*/

        /*for (int i = 0; i <= 100;  i++) {

            if (i % 2 == 0 && i !=0) {
                System.out.println(i);
            }
        }*/




        /*int i = 0;
        while (i<5){
            System.out.println("Hello");
            i++;
        }*/


        /*for ( int i = 0;i<5;  i++){
            System.out.println("Hello");
        }*/


        /*int i = 5;
        do {
            System.out.println("Hello");
        }while (i<5);*/

       /* while (i<5){
            System.out.println("Hello");
        }*/

        /*
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
        }*/
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

