import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int tcc = Integer.parseInt(br.readLine());

        int min = 1000001;
        int max = -1000000;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < tcc; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num > max) max = num;
            if (num < min) min = num;
        }
        bw.write(min + " " + max);
        bw.flush();
    }
}