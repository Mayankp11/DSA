public class SelectionSort {
    public static void selectionSort(int[] values){     //23,6,4,2,19,18,3
        for (int i=0; i<values.length-1 ;i++){
            int storeNumber = i;
            for(int j=i+1; j< values.length;j++){
                if(values[storeNumber] > values[j]){
                    storeNumber = j;
                }
            }
            int smallestNumber = values[storeNumber];
            values[storeNumber] = values[i];
            values[i]= smallestNumber;

        }
    }

    public static void main(String[] args){
        int[] values = {12,2,44,6,18,4};
        for(int i=0;i< values.length;i++){
            System.out.print(values[i]+" ");
        }
        System.out.println();
        selectionSort(values);
        for(int i:values) {
            System.out.print(i+" ");
        }
    }
}
