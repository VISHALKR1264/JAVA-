import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.*;
public class wordfreq {

    // Method to capitalize the first letter of a word
    public static String capitalizeFirstLetter(String word) {
        if (word == null || word.isEmpty()) {
            return word;
        }
        return word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
    }

    // Method to count word frequency
    public static void countWordFrequency(String input) {
        // LinkedHashMap to maintain insertion order
       Map <String,Integer> wordCountMap =new HashMap<>();

        // Split the input string by spaces to get the words
        String[] words = input.split(" ");
        for(int i=0;i<words.length;i++)
        {

            System.out.println(words[i]);
        }
        // Traverse through each word
        for (String word : words) {
            // Convert the word to lowercase to count case-insensitively
            String lowerCaseWord = word.toLowerCase();

            // Add the word to the map or update its frequency
            wordCountMap.put(lowerCaseWord,wordCountMap.getOrDefault(lowerCaseWord,0)+1);
        }


        // Display the word frequency
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            String capitalizedWord = capitalizeFirstLetter(entry.getKey());
            System.out.println(capitalizedWord + " " + entry.getValue());
        }
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
            
        System.out.print("Enter a space-separated string of words: ");
        String input = sc.nextLine();
        
        countWordFrequency(input);

        sc.close();
    }
}