public class WordsInAString {

        // Method 1
        // To print the unique words
        static void printUniqueWords(String str)
        {
            // Maintaining a count variable
            int count;

            // Extract words from string
            // using split() method
            String[] words = str.split("\\W");

            // Iterating over the words array
            for (int i = 0; i < words.length; i++) {

                // Setting count of current word to one
                count = 1;

                for (int j = i + 1; j < words.length; j++) {
                    if (words[i].equalsIgnoreCase(words[j])) {

                        // If word found later in array
                        // increment the count variable
                        count++;

                        words[j] = " ";
                    }
                }

                // If count of current word is one print it
                if (count == 2 )

                    // Print statement
                    System.out.print(words[i]+" ");
            }
        }

        // Method 2
        // Main driver method
        public static void main(String[] args)
        {
            // Custom input string
            String str = "Welcome to geeks to for geeks";

            // Calling the method 1 to print all unique words
            // in above string passed as argument
            printUniqueWords(str);
        }
    }
