import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a, b;
        a = new BigInteger(sc.next());
        b = new BigInteger(sc.next());

        System.out.printf("%s\n%s\n%s", a.add(b), a.subtract(b), a.multiply(b));
    }
}
