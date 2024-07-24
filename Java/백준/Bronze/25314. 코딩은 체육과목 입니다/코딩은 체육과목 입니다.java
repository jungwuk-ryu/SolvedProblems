import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int bytes = Integer.parseInt(br.readLine());

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int max = bytes / 4;
        for (int i = 0; i < max; i++) {
            bw.write("long ");
        }
        bw.write("int");
        bw.flush();
        bw.close();
    }
}
