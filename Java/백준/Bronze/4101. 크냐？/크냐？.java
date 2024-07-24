import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;
        while (true) {
            line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);
            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());

            if (n1 == 0 && n2 == n1) break;
            bw.write(n1 > n2 ? "Yes\n" : "No\n");
        }

        bw.flush();
    }
}