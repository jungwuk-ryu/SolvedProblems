import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int r1, s;
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        r1 = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());

        int r2 = (s * 2) - r1;
        bw.write(Integer.toString(r2));
        bw.flush();
    }
}