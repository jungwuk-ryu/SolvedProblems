import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int idx  = Integer.parseInt(br.readLine()) - 1;
        bw.write(str.charAt(idx));
        bw.flush();
    }
}