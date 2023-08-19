package oop.poly;

public class Main {
    public static void main(String[] args) {

        Test test = new Calc();
        poly(test, 10, 20);

        //test.make(10, 20);


        test = new Conct();

        poly(test, 10, 20);
        //test.make(10, 20);


        /*A a = new A();
        a.print();

        B b = new B();
        b.print();

        C c = new C();
        c.print();*/


       /* A a = new B();
        a.print();

        A c = new C();
        c.print();*/

       /* C c = new C();
        Poly poly = new Poly();
        poly.poly(new C());*/


    }

    /*public static  void poly(A a){
        a.print();
    }*/

    private static void poly(Test test, int a, int b) {
        test.make(a, b);
    }
}
