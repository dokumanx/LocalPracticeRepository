
public class newThread extends Thread{

	@Override
	public void run() {
		System.out.print("Hello "+Thread.currentThread().getName());
	}
	
}
