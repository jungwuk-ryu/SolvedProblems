import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int ret = n / 5;
        int remain = n % 5;

        while (remain % 3 != 0) {
            if (ret <= 0) break;
            ret--;
            remain += 5;
        }

        if (remain % 3 != 0) {
            ret = -1;
        } else {
            ret += remain / 3;
        }

        bw.write(Integer.toString(ret));
        bw.flush();
    }

}