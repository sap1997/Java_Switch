public class Threadoddeven {
    private int counter = 1;
    private final int MAX = 10;

    public static void main(String[] args) {
        Threadoddeven obj = new Threadoddeven();

        Thread t1 = new EvenThread(obj);
        Thread t2 = new OddThread(obj);
        t1.start();
        t2.start();
    }

    static class EvenThread extends Thread {
        Threadoddeven obj;

        EvenThread(Threadoddeven obj) {
            this.obj = obj;
        }

        public void run() {
            obj.printEven();
        }
    }

    static class OddThread extends Thread {
        Threadoddeven obj;

        OddThread(Threadoddeven obj) {
            this.obj = obj;
        }

        public void run() {
            obj.printOdd();
        }
    }

    public synchronized void printEven() {
        while (counter <= MAX) {
            if (counter % 2 == 0) {
                System.out.println("Even: " + counter);
                counter++;
                notify();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
       // notify(); // to release odd thread if waiting at the end
    }

    public synchronized void printOdd() {
        while (counter <= MAX) {
            if (counter % 2 != 0) {
                System.out.println("Odd : " + counter);
                counter++;
                notify();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    //    notify(); // to release even thread if waiting at the end
    }
}
