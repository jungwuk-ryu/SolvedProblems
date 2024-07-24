import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String can = br.readLine();
        String cmd = br.readLine();

        bw.write(can.length() >= cmd.length() ? "go" : "no");

        bw.flush();
    }
}