import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        BigInteger a, b;
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);
        a = new BigInteger(st.nextToken());
        b = new BigInteger(st.nextToken());

        bw.write((a.add(b)).multiply(a.subtract(b)).toString());

        bw.flush();
    }
}