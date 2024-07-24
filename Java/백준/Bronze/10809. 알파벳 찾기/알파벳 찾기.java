import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        for (char c = 'a'; c <= 'z'; c++) {
            int foundIndex = -1;
            int idx = 0;
            for (char cc : input.toCharArray()) {
                if (cc == c) {
                    foundIndex = idx;
                    break;
                }
                idx++;
            }
            bw.write(foundIndex + " ");
        }
        bw.flush();
    }
}