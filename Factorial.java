public class Factorial{
    public static void main(String[]args){
       // int number = 5;
        //int val =1;
        //int i;
        //for(i=1;i<=number;i++)
          // val = val  * i;

        //System.out.println(val);
        int finall =recursivee(6);
        System.out.println(finall);
    }
    public static int recursivee(int x){
        if(x >0){
            return x *(recursivee(x-1));
        }
        else
            return 1;
    }


}