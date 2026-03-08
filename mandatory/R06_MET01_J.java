//Rule: MET01
//Compliant Version

public class R06_MET01_J {
    public static void main(String[] args) {
        System.out.println(getAbsAdd(-5, 3));
    }

    public static int getAbsAdd(int x, int y) {
        if (x == Integer.MIN_VALUE || y == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Integer.MIN_VALUE not allowed");
        }

        int absX = Math.abs(x);
        int absY = Math.abs(y);

        if (absX > Integer.MAX_VALUE - absY) {
            throw new IllegalArgumentException("Result would overflow");
        }

        return absX + absY;
    }
}