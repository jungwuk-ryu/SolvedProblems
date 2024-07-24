import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int diff = 'a' - 'A';
        char[] chars = new char[] {'a', 'e', 'i', 'o', 'u'};

        while (true) {
            String input = br.readLine();
            if (input.equals("#")) break;

            int cnt = 0;
            for (char c : input.toCharArray()) {
                for (int i = 0; i < chars.length; i++) {
                    int cc = chars[i];
                    if (c == cc || c == cc - diff) cnt++;
                }
            }

            bw.write(cnt + "\n");
        }

        bw.flush();
    }
}