package oop.basics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    static Car car;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] a = new int[5];


        try {
            System.out.println(10 / 0);
            a[5] = 30;


            int c = scanner.nextInt();
            System.out.println(car.name); //trow
           Integer.parseInt("abc");


        } catch (NullPointerException e) {
            System.out.println(e);

            car = new Car();
            car.name = "BMW";
            System.out.println(car.name);
            return;

        }catch (NumberFormatException e){
            System.out.println(e);
            Integer.parseInt("10");
        }catch (InputMismatchException e){
            System.out.println(e);

        }
        finally {
            System.out.println("Finally");
        }


        System.out.println("Done");
    }
}
