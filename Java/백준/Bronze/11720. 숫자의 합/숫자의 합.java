import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        br.readLine();
        int sum = 0;
        char[] chars = br.readLine().toCharArray();
        for (char c : chars) {
            sum += c - '0';
        }

        bw.write(sum + "");
        bw.flush();
    }
}