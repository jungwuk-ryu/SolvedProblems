import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int sum = 1;
        int cV = 1;
        while (sum < input) {
            ++ cV;
            sum += cV;
        }

        int x, y;
        int diff = sum - input;
        if (cV % 2 == 0) {
            x = cV - diff;
            y = diff + 1;
        } else {
            x = diff + 1;
            y = cV - diff;
        }

        System.out.printf("%d/%d", x, y);
        //sc.close();
    }
}