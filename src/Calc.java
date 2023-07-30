public class Calc {
    static void sub(int s, int v) {
        System.out.println(s - v);
    }

    static void sum(int x , int y){

        System.out.println(x + y);
    }

    static void div(int x , int y){
        if (y==0){
            System.out.println("/ by zero");
            return;
        }
        System.out.println(x / y);
    }

    static void muli(int x , int y){

        System.out.println(x * y);
    }

}
