import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();

        int[] ps = new int[4];

        ps[3] = a * b;
        for (int i = 0; i < 3; i ++) {
            int l = b % 10;
            b /= 10;

            ps[i] = a * l;
        }

        System.out.println(ps[0] + "\n" + ps[1] + "\n" + ps[2] + "\n" + ps[3]);
    }
}
