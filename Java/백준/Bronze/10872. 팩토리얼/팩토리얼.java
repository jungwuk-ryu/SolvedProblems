import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int givenNum = Integer.parseInt(br.readLine());
        long fac = givenNum;

        for (int i = givenNum - 1; i > 0; i--) {
            fac *= i;
        }

        if (fac == 0) fac = 1;
        bw.write(Long.toString(fac));
        bw.flush();
    }

}