import java.util.Scanner;

public class VariableInputs {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string of text");
        String textString = scanner.nextLine();
        System.out.println("Enter a integer");
        Integer num = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter a double");
        Double decimalNum = Double.valueOf(scanner.nextLine());
        System.out.println("Enter a boolean");
        Boolean trueFalse = Boolean.valueOf(scanner.nextLine());
        System.out.println("Your string is " + textString);
        System.out.println("Your integer is " + num);
        System.out.println("Your double is " + decimalNum);
        System.out.println("Your boolean is " + trueFalse);
    }
}
