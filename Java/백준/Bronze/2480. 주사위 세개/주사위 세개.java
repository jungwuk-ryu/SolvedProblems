import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int answer;
        int[] nums = new int[3];
        Scanner sc = new Scanner(System.in);

        int max = 0;
        int sameCount = 0;
        int sameNumber = 0;
        for (int i = 0; i < 3; i++) {
            int nc = sc.nextInt();
            nums[i] = nc;
            if (nc > max) {
                max = nc;
            }


            for (int l = i - 1; l >= 0; l--) {
                if (nc == nums[l]) {
                    sameCount++;
                    sameNumber = nc;
                }
            }

        }

        if (sameCount == 0) {
            answer = max * 100;
        } else if (sameCount == 1) {
            answer = 1000 + sameNumber * 100;
        } else {
            answer = 10000 + nums[0] * 1000;
        }

        System.out.println(answer);
    }
}
