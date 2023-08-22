package oop.genaric;

import oop.poly.Calc;

public class Main {
    public static void main(String[] args) {
        /*Test<String> test = new Test<>();
        test.print("Anis");*/

       /* Test<Integer> test1 = new Test<>();
        test1.print(10);

        Test<Double> t = new Test<>();*/
        Person person = new Person("sami", 20);
        Test<Person> test = new Test<>();
        System.out.println(test.print(person).toString());

        Test<SuperMan> test1 = new Test<>();
    }
}
