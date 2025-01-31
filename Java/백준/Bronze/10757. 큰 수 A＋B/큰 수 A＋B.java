import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        BigInteger bi1 = new BigInteger(st.nextToken());
        BigInteger bi2 = new BigInteger(st.nextToken());

        bw.write(bi1.add(bi2).toString());
        bw.flush();
    }
}