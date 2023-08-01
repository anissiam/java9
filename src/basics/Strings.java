package basics;

public class Strings {
    static String company ;
    public static void main(String[] args) {
        /*String name = "Anis";
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

    */

        //////////////////////////////////////////////////////////////////////////////////////

      /*  String line = "Hello from java development class";
        String word = "    Anis ";
        int wordLength = word.length();
        int  wordLength1 =  wordLength + 5000;
        System.out.println(line.length());
        boolean b = line.isEmpty();
        System.out.println(b);

        System.out.println(line.concat(" ".concat(word)));


        System.out.println(word.toUpperCase());
        System.out.println(word.toLowerCase());


        System.out.println(line.indexOf("a"));
        System.out.println(line.indexOf("A"));
        System.out.println(line.lastIndexOf("a"));
        System.out.println(line.charAt(1));
        String ss = line.substring(2);
        System.out.println(line.substring(2));
        System.out.println(line.substring(2 , 8));

        line = line.replace("java", "C++");
        System.out.println(line);

        System.out.println(line.contains("java"));

        System.out.println(word.trim());

        System.out.println(line.startsWith("Anis"));
        System.out.println(line.startsWith("He"));
        System.out.println(line.endsWith("class"));
*/
        /////////////////////////////////////////////////////////////////////////

        String text = "Java class";
        System.out.println(text.isEmpty());
        System.out.println(text.substring(3));
        System.out.println(text.substring(5));

        int l = text.length();
        System.out.println(l);

        System.out.println(text.trim());

        String ss = "java";
        String ss1 = "JAVA";

        System.out.println(ss.equals(ss1));

        String t1 =  "PHP Exercises and";
        String t2 = " Python Exercises";
        System.out.println(t1.concat( " "+ t2));

        /*int result = t1.length() + t2.length();
        System.out.println(result);*/

        System.out.println(t1.equals(t2));
        System.out.println(t1.replace("PHP", "Java"));

        String email = "email@gmail.com ";
        System.out.println(email.contains("@"));


        int result = 1 + 2; // result is now 3
        System.out.println(result);

        result -= 1; // result is now 2
        System.out.println(result);

        result *= 2; // result is now 4
        System.out.println(result);

        result  /=  2; // result is now 2
        System.out.println(result);

        result = result + 8; // result is now 10
        result %= 7; // result is now 3
        System.out.println(result);


        int i = 3;
        System.out.println(++i);
        System.out.println(++i);
        System.out.println(++i);
        System.out.println(i++);
        System.out.println(i);



    }
}
