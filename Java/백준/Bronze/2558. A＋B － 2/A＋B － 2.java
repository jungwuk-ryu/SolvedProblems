import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a, b;

        a = br.read() - 48;
        br.read();
        b = br.read() - 48;

        bw.write(Integer.toString(a + b));
        bw.flush();
        bw.close();
        br.close();
    }
}
