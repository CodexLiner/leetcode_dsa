import java.util.*;


public class Main {
    public static void main(String[] args) {
        String n = "32";
        int res = 0;
        for (int i = 0; i < n.length(); ++i) {
            res = Math.max(res, n.charAt(i) - '0');
            System.out.println(res);
        }

    }
}