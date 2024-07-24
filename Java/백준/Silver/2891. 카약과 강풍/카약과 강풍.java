import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        StringTokenizer st = new StringTokenizer(br.readLine());
        HashSet<Integer> broken = new HashSet<>();
        HashSet<Integer> hasNew = new HashSet<>();

        int n = Integer.parseInt(st.nextToken());
        int brokenCount = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < brokenCount; i++) {
            broken.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < r; i++) {
            int team = Integer.parseInt(st.nextToken());
            if (!broken.contains(team)) {
                hasNew.add(team);
            } else {
                broken.remove(team);
            }
        }

        int fail = 0;
        for (Integer i : broken) {
            if (hasNew.contains(i - 1)) {
                hasNew.remove(i - 1);
                continue;
            }
            if (hasNew.contains(i + 1)) {
                hasNew.remove(i + 1);
                continue;
            }
            fail++;
        }

        bw.write(Integer.toString(fail));
        bw.flush();
    }
}