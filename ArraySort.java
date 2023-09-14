import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args){

        int[][] array = {{11,2,56,7,411,14},{44,5,2}};
        Arrays.sort(array);

        System.out.println(Arrays.deepToString(array));
    }
}
