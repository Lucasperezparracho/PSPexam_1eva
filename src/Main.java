import java.util.Scanner;

class WordProcessor extends Thread {
    private String text;

    public WordProcessor(String text) {
        this.text = text;
    }

    @Override
    public void run() {
        String[] words = text.split(" +");

        // A) Find the third word
        String thirdWord = words.length >= 3 ? words[2] : "N/A";

        // B) Count the number of letters
        int letterCount = text.replaceAll(" +", "").length();

        // C) Count the number of words
        int wordCount = words.length;

        // D) Find the penultimate word
        String penultimateWord = words.length >= 2 ? words[words.length - 2] : "N/A";

        // E) Show the number of letters and the number of words
        System.out.println("Number of letters: " + letterCount);
        System.out.println("Number of words: " + wordCount);

        // F) Show the third word and the penultimate word
        System.out.println("Third word: " + thirdWord);
        System.out.println("Penultimate word: " + penultimateWord);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a text: ");
        String scannedText = scan.nextLine();
        WordProcessor wordProcessor = new WordProcessor(scannedText);
        wordProcessor.start();
    }
}