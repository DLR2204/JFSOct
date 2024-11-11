package string;

public class MultiThreadingEx implements Runnable {

	@Override
	public void run() {

		for (int i = 1; i < 11; i++) {

			System.out.println(i + ".Child Thread");
		}

	}

	public static void main(String[] args) {

		MultiThreadingEx obj = new MultiThreadingEx();

		Thread thread = new Thread(obj);
		
		thread.start();   //run method calling

		for (int i = 11; i < 21; i++) {
			System.out.println(i + ".Main Thread");
		}

	}

}
