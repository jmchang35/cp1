import javax.management.StringValueExp;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class natjecanje {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int total = scan.nextInt();
        int damaged = scan.nextInt();
        int reserved = scan.nextInt();

        int arr[] = new int[total + 2];
        arr[0] = 0;
        arr[arr.length - 1] = 0;
        for (int i = 1; i < total + 1; i++) {
            arr[i] = 0;
        }
        int team = 0;
        //1 = damaged
        // 0 = not damaged
        for (int i = 0; i < damaged; i++) {
            team = scan.nextInt();
            arr[team] = 1;
        }
        for (int i = 0; i < reserved; i++) {
            team = scan.nextInt();
            if(arr[team] == 1) {
                arr[team] = 0;
            } else if (arr[team -1] == 1) {
                arr[team-1] = 0;
            } else if (arr[team + 1] == 1) {
                arr[team + 1] = 0;
            }

        }
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] ==1) {
                count++;
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();


    }
}
