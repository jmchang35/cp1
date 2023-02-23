import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class weightofwords {

//    public static String calc(int length, int weight, String word) {
//        if (0 == weight) {
//            return word;
//        }
//        if (weight == )
//
//
//        calc(length, weight, word);
//        return word;
//    }

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int length = scan.nextInt();
        int weight = scan.nextInt();
        int newweight = 0;
        // 'a' = 65
        int sub = 96;

        String word = "";
        if (weight < length || weight > length * 26) {
            System.out.println("impossible");
        }
        while (weight > 42) {
            word = word + 'z';
            length -= 1;
            weight -= 26;
        }
        int rest = weight / length;
        rest += sub;
        char c = (char) rest;

        for (int i = 0; i < length - 1; i++) {
            word = word + c;
            weight -= (int) c - sub;
        }
        c = (char) (weight + sub);
        word = word + c;
        System.out.println(word);



//        word = calc(length, weight, word);

        }


//    }
}
