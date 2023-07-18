import java.util.Locale;
import java.util.Scanner;

public class IfStatment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("plz enter num");
        int num = scanner.nextInt();

        switch (num){
            case 1 :
                System.out.println("1");
                break;
            case 2 :
            case 3 :
                System.out.println("2 or 3");
                break;
            case 4 :
                System.out.println("4");
        }

        /*if (num==1){
            System.out.println("1");
        }else if (num==2 || num ==3){
            System.out.println("2 or 3");
        }else if (num ==4){
            System.out.println("4");
        }*/

        /*System.out.println("Plz enter month");
        byte month = scanner.nextByte();

        switch (month){
            case 1:
                System.out.println("jan");
                break;
            case 2 :
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("March");
                break;
            default:
                System.out.println("not valid");
        }
*/

        /*if (month==1){
            System.out.println("jan");
        } else if (month==2) {
            System.out.println("Feb");
        }else if (month==3) {
            System.out.println("March");
        } else {
            System.out.println("not valid ");
        }*/


        /*System.out.println("Plz enter the mark ");
        int mark = scanner.nextInt();

        if (mark > 100 || mark < 0) {
            System.out.println("not valid");
            return;
        }

        if (mark>=90){
            System.out.println("E");
        } else if (mark >= 80) {
            System.out.println("V Good");
        } else if (mark>=70) {
            System.out.println("Good");
        } else if (mark>=60) {
            System.out.println("Pass");
        } else {
            System.out.println("Failed");
        }
*/

      /*  System.out.println("plz enter the line ");
        String line = scanner.nextLine();

        if (line.isEmpty()){
            System.out.println("Empty");
            return;
        }

        if (line.contains("java")){
            System.out.println("ok java");
            System.out.println("Plz enter new word ");
            String newWord = scanner.nextLine();
            if (!newWord.isEmpty()){
                System.out.println(line.replace("java", newWord));

            }else {
                System.out.println("new word is empty");
            }
        }else {
            System.out.println("not java");
        }*/


        /////////////////////////////////////////////////////
        //scanner.useLocale(Locale.US);
       /* System.out.println("plz enter mark");
        int mark = scanner.nextInt();
            //T  OR F
        if (mark > 100 || mark < 0) {
            System.out.println("not valid");
            return;
        }*/

        /*if (mark<0){
            System.out.println("not valid");
            return;
        }*/

        /*if (mark >= 60) {
            System.out.println("Pass");
        } else {
            System.out.println("Failed");
        }*/


    }
}
