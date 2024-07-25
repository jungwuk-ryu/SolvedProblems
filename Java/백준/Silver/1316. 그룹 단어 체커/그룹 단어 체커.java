import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashSet<Character> set = new HashSet<>();
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            char[] chars = s.toCharArray();

            char c = 0;
            for (char tmp : chars) {
                if (c == tmp) continue;
                c = tmp;

                if (set.contains(c)) {
                    cnt++;
                    break;
                } else {
                    set.add(c);
                }
            }

            set.clear();
        }

        bw.write(Integer.toString(n - cnt));
        bw.flush();
    }

}