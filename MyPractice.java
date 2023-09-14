import java.util.Scanner;

public class MyPractice {
//If an array of numbers has
    private static boolean checkDuplicate(int[] nums) {

        if (nums == null || nums.length == 0) return false;

        for (int i=0; i< nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of values you want to enter: ");
        int x = obj.nextInt();

        int[] nums1 = new int[x];
        System.out.print("Enter the elements of the array: ");
        for(int i=0; i<x; i++)
        {
         //reading array elements from the user
            nums1[i]=obj.nextInt();
        }
        for(int i=0;i<x;i++)
            System.out.print(nums1[i]+" ");

        if(checkDuplicate(nums1))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
