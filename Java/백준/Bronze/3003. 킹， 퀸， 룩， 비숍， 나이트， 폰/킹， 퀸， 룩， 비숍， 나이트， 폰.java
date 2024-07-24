import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[]{1,1,2,2,2,8};

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input);

        for (int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(st.nextToken());
            bw.write(Integer.toString(arr[i] - num) + " ");
        }

        bw.flush();
    }
}