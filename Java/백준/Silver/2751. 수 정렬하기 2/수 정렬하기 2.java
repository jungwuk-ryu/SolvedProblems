import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        boolean[] brr;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int lines = Integer.parseInt(br.readLine());
        final int brrLength = 1000000 + 1000000 + 1;
        brr = new boolean[brrLength];

        for (int i = 0; i < lines; i++) {
            int num = Integer.parseInt(br.readLine()) + 1000000;
            brr[num] = true;
        }

        for (int i = 0; i < brrLength; i++) {
            if (brr[i]) {
                bw.write(i - 1000000 + "\n");
            }
        }

        bw.flush();
    }
}