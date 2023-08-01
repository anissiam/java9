package basics;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // instance // Object

        /*System.out.println("Plz enter n1");
        int x = input.nextInt();

        System.out.println("Plz enter n2");
        int y = input.nextInt();

        System.out.println("Plz enter n3");
        int z = input.nextInt();

        int result = (x + y + z) / 3;

        if (result>=10){
            System.out.println(result + " is up to 10 ");
        }else {
            System.out.println(result + " is less than 10");
        }*/


        System.out.println("Plz enter your media");
        String link = input.nextLine();
        if (link.contains("png")){
            System.out.println("Image");
        }else {
            System.out.println("Not Image");
            if (link.contains("mp4")){
                System.out.println("Video");
            }
        }


        //System.out.println(link.contains("png"));

        /*System.out.println("Plz enter n1");
        int x = input.nextInt();

        System.out.println("Plz enter n2");
        int y = input.nextInt();

        System.out.println("Plz enter n3");
        int z = input.nextInt();
        int result = (x+y+z) / 3;

        System.out.println(result);*/

        /*System.out.println("Plz enter your media");
        String link = input.nextLine();
        //https://cdn-icons-png.flaticon.com/512/5968/5968282.png
        System.out.println(link.contains("png"));*/

       /* System.out.println("Plz enter age ");
        int age = input.nextInt();

        input.nextLine();


        System.out.println("Plz enter your line ");
        String line = input.nextLine();

        System.out.println(line.isEmpty());
*/








        /*System.out.println("Plz enter your name ");
        String name = input.nextLine(); // basics.Strings

        System.out.println("Plz enter your age ");
        int age = input.nextInt();

        System.out.println("Plz enter your mark ");
        double mark = input.nextDouble();

        System.out.println("Name:" + name + "\n" + "Age:" + age + "\n" +
                "Mark:" + mark);*/




        /*System.out.println("Plz enter the number ");
        int x = input.nextInt();

        System.out.println("The num is " + x);

        int y = x + 10;
        System.out.println(y);*/


    }
}
