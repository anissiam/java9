import java.util.Scanner;

public class Project2Methods {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String names[] = new String[5];
        int marks[] = new int[5];

        int c = 0;
        do {
            System.out.println("================================================================");
            System.out.println("1)Show Arrays\n2)Add Names\n3)Add Marks\n4)Sort Mark Array\n5)Update\n6)Delete\n7)Exit");
            c = scanner.nextInt();
            switch (c){
                case 1 :
                    showArrays(names , marks);
                    break;
                case  2 :
                    addNames(names);
                    break;
                case  3 :
                    addMarks(marks);
                    break;
                case 4 :
                    sortArrays(marks);
                    break;
                case  5:
                    update(names, marks);
                    break;
                case 6 :
                    delete(names, marks);
                    break;
                case 7 :
                    System.exit(0);
                    break;
            }
        }while (c<=7);


    }

     static void sortArrays(int[] marks) {
         for (int i = 0; i <marks.length ; i++) {
             System.out.print(marks[i] + "\t");
         }

         //Arrays.sort(marks); Quick sort

         //Bubble sort
         int temp = 0;
         for (int i = 0; i <marks.length ; i++) {
             for (int j = i+1; j < marks.length ; j++) {
                 if (marks[i] > marks[j]) {
                     temp = marks[i];
                     marks[i] =marks[j];
                     marks[j] = temp;
                 }
             }
         }
         System.out.println("Before sort");

         for (int i = 0; i <marks.length ; i++) {
             System.out.print(marks[i] + "\t");
         }

         System.out.println("After Sort");


     }


    static void showArrays(String [] names , int [] marks){
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
    }

    static void addNames(String names []){
        scanner.nextLine();
        for (int i = 0; i < names.length; i++) {
            System.out.println("Please add name ");
            names[i] = scanner.nextLine();
        }
    }
    static void addMarks(int [] marks){
        scanner.nextLine();
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Please add mark ");
            marks[i] = scanner.nextInt();
        }
    }

    static void update(String [] names  , int [] makrs){
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
                scanner.nextLine();
                System.out.println("Plz enter mark");
                int oldMark = scanner.nextInt();

                for (int i = 0; i <makrs.length ; i++) {
                    if (oldMark ==makrs[i]){
                        System.out.println("Plz enter new mark");
                        makrs[i] = scanner.nextInt();
                    }
                }
                System.out.println("================================================================");
                break;
        }
    }

    static void delete(String names [] , int [] makrs){
        int c = showSubMenu();
        switch (c){
            case 1 :
                scanner.nextLine();
                System.out.println("Search for name");
                String oldName = scanner.nextLine();
                for (int i = 0; i <names.length ; i++) {
                    if (oldName.equalsIgnoreCase(names[i])) {
                        names[i] = "";
                    }
                }
                System.out.println("================================================================");

                break;

            case  2 :
                scanner.nextLine();
                System.out.println("Plz enter mark");
                int oldMark = scanner.nextInt();

                for (int i = 0; i <makrs.length ; i++) {
                    if (oldMark ==makrs[i]){
                        makrs[i] = 0;
                    }
                }
                System.out.println("================================================================");

                break;

        }
    }


    static int showSubMenu(){
        scanner.nextLine();
        System.out.println("1)Names\n2)Marks");
        int ccc = scanner.nextInt();
        return ccc;
    }
}
