import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class restaurant {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int lines;
        String txt = "";
        int num;
        // drop means waiter brings m plates
        // take m means taking m plates from the table to the washer
        //always drop in stack 2 and pick from 1

        int stack1 = 0;
        int stack2 = 0;
        lines = scan.nextInt();

        do {
            //reset stacks bc it dont matter no more
            stack1 = 0;
            stack2 = 0;
            for (int i = 0; i < lines; i++) {
                txt = scan.next();
                num = scan.nextInt();
                if (txt.equals("TAKE")) {
                    // this if is entered sometimes somehow?
                    // line 20 fix
                    if (stack1 >= num) {
                        stack1 = stack1 - num;
                        bw.write("TAKE 1 " + num );
                    } else {
                        // take what you can
                        if (stack1 > 0) {
                            bw.write("TAKE 1 " + stack1 );
                            num -= stack1;
                            stack1 = 0;
                            bw.write("\n");
                        }
                        // then move and take the rest
                        bw.write("MOVE 2->1 " + stack2 );
                        bw.write("\n");
                        stack1 = stack2;
                        stack2 = 0;
                        bw.write("TAKE 1 " + num );
                        stack1 = stack1 - num;
                    }
                }
                else if (txt.equals(("DROP"))) {
                    stack2 = stack2 + num;
                    bw.write("DROP 2 " + num );
                }
                bw.write("\n");
            }
            lines = scan.nextInt();
            if (lines != 0) {
                bw.write("\n");
            }
        } while (lines != 0);
        bw.flush();
        scan.close();
        return;
    }
}