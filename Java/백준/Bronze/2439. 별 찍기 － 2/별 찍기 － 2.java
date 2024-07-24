import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long count = Integer.parseInt(br.readLine());

        for (long i = 1; i <= count; i++) {
            for (long l = 0; l < count - i; l++) {
                bw.write(' ');
            }
            for (long l = 1; l <= i; l++) {
                bw.write('*');
            }
            bw.write('\n');
        }

        bw.flush();
    }
}
