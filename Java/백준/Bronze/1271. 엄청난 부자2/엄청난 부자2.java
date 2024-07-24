import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BigDecimal a, b;

        StringTokenizer st = new StringTokenizer(br.readLine());
        a = new BigDecimal(st.nextToken());
        b = new BigDecimal(st.nextToken());

        BigDecimal divide = a.divide(b, RoundingMode.FLOOR);
        bw.write(divide.toString());
        bw.write('\n');
        bw.write(a.subtract(divide.multiply(b)).toString());
        bw.flush();
    }
}
