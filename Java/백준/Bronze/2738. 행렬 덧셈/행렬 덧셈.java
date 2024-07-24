import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int row, column;

        StringTokenizer st = new StringTokenizer(br.readLine());
        column = Integer.parseInt(st.nextToken());
        row = Integer.parseInt(st.nextToken());

        int[] nums = new int[row * column];
        for (int y = 0; y < column * 2; y++) {
            StringTokenizer rowTokenizer = new StringTokenizer(br.readLine());
            for (int i = 0; i < row; i++) {
                int index = row * (y % (column)) + i;
                if (y < column) {
                    nums[index] = Integer.parseInt(rowTokenizer.nextToken());
                } else {
                    bw.write(Integer.toString(nums[index] + Integer.parseInt(rowTokenizer.nextToken())));
                    if (index != row * column - 1) {
                        bw.write(' ');
                    }
                }
            }
            if (y >= column) bw.write('\n');
        }

        bw.flush();
        bw.close();
        br.close();
    }
}