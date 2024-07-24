import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] arr = new boolean[31];
        for (int i = 0; i < 28; i++) {
            int student = Integer.parseInt(br.readLine());
            arr[student] = true;
        }

        for (int i = 1; i < 31; i++) {
            if (!arr[i]) {
                bw.write(Integer.toString(i));
                bw.newLine();
            }
        }
        bw.flush();
    }

}