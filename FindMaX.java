import java.util.HashMap;
import java.util.Scanner;

public class FindMaX {
	
 String[] word;


	public void findMaxLengthWord(String sentence) {
		// TODO Auto-generated method stub
		
	}
	
	
	public static void main(String[] args) {
		
		
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter a sentence:");
	        String sentence = scanner.nextLine();
	        
	        String longestWord = "";
	        String[] words = sentence.split(" "); // Split the sentence into words
	        
	        for (String word : words) {
	            if (word.length() > longestWord.length()) {
	                longestWord = word; // Update longestWord if current word is longer
	            }
	        }
	        
	        System.out.println("The longest word is: " + longestWord);
	        
	        scanner.close();

		
		
	}
	

}
