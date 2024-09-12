import java.util.Arrays;

public class Printer {
    public static void main(String args[]) {
        String[] s = new String[]{"a", "ac"};

        System.out.println(Arrays.stream(s).filter(x->s[0]!=x).toList());
    }
}
