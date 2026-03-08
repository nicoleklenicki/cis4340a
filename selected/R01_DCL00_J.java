//Rule: DCL00

public class R01_DCL00_J {
    static class A {
        static int value = B.value + 1;
    }

    static class B {
        static int value = A.value + 1;
    }

    public static void main(String[] args) {
        System.out.println(A.value);
        System.out.println(B.value);
    }
}