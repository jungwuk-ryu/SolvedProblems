import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String[] lines = new String[count];

        for (int i = 0; i < count; i++) {
            lines[i] = br.readLine();
        }

        for (int i = 0; i < count; i++) {
            String line = lines[i];
            StringTokenizer st = new StringTokenizer(line);
            int a, b;
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            System.out.println(a + b);
        }
    }
}
