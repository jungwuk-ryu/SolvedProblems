import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine().trim();
        int length = input.length();
        int wordc = 0;
        for (int i = 0; i < length; i++) {
            if (input.charAt(i) == ' ') {
                wordc++;
            }
        }
        if (!input.isEmpty()) {
            wordc++;
        }
        bw.write(Integer.toString(wordc));
        bw.flush();
    }
}