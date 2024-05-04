import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Read from standard input a sentence,
        //Then prints the count of the words that starts with a vowel litters,
        //Each word that does not start with a vowel should be skipped and an error message.

        Scanner vowel = new Scanner(System.in);
        String line = vowel.nextLine();
        int vowelCount = 0;
        String[] vowelWords = line.split(" ");
        System.out.println("Please inter a phrase to be counted");

        for (String word : vowelWords) {
            if (word.startsWith("a")  ||
                word.startsWith("e")  ||
                word.startsWith("i")  ||
                word.startsWith("o")  ||
                word.startsWith("u") )
                {
                    vowelCount++;
                }
            else {
                System.out.println("Not a vowel litter" + word);
                }
        }

        System.out.println("vowelWords: " + vowelCount);

        vowel.close();

    }
}