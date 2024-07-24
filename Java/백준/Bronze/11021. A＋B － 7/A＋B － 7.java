import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long count = Integer.parseInt(br.readLine());

        for (long i = 1; i <= count; i++) {
            String line = br.readLine();
            StringTokenizer st = new StringTokenizer(line);
            int a, b;
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            bw.write("Case #");
            bw.write(Long.toString(i));
            bw.write(": ");
            bw.write(Integer.toString(a + b));
            bw.write("\n");
        }

        bw.flush();
    }
}