import java.util.*;
import java.lang.*;

class Producer extends Thread {

	List<Integer> list;
	int size ;
	public Producer(List<Integer> list,int size) {
		this.list = list;
		this.size=size;
	}
	@Override public void run() {

		try {

			synchronized (list) {

				while (true) {

					if (list.size() == size)
						list.wait();
					else {
						for (int i = 1; i <= size; i++) {

							Thread.sleep(1000);
							list.add(i);
							System.out.println("Added element in list by producer : " + i);
							list.notify();
						}

					}
				}
			}
		} catch (InterruptedException e) {}
	}
}

class consumer extends Thread {

	List<Integer> list;
  int size;
	public consumer(List<Integer> list,int size) {
		this.list = list;
		this.size=size;
	}
	@Override public void run() {

		try {

			synchronized (list) {

				while (true) {

					if (list.size() == 0)
						list.wait();
					else {
						consume();

					}
				}
			}
		} catch (InterruptedException e) {}
	}

	public void consume() throws InterruptedException {

		while (!list.isEmpty()) {

			Thread.sleep(1000);
			System.out.println("removed element from list by consumer : " + list.remove(0));

		}
		System.exit(0);
	}
}
public class TD {

	public static void main(String[] args) throws InterruptedException {

      Scanner sc=new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
        System.out.print(" \n Enter buffer Size :  ");
        int n=sc.nextInt();
        System.out.print("\n");
		Producer producer = new Producer(list,n);
		consumer c = new consumer(list,n);


		producer.start();
		c.start();

	}
}

