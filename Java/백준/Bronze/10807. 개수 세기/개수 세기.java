import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        br.readLine();
        String[] numbers = br.readLine().split(" ");
        String target = br.readLine();

        int count = 0;
        for (String str : numbers) {
            if (str.equals(target)) count++;
        }


        bw.write(Integer.toString(count));
        bw.flush();
    }

}