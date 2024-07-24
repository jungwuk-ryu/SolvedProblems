import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("     /~\\\n" +
                "    ( oo|\n" +
                "    _\\=/_\n" +
                "   /  _  \\\n" +
                "  //|/.\\|\\\\\n" +
                " ||  \\ /  ||\n" +
                "============\n" +
                "|          |\n" +
                "|          |\n" +
                "|          |");

        bw.flush();
    }
}