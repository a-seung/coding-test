import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        int num3 = Integer.parseInt(st.nextToken());

        if (num1 == num2 & num2 == num3) {
            int A = 10000 + num1 * 1000;
            System.out.println(A);
        } else if (num1 == num2 || num2 == num3) {
            int B = 1000 + num2 * 100;
            System.out.println(B);
        } else if (num1 == num3) {
            int C = 1000 + num1 * 100;
            System.out.println(C);
        } else {
            int D = Math.max(num1, Math.max(num2, num3));
            int E = D * 100;
            System.out.println(E);
        }
    }
}
