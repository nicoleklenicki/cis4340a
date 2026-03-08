//Rule: THI00

public class R11_THI00_J {

    static class MyThread extends Thread {
        public void run() {
            System.out.println("Thread running");
        }
    }

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.run();   // WRONG: calling run() directly
    }
}
