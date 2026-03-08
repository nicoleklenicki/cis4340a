//Rule: DCL00
//Compliant Version

public class R01_DCL00_J {
    static class A {
        static int getValue() {
            return 1;
        }
    }

    static class B {
        static int getValue() {
            return A.getValue() + 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(A.getValue());
        System.out.println(B.getValue());
    }
}