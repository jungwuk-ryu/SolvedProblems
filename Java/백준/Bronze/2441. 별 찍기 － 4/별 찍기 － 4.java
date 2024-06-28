import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder(n*n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                sb.append(' ');
            }

            for (int j = 0; j < n - i; j++) {
                sb.append('*');
            }

            sb.append('\n');
        }

        bw.write(sb.toString());
        bw.flush();
    }
}