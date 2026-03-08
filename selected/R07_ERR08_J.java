//Rule: ERR08
//Compliant Version

public class R07_ERR08_J {
    public static void main(String[] args) {
        String input = null;

        if (input != null) {
            System.out.println(input.length());
        } else {
            System.out.println("Input was null");
        }
    }
}