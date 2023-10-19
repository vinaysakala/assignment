import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = sc.nextLine();
        boolean[] mark = new boolean[26];
        int index = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if ('A' <= inputString.charAt(i) && inputString.charAt(i) <= 'Z') {
                index = inputString.charAt(i) - 'A';
            } else if ('a' <= inputString.charAt(i) && inputString.charAt(i) <= 'z') {
                index = inputString.charAt(i) - 'a';
            }
            mark[index] = true;
        }
        boolean pangram = true;
        for (int i = 0; i < 26; i++) {
            if (mark[i] == false) {
                pangram = false;
                break;
            }
        }
        if (pangram == true)
            System.out.println("The given string is a pangram.");
        else
            System.out.println("The given string is not a pangram.");
    }
}