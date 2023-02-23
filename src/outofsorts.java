import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class outofsorts {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = scan.nextInt();
        int m = scan.nextInt();
        int a = scan.nextInt();
        int c = scan.nextInt();
        int x0 = scan.nextInt();
        int num = x0;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            num = (a * num + c) % m;
            arr[i] = num;
        }


    }
}
