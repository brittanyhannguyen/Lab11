import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String personName;
        String personAge;
        String personFrom;

        System.out.print("Hello. What is your name? ");
        personName = scnr.next();

        System.out.print("It's nice to meet you, " + personName + ". How old are you? ");
        personAge = scnr.next();

        System.out.println("I see that you are still quite young at only " + personAge + ".");
        System.out.print("Where do you live? ");
        personFrom = scnr.next();

        System.out.println("Wow! I've always wanted to go to " + personFrom + ". Thanks for chatting with me. Bye!");

    }
}
