import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Select stack implementation: arraylist, vector, list");
        String stackType = input.nextLine();

        String listType = "";
        if (stackType.equalsIgnoreCase("list")) {
            System.out.println("Select list type: single, double");
            listType = input.nextLine();
        }

        StackFactory.configure(stackType, listType);

        Calc calculator = Calculator.getInstance();

        Scanner file = new Scanner(new File("\"C:\\Users\\jsanc\\Downloads\\HJT4 prueba\\HJT4 prueba\\Datos.txt\""));

        while (file.hasNextLine()) {
            String line = file.nextLine().trim();
            if (!line.isEmpty()) {
                String postfix = calculator.infixToPostfix(line);
                int result = calculator.evaluatePostfix(postfix);
                System.out.println("Infix: " + line);
                System.out.println("Postfix: " + postfix);
                System.out.println("Result: " + result);
                System.out.println();
            }
        }

        file.close();
        input.close();
    }
}