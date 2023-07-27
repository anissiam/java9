import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String names[] = new String[5];
        int marks[] = new int[5];

        int c = 0;
        do {
            System.out.println("================================================================");
            System.out.println("1)Show Arrays\n2)Add Names\n3)Add Marks\n4)Sort Mark Array\n5)Update\n6)Delete\n7)Exit");
            c = scanner.nextInt();
            switch (c){
                case 1 :
                    System.out.println("1)Names\n2)Marks");
                    int cc = scanner.nextInt();
                    switch (cc){
                        case 1:
                            for (String name:names) {
                               System.out.println(name);
                            }
                            System.out.println("================================================================");
                            break;
                        case 2 :
                            for (int i = 0; i < marks.length ; i++) {
                                System.out.println(marks[i]);
                            }
                            System.out.println("================================================================");
                            break;
                    }
                    break;

                case  2 :
                    scanner.nextLine();
                    for (int i = 0; i < names.length; i++) {
                        System.out.println("Please add name ");
                        names[i] = scanner.nextLine();
                    }
                    break;

                case  3 :
                    scanner.nextLine();
                    for (int i = 0; i < marks.length; i++) {
                        System.out.println("Please add mark ");
                        marks[i] = scanner.nextInt();
                    }
                    break;
                case  5:
                    scanner.nextLine();
                    System.out.println("1)Names\n2)Marks");
                    int ccc = scanner.nextInt();
                    switch (ccc){
                        case 1:
                            scanner.nextLine();
                            System.out.println("Search for name");
                            String oldName = scanner.nextLine();
                            for (int i = 0; i <names.length ; i++) {
                                if (oldName.equalsIgnoreCase(names[i])) {
                                    System.out.println("Enter new name");
                                    names[i] = scanner.nextLine();
                                }
                            }
                            System.out.println("================================================================");
                            break;
                        case 2 :

                            System.out.println("================================================================");
                            break;
                    }
                    break;



            }
        }while (c<=7);


    }
}
