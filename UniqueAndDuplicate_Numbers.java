public class UniqueAndDuplicate_Numbers {
    public static void main(String[] arguments){
        int i;
        int j;
        int[] array = {7,5,5,4,1,1};

        for (i = 0; i < array.length; i++) {
            for (j = 0; j < i; j++) {
                if (array[i] == array[j])
                    break;
            }
                if (i == j)  // if condition
                    System.out.print(array[i] + " ");

        }

    }
}



