import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int a = 0;
        int b = 0;
        while (true) {
            char c = (char) br.read();
            if (c == ' ') {
                a = Integer.parseInt(sb.toString());
                sb.setLength(0);
            } else if (c < '0' || c > '9') {
                b = Integer.parseInt(sb.toString());
                break;
            } else {
                sb.append(c);
            }
        }
        bw.write(Integer.toString(a - b));
        bw.close();
        br.close();
    }
}