import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] wordChars = new char[0];
        int wordCount = Integer.parseInt(br.readLine());
        for (int i = 0; i < wordCount; i++) {
            char[] word = br.readLine().toCharArray();
            if (i == 0) {
                wordChars = word;
                continue;
            }

            for (int j = 0; j < wordChars.length; j++) {
                if (word[j] != wordChars[j]) wordChars[j] = '?';
            }
        }

        bw.write(wordChars);
        bw.flush();
    }
}