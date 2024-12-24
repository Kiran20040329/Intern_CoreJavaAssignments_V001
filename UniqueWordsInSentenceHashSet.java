package Interns_CoreJavaAssignments_V001;

import java.util.*;
public class UniqueWordsInSentenceHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner for user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a sentence
        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Split the sentence into words and store them in a HashSet
        HashSet<String> uniqueWords = new HashSet<>();
        String[] words = sentence.split("\\s+"); // Split by spaces

        for (String word : words) {
            // Remove punctuation and add to the set
            uniqueWords.add(word.replaceAll("[^a-zA-Z]", "").toLowerCase());
        }

        // Display the unique words
        System.out.println("Unique words: " + uniqueWords);
    
	}

}
