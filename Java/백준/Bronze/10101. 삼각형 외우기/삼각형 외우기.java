import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            int num = Integer.parseInt(br.readLine());
            set.add(num);
            sum += num;
        }

        int setSize = set.size();
        String ret;

        if (sum != 180) {
            ret = "Error";
        } else if (setSize == 1) {
            ret = "Equilateral";
        } else if (setSize == 2) {
            ret = "Isosceles";
        } else {
            ret = "Scalene";
        }

        bw.write(ret);
        bw.flush();
    }

}