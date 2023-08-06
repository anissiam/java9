package oop.inhr;

public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        person.name = "Anis";
        person.showName();
        System.out.println(person.name);

        SuperMan superMan = new SuperMan();
        superMan.superPower = "fly";
        superMan.showName();
//        superMan.name = "Clark";
        System.out.println(superMan.name);

        Batman batman = new Batman();
        batman.showName();

        System.out.println(batman.superPower);
    }
}
