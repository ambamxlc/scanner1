import java.util.Scanner;

public class HelloThere {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello there how are you doing today?");
        String response1 = scanner.nextLine();
        String response2 = scanner.nextLine();
        System.out.println("Nice chatting with you! Goodbye!");
        
    }
}
