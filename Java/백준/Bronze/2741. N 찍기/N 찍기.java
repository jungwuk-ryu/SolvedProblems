import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(br.readLine());
        
        for (int i = 1; i <= a; i++) {
            sb.append(i);
            if (i != a) sb.append('\n');
        }
        
        bw.write(sb.toString());
        bw.flush();
    }
}