import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String line = br.readLine();
            String[] tokens = line.split(" ");
            int boy = Integer.parseInt(tokens[0]);
            int girl = Integer.parseInt(tokens[1]);

            if (boy == 0 && girl == 0) break;

            bw.write(Integer.toString(boy + girl));
            bw.newLine();
        }

        bw.flush();
    }

}