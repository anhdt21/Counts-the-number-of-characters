import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        countLetters(s);
    }

    private static void countLetters(String s) {
        System.out.print("Number of characters: " + s.length());
    }
}
