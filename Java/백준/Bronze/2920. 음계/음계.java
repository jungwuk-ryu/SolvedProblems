import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] chars = br.readLine().toCharArray();
        boolean asce = chars[0] < chars[2];
        boolean mixed = (!(!asce && chars[0] > chars[2]) && !asce);
        if (mixed) {
            bw.write("mixed!");
            bw.flush();
            return;
        }
        char pre = chars[2];
        for (int i = 4; i <= 2 * (8 - 1); i+=2) {
            char c = chars[i];
            if ((asce && pre > c) || (!asce && pre < c)) {
                bw.write("mixed");
                bw.flush();
                return;
            }
            pre = c;
        }
        bw.write(asce ? "ascending" : "descending");
        bw.flush();
    }
}