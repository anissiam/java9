import java.util.Scanner;

public class Methods {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


        printFirstName();
        printLastName();

        /*
        System.out.println("Plz enter x ");
        int x = scanner.nextInt();

        System.out.println("Plz enter y ");
        int y = scanner.nextInt();
        System.out.println("1)Add\n2)Sub\n3)Div\n4)Multiple");
        int c = scanner.nextInt();
        switch (c){
            case 1 :
                Calc.sum(x, y);
                break;
            case 2 :
                Calc.sub(x, y);
                break;
            case 3 :
                Calc.div(x, y);
                break;
            case 4 :
                Calc.muli(x, y);
                break;
        }

        *//*showName();
        int x = new Scanner(System.in).nextInt();
        int y =  new Scanner(System.in).nextInt();

        sum(x, y);

        sub(x,y);*/
    }

    static void sub(int s, int v) {
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


    static void printFirstName(){

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
    }

}


