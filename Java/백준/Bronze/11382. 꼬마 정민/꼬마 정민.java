import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input;
        String[] tokens;
        long a, b, c;
        Scanner sc = new Scanner(System.in);

        input = sc.nextLine();
        tokens = input.split(" ");

        a = Long.parseLong(tokens[0]);
        b = Long.parseLong(tokens[1]);
        c = Long.parseLong(tokens[2]);

        System.out.println(a + b + c);
    }
}
