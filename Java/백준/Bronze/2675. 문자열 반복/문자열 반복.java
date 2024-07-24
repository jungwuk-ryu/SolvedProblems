import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        int tcc = Integer.parseInt(br.readLine());

        for (int i = 0; i < tcc; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int rpc = Integer.parseInt(st.nextToken());
            char[] chars = st.nextToken().toCharArray();

            for (char c : chars) {
                for (int j = 0; j < rpc; j++) {
                    sb.append(c);
                }
            }
            sb.append('\n');
        }
        bw.write(sb.toString());
        bw.flush();
    }
}