import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            char[] chars = br.readLine().toCharArray();
            boolean lastWasO = chars[0] == 'O';
            int sum = lastWasO ? 1 : 0;
            int strike = sum;

            for (int j = 1; j < chars.length; j++) {
                char c = chars[j];
                if (c == 'O') {
                    strike++;
                    sum += strike;
                } else {
                    strike = 0;
                }
            }

            bw.write(sum + "\n");
        }
        bw.flush();
    }
}