import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int max = -1;
        char mac = '!';
        boolean hasOther = false;
        HashMap<Character, Integer> hm = new HashMap<>();

        for (char c : input.toCharArray()) {
            if (c > 'Z') c -= 'a' - 'A';
            hm.put(c, hm.getOrDefault(c, 0) + 1);
            int count = hm.get(c);
            if (count > max) {
                max = count;
                mac = c;
                hasOther = false;
            }
            else if (count == max) hasOther = true;
        }
        bw.write(hasOther ? '?' : mac);
        bw.flush();
    }
}