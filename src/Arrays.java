import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] names = {"Anis", "SAmi", " roaa", "nwal","SAmi", "mohamed", "Ali"};
        for (int i = 0; i <names.length ; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].equalsIgnoreCase(names[j])) {
                    System.out.println(names[i]);
                }
            }
        }



        names[names.length - 1] = "Hello Java";
        for (String name:names) {
           System.out.println(name);
        }


        /*int[] nums = new int[10];
        int m = 1;
        int sum = 0;
        int max = 0;
        int min = 0;
        for (int i = 0; i <nums.length ; i++) {
            System.out.println("Plz enter the element");
            nums[i] = scanner.nextInt();
            m *= nums[i];
            sum += nums[i];
            if (i==0){
                max = nums[0];
                min = nums[0];
            }

            if (max<nums[i]){
                max = nums[i];
            }
            if (min>nums[i]){
                min = nums[i];
            }

            if (nums[i]==10){
                System.out.println("Found");
            }
        }
        System.out.println("M " + m);
        System.out.println("Sum " + nums.length);
        System.out.println("Ava " + sum / nums.length);
        System.out.println("Max " + max);
        System.out.println("Min " + min);*/



        /*int[] nums = {10, 20, 30};
        int i = 0;
        for (int n:nums) {
            System.out.println(n + " " + i + " ");
            i++;
        }*/
/*

        int [][] nums = {{5,7,9},{1,3,5 ,8},{2,4,6}};
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
*/

        /*String[][] month = {{"Sat" , "sun" ,"mon" ,"thu" , "wend" , "thur" ,"fri"},
                {"Sat" , "sun" ,"mon" ,"thu" , "wend" , "thur" ,"fri"},
                {"Sat" , "sun" ,"mon" ,"thu" , "wend" , "thur" ,"fri"},
                {"Sat" , "sun" ,"mon" ,"thu" , "wend" , "thur" ,"fri"}};

        for (int i = 0; i <month.length ; i++) {
            System.out.println("Week " + (i + 1));
            for (int j = 0; j <month[i].length ; j++) {
                System.out.print(month[i][j] + "  ");
            }
            System.out.println();
        }*/

        /*String[][] names = new String[2][2];

        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                names[i][j] = scanner.nextLine();
            }
        }

        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                System.out.print(names[i][j]+ " ");
            }
            System.out.println();
        }*/
       // int [][] nums = new int[3][4];

        //System.out.println(nums.length); //عدد الصفوف
        //System.out.println(nums[0].length); //عدد الصفوف

        /*for (int i = 0; i <nums.length ; i++) {
            for (int j = 0; j <nums[i].length ; j++) {
                System.out.println(" Enter the elemnt ");
                nums[i][j] =  scanner.nextInt();
            }
        }

        for (int i = 0; i <nums.length ; i++) {
            for (int j = 0; j <nums[i].length ; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }*/


        /*String[] names1 = {"Anis" , "Sami" , "Ali" , "Mosa"};
        String[] names2 = {"FOFO" , "Mosa" , "Mohamed" , "SOSO"};

        for (int i = 0; i < names1.length; i++) {
            for (int j = 0; j <names2.length ; j++) {
                if (names1[i].equalsIgnoreCase(names2[j])) {
                    System.out.println(names1[i] + " Found");
                    break;
                }
            }
        }*/
       /* int[] nums = {10, 50, 70, 5, 9};
        int max = 0;
        int min = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (max<nums[i]){
                max = nums[i];
            }
            if (min>nums[i]){
                min = nums[i];
            }
        }
        System.out.println("max is " + max);
        System.out.println("min is " + min);
*/
        /*System.out.println("Search for");
        int s = scanner.nextInt();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == s) {
                System.out.println("Found");
                break;
            }
        }
*/

        /*int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println(sum);*/



       /* for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2==0){
                System.out.println(nums[i] + " Even");
            }else {
                System.out.println(nums[i] + " Odd");
            }
        }*/

      /*  String[] names = {"anis", "sami", "soso", "mona" };
        int i = 0;
        for (; i < names.length; i++) {
           if (names[i].contains("anis")){
               System.out.println("Found at index " + i);
               System.out.println("Plz enter new name");
               names[i] = scanner.nextLine();
           }
        }
        System.out.println("i " + i);


        for (int j = 0; j < names.length; j++) {
            System.out.println(names[j]);
        }*/
        /*int[] nums = {10, 50, 9, 1};
        //System.out.println(nums.length);

        for (int i = 0; i <nums.length ; i++) {
            System.out.println(nums[i]);
        }*/

        /*int number[] = new int[5];

        for (int i = 0; i <number.length ; i++) {
            System.out.println("Plz enter the num");
            number[i] = scanner.nextInt();
        }

        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }*/


       /* System.out.println("Plz enter array size");
        int size = scanner.nextInt();
        int[] nums = new int[size];
        System.out.println(nums.length);

        for (int i = 0; i < nums.length; i++) {

            System.out.println("Plz enter the element");
            nums[i] = scanner.nextInt();
        }


        for (int i = 0; i < nums.length; i++) {

            System.out.println("nums[" + i + "] = " + nums[i]);
        }*/


        //System.out.println(nums[5]);//ArrayIndexOutOfBoundsException
        //System.out.println(nums[-1]);  //ArrayIndexOutOfBoundsException
        /*System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);

        nums[0] = 10;
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        nums[1] = nums[0];
        System.out.println(nums[1]);*/
    }

}
