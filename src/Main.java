import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String response;
        boolean quit = true;

        System.out.println("Good day. What is your problem?");
        while(quit){
            System.out.print("Enter your response or 'q' to quit: ");
            response = scan.nextLine();
            if (response.equalsIgnoreCase("q")) {
                System.out.println("Have a nice day. Ending program.");
                quit = false;
            } else {
                System.out.println(response + "?");
            }
        }
    }
}

