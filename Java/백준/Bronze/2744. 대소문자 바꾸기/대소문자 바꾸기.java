import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] chars = new char[101];
        int length = br.read(chars,0, 101);
        char c;
        for (int i = 0; i < length; i++) {
            c = chars[i];
            if (c < 'A' || c > 'z') break;
            bw.write(c > 90 ? c - 32 : c + 32);
        }
        bw.flush();
    }
}