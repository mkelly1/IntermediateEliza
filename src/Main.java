import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String response;
        boolean quit = true;

        System.out.println("Good day. What is your problem?");
        while(quit){
            System.out.print("Enter your response or 'q' to quit: ");
            response = scan.nextLine().toLowerCase();
            if (response.equalsIgnoreCase("q")) {
                System.out.println("Have a nice day. Ending program.");
                quit = false;
            } else {
                String s1 = response.replaceAll("i ", "you ");
                String s2 = s1.replaceAll("me","you");
                String s3 = s2.replaceAll("my", "your");
                String s4 = s3.replaceAll("am","are");
                System.out.println("Why do you say that " +s4+ "?");
            }
        }
    }
}

