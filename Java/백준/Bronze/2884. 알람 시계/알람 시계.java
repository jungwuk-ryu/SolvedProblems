import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b;
        int hour, min;
        String input;
        String[] tokens;
        int time2sec = 0;
        Scanner sc = new Scanner(System.in);

        input = sc.nextLine();
        tokens = input.split(" ");

        a = Integer.parseInt(tokens[0]);
        b = Integer.parseInt(tokens[1]);

        time2sec = a * 60 + b;
        time2sec -= 45;

        hour = time2sec / 60;
        min = time2sec % 60;

        if (min < 0) {
            hour = 23;
            min += 60;
        }

        System.out.println(hour + " " + min);
    }
}
