import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());

            if (i == arr.length - 1) {
                arr[i] = -arr[i];
            }
        }

        int bLen = (int) (Math.log10(arr[1]) + 1);

        bw.write(Integer.toString(arr[0] + arr[1] + arr[2]));
        bw.write('\n');
        bw.write(Integer.toString((int) Math.pow(10, bLen) * arr[0] + arr[1] + arr[2]));
        
        bw.flush();
    }
}