import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;
        int hour, min;
        String input1;
        String[] tokens;
        int time2sec = 0;
        Scanner sc = new Scanner(System.in);

        input1 = sc.nextLine();
        tokens = input1.split(" ");

        a = Integer.parseInt(tokens[0]);
        b = Integer.parseInt(tokens[1]);
        c = sc.nextInt();

        time2sec = a * 60 + b;
        time2sec += c;
        time2sec %= (60 * 24);

        hour = time2sec / 60;
        min = time2sec % 60;

        System.out.println(hour + " " + min);
    }
}
