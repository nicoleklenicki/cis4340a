//Rule: LCK09
//Compliant Version

public class R10_LCK09_J {
    private static final Object lock = new Object();

    public static void main(String[] args) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        synchronized (lock) {
            System.out.println("Finished work after blocking call outside lock");
        }
    }
}