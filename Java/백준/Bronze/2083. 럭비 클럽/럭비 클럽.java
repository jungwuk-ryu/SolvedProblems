import java.io.*;

public class Main {
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String line = br.readLine();
            String[] tokens = line.split(" ");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            int weight = Integer.parseInt(tokens[2]);

            if (name.equals("#") && age == 0 && weight == 0) break;

            String className = JUNIOR;
            if (age > 17 || weight >= 80) className = SENIOR;

            bw.write(name);
            bw.write(' ');
            bw.write(className);
            bw.newLine();
        }

        bw.flush();
    }

}