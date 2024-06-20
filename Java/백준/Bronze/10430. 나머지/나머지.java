import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int first = ( A + B ) % C;
        int second = (( A % C ) + ( B % C )) % C;
        int third = ( A * B ) % C;
        int fourth = (( A % C ) * ( B % C )) % C;

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
    }
}