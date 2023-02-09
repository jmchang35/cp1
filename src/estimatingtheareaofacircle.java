import java.io.*;
import java.io.BufferedReader;
import java.lang.Math;

public class estimatingtheareaofacircle {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String txt = "";

        while (txt != null) {
            txt = bfr.readLine();
            String[] split = txt.split(" ");
            double radius = Double.parseDouble(split[0]);
            int totalMarked = Integer.parseInt(split[1]);
            int marked = Integer.parseInt(split[2]);
            double frac = marked / totalMarked;

            double estimatedRadius = radius * frac;
            System.out.println(Math.PI * radius * radius + " " + frac * 4 * radius * radius);

        }


    }
}