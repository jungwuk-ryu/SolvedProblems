import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();
        double grade = 4 - (line.charAt(0) - 'A');

        if (grade <= 0) bw.write("0.0");
        else {
            int detail = line.charAt(1);
            if (detail == '+') grade += 0.3;
            else if (detail == '-') grade -= 0.3;
            bw.write(Double.toString(grade));
        }

        bw.flush();
    }

}