import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[][] arr = new boolean[100][100];

        int n = Integer.parseInt(br.readLine());
        int area = 0;
        for (int i = 0; i < n; i++) {
            String[] tokens = br.readLine().split(" ");
            int sx = Integer.parseInt(tokens[0]);
            int sy = Integer.parseInt(tokens[1]);

            for (int x = 0; x < 10; x++) {
                for (int y = 0; y < 10; y++) {
                    if (!arr[sx + x][sy + y]) {
                        arr[sx + x][sy + y] =true;
                        area++;
                    }
                }
            }
        }

        bw.write(Integer.toString(area));
        bw.flush();
    }

}