package org.example;
import java.util.Scanner;


public class CharacterCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        System.out.print("Enter a character to count in the string: ");
        char targetChar = scanner.nextLine().charAt(0);

        int count = countOccurrences(userInput.toCharArray(), targetChar);
        System.out.println("The character '" + targetChar + "' appears " + count + " times in the string.");
    }

    public static int countOccurrencesInString(String userInput, char targetChar) {
        return countOccurrences(userInput.toCharArray(), targetChar);
    }

    public static int countOccurrences(char[] array, char target) {
        int count = 0;
        for (char c : array) {
            if (c == target) {
                count++;
            }
        }
        return count;
    }


}