import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        final int tcc = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0;

        for (int i = 0; i < tcc; i++) {
            int num = Integer.parseInt(st.nextToken());
            boolean isPrime = num != 1;
            for (int j = 2; j < num; j++) {
                if (j * 2 > num) break;
                if (num % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                sum ++;
            }
        }
        bw.write(Integer.toString(sum));
        bw.flush();
    }
}