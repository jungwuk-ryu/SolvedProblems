import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int length = str.length();
        int[] nums = new int[length];

        for (int i = 0; i < length; i++) {
            nums[i] = str.charAt(i) - '0';
        }

        for (int i = length - 1; i >= 0; i--) {
            int min = Integer.MAX_VALUE;
            int minIdx = 0;
            for (int j = i; j >= 0; j--) {
                int cur = nums[j];
                if (cur < min) {
                    minIdx = j;
                    min = cur;
                }
            }
            nums[minIdx] = nums[i];
            nums[i] = min;
        }

        for (int i = 0; i < length; i++) {
            bw.write(String.valueOf(nums[i]));
        }
        bw.flush();
    }

}