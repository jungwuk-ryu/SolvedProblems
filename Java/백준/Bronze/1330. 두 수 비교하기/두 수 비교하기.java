import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input;
        String[] tokens;
        long a, b;
        Scanner sc = new Scanner(System.in);

        input = sc.nextLine();
        tokens = input.split(" ");

        a = Long.parseLong(tokens[0]);
        b = Long.parseLong(tokens[1]);

        if (a > b) System.out.println(">");
        else if (a < b) System.out.println("<");
        else System.out.println("==");
    }
}
