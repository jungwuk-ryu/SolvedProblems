import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input;
        long a;
        Scanner sc = new Scanner(System.in);

        input = sc.nextLine();

        a = Long.parseLong(input) / 10;

        if (a == 10 || a == 9) System.out.println("A");
        else if (a == 8) System.out.println("B");
        else if (a == 7) System.out.println("C");
        else if (a == 6) System.out.println("D");
        else System.out.println("F");
    }
}
