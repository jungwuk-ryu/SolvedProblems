import java.io.*;

public class Main {
    static final char[][][] map = new char['z' - 'c' + 1][2][2];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        init();

        String input = br.readLine();
        char[] chars = input.toCharArray();
        int cnt = 0;

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c != 'c' && c != 'd' && c != 'l' && c != 'n' && c != 's' && c != 'z') {
                cnt++;
                continue;
            }

            int key = c - 'c';
            for (int j = 0; j < 2; j++) {
                char[] suffix = map[key][j];
                if (suffix[0] == 0) break;

                boolean eq = true;
                int len = 0;
                for (int k = 0; k < 2; k++) {
                    if (suffix[k] == 0) {
                        break;
                    }

                    int idx = i + k + 1;

                    if (idx >= chars.length || chars[idx] != suffix[k]) {
                        eq = false;
                        break;
                    }

                    len++;
                }

                if (eq) {
                    i += len;
                    break;
                }
            }

            cnt++;
        }

        bw.write(Integer.toString(cnt));
        bw.flush();
    }

    public static void init() {
        String[] values = new String[]{"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        char[] cnt = new char[map.length];

        for (String value : values) {
            char[] chars = value.toCharArray();
            int key = chars[0] - 'c';
            for (int i = 1; i < chars.length; i++) {
                map[key][cnt[key]][i - 1] = chars[i];
            }
            cnt[key]++;
        }
    }

}