public class Strings {
    static String company ;
    public static void main(String[] args) {
        String name = "Anis";
        String name1 = "Anis";
        String name2 = new String("Anis");
        String lastName = "Siam";

        company = "Vision plus";

        String name3 = "anis";

        System.out.println(name +" " +  lastName);

        System.out.println(name == name1);//by ref
        System.out.println(name.equals(name1));//by value


        System.out.println(name == name2);//by ref
        System.out.println(name.equals(name2));//by value



        int age = 30;
        double mark = 64;
        String myName = "Anis";
        System.out.println("My name is "+ myName  + " " + lastName+ " and my age is " + age +
                " and my last mark is " + mark + " and working on " + company);
    }
}
