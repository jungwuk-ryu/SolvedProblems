import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long l = Long.parseLong(br.readLine());
        long sum = 0;
        long cnt = 0;
        for (int i = 1; i <= l; i++) {
            sum += i;
            cnt++;

            if (sum >= l) {
                if (sum > l) {
                    cnt--;
                }
               break;
            }
        }

        bw.write(Long.toString(cnt));
        bw.flush();
    }

}