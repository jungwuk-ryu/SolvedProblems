import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        int p1, p2, p3, p4;
        
        p1 = (a + b) % c;
        p2 = ((a % c) + (b % c)) % c;
        p3 = (a * b) % c;
        p4 = ((a % c) * (b % c)) % c;
        
        System.out.println(p1 + "\n" + p2 + "\n" + p3 + "\n" + p4);
    }
}
