//Rule: ERR08

public class R07_ERR08_J {
    public static void main(String[] args) {
        String input = null;

        try {
            System.out.println(input.length());
        } catch (NullPointerException e) {
            System.out.println("Null pointer caught");
        }
    }
}