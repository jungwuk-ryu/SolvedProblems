import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    static char[] docChars;
    static char[] wordChars;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        docChars = br.readLine().toCharArray();
        wordChars = br.readLine().toCharArray();
        int lastIndex = docChars.length - wordChars.length + 1;
        int maxCount = 0;

        for (int i = 0; i < lastIndex; i++) {
            int found = test(i);
            if (maxCount < found) maxCount = found;
        }

        bw.write(Integer.toString(maxCount));
        bw.flush();
    }

    static int test(int startIdx) {
        int wordIndex = 0;
        int foundCount = 0;
        for (int i = startIdx; i < docChars.length; i++) {
            if (wordChars[wordIndex] == docChars[i]) {
                wordIndex++;
                if (wordIndex == wordChars.length) {
                    foundCount++;
                    wordIndex = 0;
                }
            } else {
                if (wordIndex != 0) wordIndex = 0;
                if (wordChars[wordIndex] == docChars[i]) {
                    wordIndex++;
                    if (wordIndex == wordChars.length) {
                        foundCount++;
                        wordIndex = 0;
                    }
                }
            }
        }

        return foundCount;
    }
}