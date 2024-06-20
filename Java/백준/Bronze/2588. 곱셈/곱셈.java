import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st2.nextToken());

        int C = A * (B % 10);
        int D = A * ((B / 10) % 10);
        int E = A * (B / 100);
        int F = C + (10 * D) + (100 * E);

        System.out.println(C);
        System.out.println(D);
        System.out.println(E);
        System.out.println(F);
    }
}