package oop.basics;

public class WrapperClasses {
    public static void main(String[] args) {
        int x = 10;

       /* Integer xxy = new Integer(10);
        Integer xx = Integer.valueOf(xxy);*/
        Integer xx = Integer.parseInt("10");

        System.out.println(xx.doubleValue());

        System.out.println(Integer.max(10, 50));
        System.out.println(Integer.min(10, 50));




    }
}
