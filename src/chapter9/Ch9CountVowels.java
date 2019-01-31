package chapter9;

import java.util.Scanner;

public class Ch9CountVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?: ");
        String name = scanner.next();
        System.out.println(vowelCount(name));
    }

    public static int vowelCount(String nameInput) {
        int vowelCount = 0;
        for (int i = 0; i < nameInput.length(); i++) {
            char letter = nameInput.toUpperCase().charAt(i);
            // if (letter == 'a' || letter == 'A' || letter == 'e' || letter == 'E' ||
            // letter == 'i' || letter == 'I'
            // || letter == 'o' || letter == 'O' || letter == 'U' || letter == 'u') {
            // Looking for vowels. Shorten code to toUpperCase() on nameInput.
            if (letter == 'A' || letter == 'E' || letter == 'I'
                    || letter == 'O' || letter == 'U') {
                vowelCount++;
            }
        }
        return vowelCount;
    }
}
