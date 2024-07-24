import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long total = 0;
        long givenPrice = Integer.parseInt(br.readLine());
        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);
            int a, b;

            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            total += (long) a * b;
        }

        System.out.println((total == givenPrice) ? "Yes" : "No");
    }
}
