class CharacterCount {
    public static void main(String[]args){

        String text ="My name name is";
        String[] words = text.split("\\W");
        int count,counter = 0,i,j;

        for( i=0;i<= words.length-1;i++){

            count =1;
            for(j= i+1;j<=words.length-1;j++){
                if(words[i].equalsIgnoreCase(words[j])){
                    count++;
                    words[j]="";

                }
            }
            if(count ==1)
                System.out.print(words[i]+" ");
        }

        for(i=0;i<=text.length()-1;i++) {
            if (text.charAt(i) != ' ')
                counter++;
        }
        System.out.print(counter);





    }


}






