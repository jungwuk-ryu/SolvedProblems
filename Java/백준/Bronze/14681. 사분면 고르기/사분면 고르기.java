import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();

        int result = 0;

        if (b < 0) {
            result += 2;
            result += (a < 1) ? 1 : 2;
        } else {
            result += (a > 1) ? 1 : 2;
        }

        System.out.println(result);
    }
}
