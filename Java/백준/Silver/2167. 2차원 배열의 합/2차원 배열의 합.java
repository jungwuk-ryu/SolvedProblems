import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int arrarr[][];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int y = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        arrarr = new int[y][x];

        for(int i = 0; i < y; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < x; j++) {
                int num = Integer.parseInt(st.nextToken());
                arrarr[i][j] = num;
            }
        }

        StringBuilder sb = new StringBuilder();
        int lineLength = Integer.parseInt(br.readLine());
        for (int i = 0; i < lineLength; i++) {
            st = new StringTokenizer(br.readLine());
            int x1, x2, y1, y2;
            y1 = Integer.parseInt(st.nextToken());
            x1 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());
            x2 = Integer.parseInt(st.nextToken());
            
            int sum = 0;
            for (int yy = y1 - 1; yy < y2; yy++) {
                for (int xx = x1 - 1; xx < x2; xx++) {
                    sum += arrarr[yy][xx];
                }
            }
            sb.append(sum).append('\n');
        }
        bw.write(sb.toString());
        bw.flush();
    }
}