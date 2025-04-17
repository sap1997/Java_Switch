// Case 1
// Java Program to illustrate Creation and execution of
// thread via start() and run() method in Single inheritance



// Class 3
// Main Class
class Multithreading {

    // Main method
    public static void main(String[] args)
    {

        // Creating a thread object of our thread class
       thread1 obj1 = new thread1();
        MyThread2 obj2 = new MyThread2();

        // Getting the threads to the run state

        // This thread will transcend from runnable to run
        // as start() method will look for run() and execute
        // it
        obj1.start();

        // This thread will also transcend from runnable to
        // run as start() method will look for run() and
        // execute it
        obj2.start();
    }
}