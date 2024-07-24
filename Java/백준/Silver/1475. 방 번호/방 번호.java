import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    static int[] remains = new int[9];
    static int bought = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] roomNum = br.readLine().toCharArray();
        for (char c : roomNum) {
            int num = c - '0';
            if (num == 9) num = 6;

            int remain = remains[num];
            if (remain == 0) buyNewOne();
            remains[num]--;
        }

       bw.write(Integer.toString(bought));
        bw.flush();
    }

    static void buyNewOne() {
        for (int i = 0; i < 9; i++) {
            remains[i]++;
        }
        remains[6]++;
        bought++;
    }
}