import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            int a, b;
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);

            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0) break;
            bw.write(a + b + "\n");
        }

        bw.flush();
    }
}