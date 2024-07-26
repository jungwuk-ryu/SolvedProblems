import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashSet<String>[] setArrByStringLength = new HashSet[50];
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            int arrIdx = str.length() - 1;

            HashSet<String> set = setArrByStringLength[arrIdx];
            if (set == null) set = new HashSet<>();
            set.add(str);
            setArrByStringLength[arrIdx] = set;
        }

        for (HashSet<String> set : setArrByStringLength) {
            if (set == null) continue;
            
            String[] arr = set.toArray(new String[0]);
            Arrays.sort(arr);

            for (String str : arr) {
                bw.write(str);
                bw.newLine();
            }
        }

        bw.flush();
    }

}