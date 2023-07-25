import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = {10, 50, 70, 5, 9};
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
