import java.util.*;
class thread implements Runnable {
    Thread t;
    int a[] = new int[1000];
    int no, sum;

    thread(String s, int n) {
        Random r = new Random();
        t = new Thread(this, s);
        int j = 0;
        no = n;
        for (int i = 0; i < 100; i++) {
            a[i] = r.nextInt(100);
            j++;
        }
        t.start();
    }
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.print(a[no] + " ");
                sum = sum + a[no];
                no++;
            }
            System.out.println("");
            System.out.println("SUM: " + sum);
            System.out.println("AVG: " + sum / 10);
            System.out.println("");
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

}

class b1 {

    public static void main(String arg[]) {
        try {
            thread t1 = new thread("t1", 1);
            t1.t.join();

            thread t2 = new thread("t2", 10);
            t2.t.join();

            thread t3 = new thread("t3", 20);
            t3.t.join();

            thread t4 = new thread("t4", 30);
            t4.t.join();

            thread t5 = new thread("t5", 40);
            t5.t.join();

            thread t6 = new thread("t6", 50);
            t6.t.join();

            thread t7 = new thread("t7", 60);
            t7.t.join();

            thread t8 = new thread("t8", 70);
            t8.t.join();

            thread t9 = new thread("t9", 80);
            t9.t.join();

            thread t10 = new thread("t10", 90);
            t10.t.join();
        }
        catch (Exception e) {
            e.printStackTrace();
        }	
    }
}
