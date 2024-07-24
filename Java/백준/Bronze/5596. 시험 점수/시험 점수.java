import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] scores = new int[2];
        for (int i = 0; i < 2; i++) {
            String line = br.readLine();
            String[] tokens = line.split(" ");

           for (String token : tokens) {
               int score = Integer.parseInt(token);
               scores[i] += score;
           }
        }

        if (scores[1] > scores[0]) bw.write(Integer.toString(scores[1]));
        else bw.write(Integer.toString(scores[0]));

        bw.flush();
    }

}