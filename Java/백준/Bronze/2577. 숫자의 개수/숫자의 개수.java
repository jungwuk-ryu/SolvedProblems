import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int rst = a * b * c;
        String sRst = Integer.toString(rst);
        int[] numCountArr = new int[10];

        while(true) {
            int num = rst % 10;
            numCountArr[num] ++;
            rst /= 10;
            if (rst == 0) break;
        }

        for (int i = 0; i < 10; i ++) {
            bw.write(numCountArr[i] + "\n");
        }
        bw.flush();
    }
}