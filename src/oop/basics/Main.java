package oop.basics;

public class Main {
    public static void main(String[] args) {
        Person person= new Person();

        person.name = "Anis";
        person.age = 30;
        person.major = "CS";
        person.tall = 170.0;
        Animal animal = new Animal();
        animal.name = "Locy";
        person.animal = animal;
        System.out.println(person.animal.name);

        printData(person);


       /*
        person.printData();
*/
      /*  Animal obj = new Animal();
        obj.name = "Locy";
        obj.type = "Cat";
        obj.age = 2;
        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(obj.type);
        obj.makeSound("Meow");

        System.out.println("=============");

        Animal obj1 = new Animal();
        obj1.name = "Max";
        obj1.type = "Dog";
        obj1.age = 10;
        System.out.println(obj1.name);
        System.out.println(obj1.age);
        System.out.println(obj1.type);
        obj1.makeSound("Woof Woof");*/



    }

   static void printData(Person obj){
        System.out.println("name :" + obj.name);
        System.out.println("Age :" + obj.age);
        System.out.println("major :" + obj.major);
        System.out.println("tall :" + obj.tall);
    }
}
