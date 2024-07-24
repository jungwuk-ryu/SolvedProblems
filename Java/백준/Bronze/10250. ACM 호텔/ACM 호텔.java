import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tcc = Integer.parseInt(br.readLine());

        for (int i = 0; i < tcc; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int y = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            boolean top = n % y == 0;
            System.out.printf("%d%02d\n", top ? y : (n % y), top ? (n / y) : (n / y + 1));
        }
 //       bw.flush();
    }
}