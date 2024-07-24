import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input;
        long a;
        Scanner sc = new Scanner(System.in);

        input = sc.nextLine();
        a = Long.parseLong(input);

        if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)) System.out.println(1);
        else System.out.println(0);
    }
}
