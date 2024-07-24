import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int pcpa = Integer.parseInt(st.nextToken());
        int area = Integer.parseInt(st.nextToken());
        int rst = pcpa * area;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 5; i++) {
            int realCount = Integer.parseInt(st.nextToken());
            bw.write((realCount - rst) + " ");
        }

        bw.flush();
    }
}