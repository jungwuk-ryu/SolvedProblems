import java.io.*;

public class Main {
    static final int MAX = 10000;
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] arr = new boolean[MAX];
        for (int i = 1; i < MAX; i++) {
            int num = i;
            while (true) {
                int sum = num;
                while (num > 0) {
                    sum += num % 10;
                    num /= 10;
                }

                num = sum;
                if (num > MAX) break;
                arr[num - 1] = true;
            }
        }

        for (int i = 0; i < MAX; i++) {
            if (arr[i]) continue;
            bw.write(Integer.toString(i + 1));
            bw.newLine();
        }
        bw.flush();
    }

}