package Basics;

public class threading {
   // private int count = 1;
    private final int MAX = 10;

    public static void main(String[] args) {
        threading pn = new threading();

        Thread t1 = new OddThread(pn);
        Thread t2 = new EvenThread(pn);

        t1.start();
        t2.start();
    }

    static class OddThread extends Thread {
        threading pn;

        OddThread(threading pn) {
            this.pn = pn;
        }

        public void run() {
            pn.printOdd();
        }
    }

    static class EvenThread extends Thread {
        threading pn;

        EvenThread(threading pn) {
            this.pn = pn;
        }

        public void run() {
            pn.printEven();
        }
    }

    public synchronized void printOdd() {
        for (int count =0; count <= MAX;count++) {
            if (count % 2 == 1) {
                System.out.print(count);
                //count++;
                notify();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        notify(); // Final notify to avoid deadlock
    }

    public synchronized void printEven() {
        for (int count =0; count <= MAX;count++) {
            if (count % 2 == 0) {
                System.out.print(count);
                //count++;
                notify();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        notify(); // Final notify to avoid deadlock
    }
}
