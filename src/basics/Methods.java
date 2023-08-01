package basics;

import java.util.Scanner;

public class Methods {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        test();
        //test(10,10);
        /*test("10" , "10");
        test(1, 1);*/
        //test(1.0, 1);
        /*int[] arr = new int[5];

        maxMin(arr);*/


        /*sum(10, 50);
        sub(10, 50);
        System.out.println(div(10, 50));
        System.out.println(multi(10, 50));*/




       /* printFirstName();
        printLastName();*/

        /*
        System.out.println("Plz enter x ");
        int x = scanner.nextInt();

        System.out.println("Plz enter y ");
        int y = scanner.nextInt();
        System.out.println("1)Add\n2)Sub\n3)Div\n4)Multiple");
        int c = scanner.nextInt();
        switch (c){
            case 1 :
                basics.Calc.sum(x, y);
                break;
            case 2 :
                basics.Calc.sub(x, y);
                break;
            case 3 :
                basics.Calc.div(x, y);
                break;
            case 4 :
                basics.Calc.muli(x, y);
                break;
        }

        *//*showName();
        int x = new Scanner(System.in).nextInt();
        int y =  new Scanner(System.in).nextInt();

        sum(x, y);

        sub(x,y);*/
    }

    /*static void sub(int s, int v) {
        System.out.println(s - v);
    }

    static void sum(int x , int y){

        System.out.println(x + y);
    }


    static void showName(){
        System.out.println("My name first name is");
        System.out.println("Anis");

        System.out.println("My name last name is");
        System.out.println("Siam");

    }
*/

    /*static void printFirstName(){

        System.out.println(getName("First"));

    }

    static void printLastName(){

        System.out.println(getName("Last"));

    }
    static String getName(String text){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your " + text + " name");
        String name = scanner.nextLine();
        return name;
    }*/

    static void test(){
        System.out.println("test");
    }

    static void test(int x , double y){
        System.out.println(x + y);
    }

    /*static void test(double x , int y){
        System.out.println(x + y);
    }*/

    /*static void test(int x , int y){
        System.out.println(x + y);
    }*/
    static void test(int x , String y){
        System.out.println(x + y);
    }

    static void test(String x , int y){
        System.out.println(x + y);
    }


    static void test(String x , String y){
        System.out.println(x + y);
    }

    static void test(String x, String y, double v) {

        System.out.println(x + y);
    }



    static void maxMin(int [] arr){
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (max<arr[i]){
                max = arr[i];
            }

            if (min>arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Max is " +max );
        System.out.println("Min is " +min );
    }

     static void sum(int x , int y){
         System.out.println(x + y);
     }

    static void sub(int x , int y){
        System.out.println(x - y);
    }

    static int div(int x , int y){
        return x / y;
    }

    static int multi(int x , int y){
        return x * y;
    }

}


